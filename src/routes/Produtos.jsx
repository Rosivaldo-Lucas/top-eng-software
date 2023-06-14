import React, { useEffect, useState } from 'react';
import axios from 'axios';

function App() {
  const [produtos, setProdutos] = useState([]);

  useEffect(() => {
    const fetchProdutos = async () => {
        try {
        const response = await axios.get('https://teste-backend-render.onrender.com/produtos');
        setProdutos(response.data);
        console.log(response.data)
        
      } catch (error) {
        console.error(error);
      }
    };

    fetchProdutos();
  }, []);

  return (
    <div>
      <h1>Lista de Produtos</h1>
      <ul>
      {produtos.map((produto) => (
          <li key={produto.id}>
            {produto.nome} - R${produto.valor}
          </li>
        ))}
      </ul>
    </div>
  );
}

export default App;
