import { useEffect } from 'react';
import styles from './Slide.module.css';
import {useState} from 'react';

const Slide = () =>{
    const [count,setCount] =useState(0);

    const rmDot= ()=>{
        const dots=document.getElementsByClassName(styles.dot);
        for(let i =0;i<dots.length;i++){
            let val=dots[i].style.backgroundColor;
            if(val === 'black'){
                dots[i].setAttribute("style","background-color:white");
            }
        }
    }

    const next= ()=>{
        const items=document.getElementsByClassName( styles.slide_item );
        const dots=document.getElementsByClassName( styles.dot);
        
        setCount(count+1);
        rmDot();
        dots[(count+1)%5].setAttribute("style","background-color:black");
        console.log(count);
        if(count === 4){
            for(let i =0 ;i<items.length;i++){
                items[i].setAttribute("style","left:0px");
            }
            setCount(0);
        }
        else{
            for(let i=0;i<items.length;i++){
                let now=items[i].style.left;//현재 위치
                if(now === ""){//현재 움직이지 않았다면
                    now=-976;
                }
                else{
                    now=parseInt(now)-976;
                }
    
                items[i].setAttribute("style","left:"+now+"px");
            }
        }


        
    }    


    useEffect(
        ()=>{
            
           const interval= setInterval(next,5000);
            return  () =>{
                clearInterval(interval);
             } ;
        },[count]
    );
   
    

    return (
        <div className={ styles.slide }> 
            <div className={ styles.slide_container}>
                <div className={styles.slide_item}>1</div>
                <div className={styles.slide_item}>2</div>
                <div className={styles.slide_item}>3</div>
                <div className={styles.slide_item}>4</div>
                <div className={styles.slide_item}>5</div>
            </div>
            <div className={styles.dots}>
                <span className={styles.dot} style={{backgroundColor:"black"}}></span>
                <span className={styles.dot}></span>
                <span className={styles.dot}></span>
                <span className={styles.dot}></span>
                <span className={styles.dot}></span>
            </div>
        </div>
    );

}



export default Slide;