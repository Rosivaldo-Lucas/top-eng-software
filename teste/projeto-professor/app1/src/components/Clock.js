import React, { useState, useEffect } from 'react';

const Clock = () => {
  const [date, setDate] = useState(new Date());

  useEffect(() => {
    const timerID = setInterval(() => {
      setDate(new Date());
    }, 60000);

    return () => {
      clearInterval(timerID);
    };
  }, []);

  const handleUpdate = () => {
    setDate(new Date());
  };

  return (
    <div>
      <h1>{date.toLocaleString()}</h1>
      <button onClick={handleUpdate}>Atualizar</button>
    </div>
  );
};

export default Clock;
