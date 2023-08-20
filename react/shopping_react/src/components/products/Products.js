import Item from './Item';
import React,{ useEffect,useState } from 'react';
import axios from 'axios';
import { Link } from "react-router-dom";

const Products = (props)=>{

    const [items,setItems]=useState([]);

    useEffect(()=>{
        axios.get("http://localhost:8080/item/cnt/4").then((res)=>{
            setItems(res.data);
        })
    },[]);
    console.log(items);
    return(
        <div>
            <h1 style={{textAlign:'center'}}>New Arrival</h1>
            {items.map(function(item){
              return <Link to={`/detail/${item.seq}`} key={item.seq}><Item img={item.image} title={item.title} price={item.price} key={item.seq}></Item></Link>
            })}
        </div>
    );
}


export default Products;