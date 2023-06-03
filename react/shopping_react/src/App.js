import './App.css';
import Header from './components/header/Header';
import Nav from './components/nav/Nav';
import Slide from './components/content/Slide';
import Login from './components/content/Login';
import SignIn from './components/content/SignUp';
import Footer from './components/footer/Footer';
import { BrowserRouter, Route, Switch, Link, Routes } from "react-router-dom";
function App() {
  return (
    <BrowserRouter>
    <div className="App">
        <Header></Header>
        <Nav></Nav>
        <Routes>
        <Route path='/' element={ <Slide/> }></Route>
        <Route path='/Login' element={ <Login/> }></Route>
        <Route path='/SignIn' element={ <SignIn/> }></Route>
        </Routes>
        <Footer></Footer>

    </div>
    </BrowserRouter>
  );
}

export default App;
