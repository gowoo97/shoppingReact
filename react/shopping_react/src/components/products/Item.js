import React from 'react';
import styles from './Product.module.css';

const Item = (props)=>{
    return(
        <div className={styles.product}>
            <div className={styles.itemImg}>
                 <img src={props.img}></img>
            </div>
            <div className={styles.container}>
             <div className={styles.itemTitle}>
                 {props.title}
              </div>
            <span className={styles.itemPrice}>
                {props.price}
            </span>
            </div>

        </div>
    )
}




export default Item;