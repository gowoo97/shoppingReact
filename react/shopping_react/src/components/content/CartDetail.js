import React from "react";
import styles from './CartDetail.module.css';
import axios from "axios";

const cartDetail=(props)=>{

    const deleteCart=function(){
        axios.delete("http://localhost:8080/api/cart",{
            headers:{
                Authorization:`Bearer ${localStorage.getItem('key')}`
            },
            data:{
                id:props.id
            }
        }).then((res)=>{
            props.setItem(props.items.filter(item=>item.id!=props.id));
        })
    }

    return (
        <div className={styles.container}>
            <div><img src={props.image}></img></div>
            <div className={styles.content}>
                <div>{props.title}</div>
                <div>{props.price}</div>
                <div>{props.cnt}</div>
                <div className={styles.deleteBtt} onClick={deleteCart}>X</div>
            </div>
        </div>
    );
}


export default cartDetail;