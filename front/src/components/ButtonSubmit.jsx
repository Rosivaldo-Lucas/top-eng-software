import React from 'react';

function ButtonInput({ texto }) {
  return (
    <button type="submit" className="submit">
      {texto}
    </button>
  );
}

export default ButtonInput;
