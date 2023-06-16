import React from 'react';
import { Link } from 'react-router-dom';

function Header() {
  return (
    <header>
      <div className="bg-black">
        <div className="pa3 flex flex-column items-center">
          <div className="f3 mb4"><Link to="/" className="link dim white mr3">RMW Solutions</Link></div>
          <nav className="flex">
            <Link to="/sobre" className="link dim white mr4 mb3">Sobre</Link>
            <Link to="/ajuda" className="link dim white mr4 mb3">Ajuda</Link>
            <Link to="/administrativo" className="link dim white mr4 mb3">Administrativo</Link>
            <Link to="/nossos-produtos" className="link dim white mr4 mb3">Nossos Produtos</Link>
          </nav>
        </div>
      </div>
    </header>
  );
}

export default Header;
