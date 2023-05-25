import React from 'react';
import Input from '../components/Input';
import ButtonSubmit from '../components/ButtonSubmit';
import './css/Conta.css'

function Administrativo() {
  return (
    <div>

      <form className="form" >
        <p className="title">Registro de produtos</p>
        <p className="message">Registre o produto desejado.</p>
        <div className="flex">

          <Input texto={"Nome do produto"} type={"text"} />

          <Input texto={"Valor"} type={"text"} />
        </div>

        <div className="flex">

          <Input texto={"Descrição"} type={"text"} />

          <Input texto={"Quantidade"} type={"text"} />
        </div>

        <ButtonSubmit texto={"Registrar produto"} />

        
      </form>
      
    </div>
  );
}

export default Administrativo;
