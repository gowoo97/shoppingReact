
import styles from './nav.module.css';
import { Link } from "react-router-dom";
import React from 'react';
const Nav = () => {
    return(
        <nav>
           <Link to="/"> <div className={styles.navItem}>Home</div></Link>
           <Link> <div className={styles.navItem}>New</div></Link>
           <Link> <div className={styles.navItem}>Best</div></Link>
           <Link> <div className={styles.navItem}>Bag</div></Link>
           <Link> <div className={styles.navItem}>Shirt</div></Link>
           <Link> <div className={styles.navItem}>Outer</div></Link>
           <Link> <div className={styles.navItem}>Event</div></Link>
           <Link> <div className={styles.navItem}>Notice</div></Link>
        </nav>
    );

}


export default Nav;

