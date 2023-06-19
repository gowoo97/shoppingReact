import './App.css';
import Header from './components/header/Header';
import Nav from './components/nav/Nav';
import Slide from './components/content/Slide';
import Login from './components/content/Login';
import SignUp from './components/content/SignUp';
import React , { Component,createContext,useState}  from 'react';
import Footer from './components/footer/Footer';
import Products from './components/products/Products'
import { BrowserRouter, Route, Switch, Link, Routes } from "react-router-dom";

export const LoginContext=createContext({
  user:'',
  action:()=>{}
});


function App() {

  const [user,setUser]=useState('');

  const value={
    user:user,
    action:setUser
  };

  return (
    
    <BrowserRouter>
    <div className="App">
   
      <LoginContext.Provider value={value}>
        <Header></Header>
      
        <Nav></Nav>
        <Routes>
        <Route path='/' element={<><Slide></Slide><Products></Products></> }></Route>
        <Route path='/Login' element={ <Login/> }></Route>
        <Route path='/SignUp' element={ <SignUp/> }></Route>
        </Routes>
        <Footer></Footer>
        
        </LoginContext.Provider>
  
    </div>
    
    </BrowserRouter>
   
  );
}

export default App;
