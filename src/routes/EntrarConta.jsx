import React, { useState } from 'react';
import axios from 'axios';

import Input from '../components/Input';
import ButtonSubmit from '../components/ButtonSubmit';
import './css/Conta.css'



function Conta() {

 
  return (
    <div>

      <form className="form" >
        <p className="title">Entrar</p>
        <p className="message">Faça o login agora e obtenha acesso ao nosso app.</p>
        

        <Input texto={"Usuário"}  />
        
        <Input texto={"Senha"} type={"password"} />


        <ButtonSubmit texto={"Entrar"} />

       
      </form>
      
    </div>
  );
}

export default Conta;