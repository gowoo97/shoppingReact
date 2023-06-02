import { Link } from "react-router-dom";
import styles from './SignIn.module.css';

const SignIn = () =>{
    return(
        <div id={styles.SignInForm}>
        <h1>회원가입</h1>
        <div>
            <label for="ID">아이디</label>
            <br/>
            <input type="text" id="ID"></input>
        </div>
        <div>
            <label for="PW">비밀번호</label>
            <br/>
            <input type="password" id="PW"></input>
        </div>
        <div>
            <br/>
        <input type="submit" value="로그인"></input>
        </div>
        
       
        

    </div>
    )


}


export default SignIn;