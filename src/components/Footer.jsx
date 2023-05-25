import React from 'react';

function Footer() {
  const currentYear = new Date().getFullYear();

  return (
    <footer className="bg-black white tc pa3">
      <div>&copy; {currentYear} RMW Solutions | All rights reserved</div>
    </footer>
  );
}

export default Footer;