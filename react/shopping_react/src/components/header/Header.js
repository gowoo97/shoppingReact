import styles  from './Header.module.css';
import { Link, useNavigate } from "react-router-dom";
import React,{useContext} from 'react';
import { LoginContext } from '../../App';
import {Cookies} from 'react-cookie';
import axios from 'axios';

const Header=()=>{

    const value=useContext(LoginContext);
    const navigate=useNavigate();

    const cookies = new Cookies();
    const handelLogOut=()=>{
        localStorage.removeItem('key');
        value.setLoginStat(false);
    }

    const moveToCart=()=>{
        axios.get("http://localhost:8080/api/cart",{
            headers:{
                Authorization: `Bearer ${localStorage.getItem('key')}`
            }
        }).then((res)=>{
            navigate("/cart");
        }).catch((error)=>{
            alert("로그인 필요!");
        });
    }

    return(
        <>
            <header>
            <div className={ styles.headerTop }>
                 {
                    (value.loginStat===false)?
                    (<Link to='/Login'><span className={styles.headerTopA}>Login</span></Link>):
                    (<Link to='/'><span className={styles.headerTopA} onClick={handelLogOut}>Logout</span></Link>)
                 }
                 <span className={styles.headerTopA}>MyPage</span>
                 <span className={styles.headerTopA} onClick={moveToCart}>Cart</span>

             </div>
             <div className={styles.headerTitle}>

                 <h1>SHOP</h1>


             </div>
         </header>








   </>
    );
}

export default Header;