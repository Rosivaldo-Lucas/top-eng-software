import React from 'react';
import ReactDOM from 'react-dom/client';
import './index.css';
import App from './App';
import {createBrowserRouter, RouterProvider } from 'react-router-dom'
import 'tachyons/css/tachyons.min.css'

import Index from './routes/Index'
import Ajuda from './routes/Ajuda';
import ErrorPage from './routes/ErrorPage'
import Conta from './routes/Conta';
import Administrativo from './routes/Administrativo';
import Sobre from './routes/Sobre';


// const router = createBrowserRouter([
//   {
//     path: "/",
//     element: <Index />,
//   },
//   {
//     path: "/ajuda",
//     element: <Ajuda />,
//   },

// ]);

const router = createBrowserRouter([
  {
    path: "/",
    element: <App />,
    errorElement: <ErrorPage />,
    children: [
      {
        path: "/",
        element: <Index />,
      },
      {
        path: "/ajuda",
        element: <Ajuda />,
      },
      {
        path: "/conta",
        element: <Conta />,
      },
      {
        path: "/administrativo",
        element: <Administrativo />,
      },
      {
        path: "/sobre",
        element: <Sobre />,
      },
    ]
  }
]);

const root = ReactDOM.createRoot(document.getElementById('root'));
root.render(
  <React.StrictMode>
    
    <RouterProvider router={router} />
  </React.StrictMode>
);

