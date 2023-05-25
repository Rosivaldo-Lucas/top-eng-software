import React from 'react';

function Input({texto, type}) {
  return (
      <label>
          <input required placeholder="" 
          type={type} className="input" />
          <span>{texto}</span>
        </label>
  );
}

export default Input;
