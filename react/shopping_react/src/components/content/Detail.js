import React,{useState,useEffect} from 'react';
import axios from 'axios';
import {useParams} from "react-router-dom";
import styles from './Detail.module.css';

const Detail=(props)=>{

    const { seq } = useParams();
    const [count,setCount]=useState(1);
    const [item,setItem]=useState({});


    useEffect(()=>{
        axios.get(`http://localhost:8080/item/`+seq)
        .then((res)=>{
            setItem(res.data);
        });
    },[]);

    const countUp=function(){
        setCount(count+1);
    }

    const countDown=function(){
        if(count-1<1){
            return;
        }
        setCount(count-1);
    }

    return (
        <div className={styles.detail}>
            <div className={styles.img}>
                <img src={item.image}></img>
            </div>
            <div>
                <h2>{item.title}</h2>
                <p>
                    {item.price}
                </p>

                {count}
                <input type='button' value="+" onClick={countUp}></input>
                <input type='button' value="-" onClick={countDown} ></input>

                <div>
                    <input type='button' value="주문하기"></input>
                    <input type='button' value="장바구니"></input>
                </div>
            </div>
        </div>
    )
}


export default Detail;