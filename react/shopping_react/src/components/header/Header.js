import styles  from './Header.module.css';
import { Link } from "react-router-dom";


const Header=()=>{
    return(
        <>
        <header>
           <div className={ styles.headerTop }>
                
                <Link to="/Login"><span className={styles.headerTopA}>Login</span></Link>
                <Link><span className={styles.headerTopA}>MyPage</span></Link>
                <Link><span className={styles.headerTopA}>Cart</span></Link>

            </div>
            <div className={styles.headerTitle}>
                
                <h1>SHOP</h1>
                
                
            </div>
        </header>
   </>
    );
}

export default Header;