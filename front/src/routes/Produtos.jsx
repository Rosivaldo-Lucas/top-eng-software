import React, { useEffect, useState } from 'react';
import axios from 'axios';

function App() {
  const [produtos, setProdutos] = useState([]);

  useEffect(() => {
    const fetchProdutos = async () => {
        try {
        const response = await axios.get('https://backend-api-produtos.onrender.com/produtos');
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
            <p className='description' >{produto.descricao} - 
                            Quantidade: {produto.quantidade}</p>
          </li>
        ))}
      </ul>
    </div>
  );
}

export default App;
