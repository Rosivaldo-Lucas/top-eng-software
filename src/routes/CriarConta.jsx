import React from 'react';
import Input from '../components/Input';
import ButtonSubmit from '../components/ButtonSubmit';
import './css/Conta.css'

import { Link } from 'react-router-dom';

function CriarConta() {
  return (
    <div>

      <form className="form" >
        <p className="title">Registro</p>
        <p className="message">Registre-se agora e obtenha acesso ao nosso app.</p>
        <div className="flex">

          <Input texto={"Nome"} />

          <Input texto={"Sobrenome"}/>
        </div>

        <Input texto={"Email"} type={"email"} />
        
        <Input texto={"Senha"} type={"password"} />

        <Input texto={"Confirme sua senha"} type={"password"} />

        <ButtonSubmit texto={"Registrar"} />

        <p className="signin">
          Já possui uma conta? <Link to="/entrar-conta">Entre na sua conta</Link>
        </p>
      </form>
      
    </div>
  );
}

export default CriarConta;