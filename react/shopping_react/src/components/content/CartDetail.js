import React from "react";
import styles from './CartDetail.module.css';


const cartDetail=(props)=>{
    return (
        <div style={{border:"1px solid black"}}>
            <div><img></img></div>
            <div>
                <div>title</div>
                <div>price</div>
                <div>cnt</div>
            </div>
        </div>
    );
}


export default cartDetail;