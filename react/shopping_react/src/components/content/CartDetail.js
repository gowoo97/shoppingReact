import React from "react";
import styles from './CartDetail.module.css';


const cartDetail=(props)=>{
    return (
        <div className={styles.container}>
            <div><img src={props.image}></img></div>
            <div>
                <div>{props.title}</div>
                <div>{props.price}</div>
                <div>{props.cnt}</div>
            </div>
        </div>
    );
}


export default cartDetail;