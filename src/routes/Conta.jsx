import React from 'react';
import './css/Conta.css'

function Conta() {
  return (
    
    <form className="form" >
      <p className="title">Registro</p>
      <p className="message">Registre-se agora e obtenha acesso ao nosso app.</p>
      <div className="flex">
        <label>
          <input required placeholder="" 
          type="text" className="input" />
          <span>Nome</span>
        </label>

        <label>
          <input required placeholder="" 
          type="text" className="input" />
          <span>Sobrenome</span>
        </label>
      </div>

      <label>
        <input required placeholder="" 
        type="email" className="input" />
        <span>Email</span>
      </label>

      <label>
        <input required placeholder="" 
        type="password" className="input" />
        <span>Senha</span>
      </label>

      <label>
        <input required placeholder="" 
        type="password" className="input" />
        <span>Confirme sua senha</span>
      </label>

      <button type="submit" className="submit">
        Registrar
      </button>

      <p className="signin">
        Já possui uma conta? <a href="#">Entre na sua conta</a>
      </p>
    </form>
  );
}

export default Conta;