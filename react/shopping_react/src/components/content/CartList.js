
import React, { useEffect ,useState} from 'react';
import axios from 'axios';
import CartDetail from './CartDetail';

const cartList=(props)=>{

    const [items,setItems]=useState([]);

    useEffect(()=>{
        axios.get("http://localhost:8080/api/cart",{
            headers: {Authorization: `Bearer ${localStorage.getItem('key')}`}
        }).then((res)=>{
            setItems(res.data);
            console.log(res.data);
        });
    },[]);

    return(
        <div>
            {
                items.map((item,index)=>{
                    return(
                        <CartDetail key={index} cnt={item.cnt} image={item.image} price={item.price} title={item.title}></CartDetail>
                    );
                })
            }
        </div>
    );
}


export default cartList;