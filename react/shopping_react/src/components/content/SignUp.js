import { Link } from "react-router-dom";
import styles from './SignUp.module.css';

const SignUp = () =>{
    return(
        <div id={styles.SignUpForm}>
        <h1>회원가입</h1>
        <div>
            <label>아이디
            <br/>
            <input type="text" id="ID"></input>
            </label>
        </div>
        <div>
            <label>비밀번호
            <br/>
            <input type="password" id="PW"></input>
            </label>
        </div>
        <div>
            <br/>
        <input type="submit" value="회원가입"></input>
        </div>
        
       
        

    </div>
    )


}


export default SignUp;