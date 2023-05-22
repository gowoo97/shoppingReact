import './App.css';
import Header from './components/header/Header';
import { BrowserRouter, Route, Switch, Link } from "react-router-dom";
function App() {
  return (
    <BrowserRouter>
    <div className="App">
        <Header></Header>
    </div>
    </BrowserRouter>
  );
}

export default App;
