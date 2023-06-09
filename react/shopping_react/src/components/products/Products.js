import Item from './Item';
import React from 'react';
const Products = (props)=>{
    return(
        <div>
            <h1 style={{textAlign:'center'}}>New Arrival</h1>
            <Item></Item>
            <Item></Item>
            <Item></Item>
            <Item></Item>
        </div>
    );
}


export default Products;