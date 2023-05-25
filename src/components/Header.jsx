import React from 'react';
import { Link } from 'react-router-dom';

function Header() {
  return (
    <header>
      <div className="pa3 bg-black">
        <div className="flex items-center justify-between">
          <div className="f3"><Link to="/" className="link dim white mr3">RMW Solutions</Link></div>
          <nav className="flex">
            <Link to="/conta" className="link dim white mr3">Sua Conta</Link>
            <Link to="/sobre" className="link dim white mr3">Sobre</Link>
            <Link to="/ajuda" className="link dim white mr3">Ajuda</Link>
            <Link to="/administrativo" className="link dim white">Administrativo</Link>
          </nav>
        </div>
      </div>
    </header>
  );
}

export default Header;
