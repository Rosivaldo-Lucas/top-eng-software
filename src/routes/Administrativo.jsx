import React, { useState} from 'react';
import axios from 'axios';

import Input from '../components/Input';
import ButtonSubmit from '../components/ButtonSubmit';
import './css/Conta.css'

function Administrativo() {

  const [produto, setProduto] = useState({
    nome: '',
    valor: '',
    descricao: '',
    quantidade: '',
  });

  const [isSuccess, setIsSuccess] = useState(false);

  const [isError, setIsError] = useState(false);

  const [isSubmitting, setIsSubmitting] = useState(false);

  const limparCampos = () => {
    setProduto({
      nome: '',
      valor: '',
      descricao: '',
      quantidade: '',
    });

  }

  const handleSubmit = (event) => {
    event.preventDefault();
    
    if (isSubmitting) {
      return; // Se já estiver enviando uma requisição, não faça nada
    }

    setIsSubmitting(true);

    // Envia a requisição POST usando Axios
    axios.post('http://localhost:8080/produtos', produto)
      .then(response => {
        console.log(response.data); // Exibe a resposta do backend
        setIsSuccess(true);
        setIsError(false);
        limparCampos();

      })
      .catch(error => {
        console.error(error); // Exibe um eventual erro
        setIsError(true);
        setIsSuccess(false);
      });

    
      setIsSubmitting(false);
  };

  const handleChange = (event) => {
    const { name, value } = event.target;
    setProduto(prevState => ({
      ...prevState,
      [name]: value,
    }));
  };



  return (
    <div>

      <form className="form" onSubmit={handleSubmit}>
        <p className="title">Registro de produtos</p>
        <p className="message">Registre o produto desejado.</p>
        <div className="flex">

          <Input texto={"Nome do produto"} name={'nome'} value={produto.nome} handleChange={handleChange} />

          <Input texto={"Valor"} name={'valor'} value={produto.valor} handleChange={handleChange} />
        </div>

        <div className="flex">

          <Input texto={"Descrição"} name={'descricao'} value={produto.descricao} handleChange={handleChange} />

          <Input texto={"Quantidade"} type={"text"} name={'quantidade'} value={produto.quantidade} handleChange={handleChange} />
        </div>

        <ButtonSubmit texto={"Registrar produto"} />
        {isSuccess && <p>Produto cadastrado com sucesso.</p>}
        {isError && <p>Ocorreu um erro, tente novamente.</p>}

        
      </form>
      
    </div>
  );
}

export default Administrativo;
