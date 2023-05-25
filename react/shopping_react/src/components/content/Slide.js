import styles from './Slide.module.css';

const Slide = () =>{
    
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