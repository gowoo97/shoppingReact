import styles from './Login.module.css';
import { Link } from "react-router-dom";
import React from 'react';
const Login = () => {

    return(
        <div id={styles.LoginForm}>
            <h1>로그인</h1>
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
            <div>
                <p>
                회원이 아니신가요? <Link to="/signUp"><span>회원가입</span></Link>
                </p>
            </div>
           
            

        </div>
    );


}



export default Login;