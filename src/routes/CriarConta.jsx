import React, { useState} from 'react';
import axios from 'axios';

import Input from '../components/Input';
import ButtonSubmit from '../components/ButtonSubmit';
import './css/Conta.css'

import { Link } from 'react-router-dom';



function CriarConta() {

  const [usuario, setUsuario] = useState({
    nome: '',
    username: '',
    password: '',
  });

  const [confirmaSenha, setConfirmaSenha] = useState({
    confirma_senha: '',
  })

  const [isSuccess, setIsSuccess] = useState(false);

  const [isError, setIsError] = useState(false);

  //Não consegui fazer essa confirmação de senhas iguais ainda
  const [senhaConfirmada, setSenhaConfirmada] = useState(true);

  const limparCampos = () => {
    setUsuario({
      nome: '',
      username: '',
      password: '',
    });

    setConfirmaSenha({
      confirma_senha: '',
    });

  }

  const handleSubmit = (event) => {
    event.preventDefault();

    

    if(!senhaConfirmada){
      return;
    }
    

    
    
    // Envia a requisição POST usando Axios
    axios.post('https://teste-backend-render.onrender.com/usuarios', usuario)
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

      //setSenhaConfirmada(false);


  };

  const verificaSenha = () => {
    if (usuario.password === confirmaSenha.confirma_senha) {
      return true;
    } else {
      return false;
    }
  };

  const handleChange = (event) => {
    const { name, value } = event.target;
    setUsuario(prevState => ({
      ...prevState,
      [name]: value,
    }));
  };

  const handleConfirmaSenha = (event) => {
    const { name, value } = event.target;
    setConfirmaSenha(prevState => ({
      ...prevState,
      [name]: value,
    }));
  };
  

  return (
    <div>

      <form className="form" onSubmit={handleSubmit} >
        <p className="title">Registro</p>
        <p className="message">Registre-se agora e obtenha acesso ao nosso app.</p>
      

        <Input texto={"Nome e Sobrenome"} name={'nome'} value={usuario.nome} handleChange={handleChange} />

        <Input texto={"Nome de usuário"} name={'username'} value={usuario.username} handleChange={handleChange}/>
      
        <Input texto={"Senha"} type={"password"} name={'password'} value={usuario.password} handleChange={handleChange} />

        
        <Input texto={"Confirme sua senha"} type={"password"} name={'confirma_senha'} value={confirmaSenha.confirma_senha} handleChange={handleConfirmaSenha} />
        
        {!verificaSenha() && <p>A confirmação deve ser igual a senha.</p>}

        <ButtonSubmit texto={"Registrar"} />

        {isSuccess && <p>Usuário cadastrado com sucesso.</p>}
        {isError && <p>Ocorreu um erro, tente novamente.</p>}

        <p className="signin">
          Já possui uma conta? <Link to="/entrar-conta">Entre na sua conta</Link>
        </p>
      </form>
      
    </div>
  );
}

export default CriarConta;