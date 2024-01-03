import styles  from './Header.module.css';
import { Link } from "react-router-dom";
import React,{useContext} from 'react';
import { LoginContext } from '../../App';
import {Cookies} from 'react-cookie';

const Header=()=>{

    const value=useContext(LoginContext);

    const cookies = new Cookies();
    const handelLogOut=()=>{
        localStorage.removeItem('key');
        value.setLoginStat(false);
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
                 <Link><span className={styles.headerTopA}>MyPage</span></Link>
                 <Link to='cart'><span className={styles.headerTopA}>Cart</span></Link>

             </div>
             <div className={styles.headerTitle}>

                 <h1>SHOP</h1>


             </div>
         </header>








   </>
    );
}

export default Header;