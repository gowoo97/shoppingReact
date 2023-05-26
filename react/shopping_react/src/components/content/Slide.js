import { useEffect } from 'react';
import styles from './Slide.module.css';

const Slide = () =>{
    
        

    useEffect(
        ()=>{
            const items=document.getElementsByClassName( styles.slide_item );
            let cnt=0;
           const interval= setInterval(()=>{
                console.log(items);
                

                for(let i=0;i<items.length;i++){
                    let now=items[i].style.left;
                    console.log(now);
                    console.log(cnt);
                    if(now === ""){
                        now=0;
                    }
                    else if(cnt == 4){
                        cnt=0;
                        now=976;
                    }
                    else{
                        now=parseInt(now);
                    }
                    now=now-976;
                   
                    items[i].setAttribute("style","left:"+now+"px");
                }
                cnt++;
            },5000);
            return  () =>{
                clearInterval(interval);
             } ;
        },[]
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
                <span className={styles.dot}></span>
                <span className={styles.dot}></span>
                <span className={styles.dot}></span>
                <span className={styles.dot}></span>

            </div>
        </div>
    );

}



export default Slide;