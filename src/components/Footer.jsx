import React from 'react';

function Footer() {
  const currentYear = new Date().getFullYear();

  return (
    <footer className="white tc pa3 bottom-0 left-0 right-0">
      <div>&copy; {currentYear} RMW Solutions | All rights reserved</div>
    </footer>
  );
}

export default Footer;