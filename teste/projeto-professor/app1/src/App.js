import './App.css';

import Clock from './components/Clock';
import Contador from './components/Contador'

function App() {
  return (
    <div className="App">
       <Contador contador/>
       <Clock />
    </div>
  );
}

export default App;
