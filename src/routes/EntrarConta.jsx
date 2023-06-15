import React from 'react';
import Input from '../components/Input';
import ButtonSubmit from '../components/ButtonSubmit';
import './css/Conta.css'

import { Link } from 'react-router-dom';

function Conta() {
  return (
    <div>

      <form className="form" >
        <p className="title">Entrar</p>
        <p className="message">Faça o login agora e obtenha acesso ao nosso app.</p>
        

        <Input texto={"Email"} type={"email"} />
        
        <Input texto={"Senha"} type={"password"} />


        <ButtonSubmit texto={"Registrar"} />

        <p className="signin">
          Ainda não possui uma conta? <Link to="/criar-conta">Registre-se aqui!</Link>
        </p>
      </form>
      
    </div>
  );
}

export default Conta;