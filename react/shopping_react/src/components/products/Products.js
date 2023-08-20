import Item from './Item';
import React,{ useEffect,useState } from 'react';
import axios from 'axios';

const Products = (props)=>{

    const [items,setItems]=useState([]);

    useEffect(()=>{
        axios.get("http://localhost:8080/item").then((res)=>{
            setItems(res.data);
        })
    },[]);

    return(
        <div>
            <h1 style={{textAlign:'center'}}>New Arrival</h1>
            {items.map(function(item){
              return  <Item img={item.image} title={item.title} price={item.price}></Item>
            })}
        </div>
    );
}


export default Products;