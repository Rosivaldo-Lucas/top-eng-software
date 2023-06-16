import React, { useState } from 'react';
import axios from 'axios';

import Input from '../components/Input';
import ButtonSubmit from '../components/ButtonSubmit';
import './css/Conta.css'



function Conta({ doAuth }) {
  return (
    <div>
      <form className="form" >
        <p className="title">Entrar</p>
        <p className="message">Faça o login agora e obtenha acesso ao nosso app.</p>
        
        <Input texto={"Usuário"} handleChange={(e) => setUser(e.target.value)} />
        <Input texto={"Senha"} type={"password"}  handleChange={(e) => setPass(e.target.value)}/>

        <ButtonSubmit onClick={doAuth} texto={"Entrar"} />
      </form>
    </div>
  );
}

export default Conta;
