import React from 'react';

function Input({texto, type='text', name, value, handleChange}) {
  return (
    <label>
      <input required placeholder="" 
        type={type} className="input"
        name={name} value={value} onChange={handleChange} />
      <span>{texto}</span>
    </label>
  );
}

export default Input;
