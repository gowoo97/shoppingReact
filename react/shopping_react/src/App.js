import './App.css';
import Header from './components/header/Header';
import Nav from './components/nav/Nav';
import Slide from './components/content/Slide';
import { BrowserRouter, Route, Switch, Link } from "react-router-dom";
function App() {
  return (
    <BrowserRouter>
    <div className="App">
        <Header></Header>
        <Nav></Nav>
        <Slide></Slide>
    </div>
    </BrowserRouter>
  );
}

export default App;
