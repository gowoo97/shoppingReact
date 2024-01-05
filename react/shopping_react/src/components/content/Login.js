import styles from './Login.module.css';
import { Link, useNavigate } from "react-router-dom";
import React, { useContext, useState } from 'react';
import { LoginContext } from '../../App';
import axios from 'axios';
import {Cookies} from 'react-cookie';


const Login = () => {

    const cookies = new Cookies();
    const value=useContext(LoginContext);
    const navigate=useNavigate();
    const [id,setId]=useState('');
    const [pw,setPw]=useState('');
    const handleLogin=()=>{



        axios.post("http://localhost:8080/auth/signIn",{
            id:id,
            pw:pw
        }).then(res=>{
            localStorage.setItem('key',res.data.token);
            value.setLoginStat(true);
            navigate("/");
        });


    }

    const handleId=(e)=>{
        console.log(e.target.value);
        setId(e.target.value);
    }

    const handlePw=(e)=>{
        console.log(e.target.value);
        setPw(e.target.value);
    }

    return(


            <div id={styles.LoginForm}>
            <h1>로그인</h1>
            <div>
                <label for="ID">아이디</label>
                <br/>
                <input type="text" id="ID" onChange={handleId}></input>
            </div>
            <div>
                <label for="PW">비밀번호</label>
                <br/>
                <input type="password" id="PW" onChange={handlePw} ></input>
            </div>
            <div>
                <br/>
            <input type="button" value="로그인" onClick={handleLogin}></input>
            </div>
            <div>
                <p>
                회원이 아니신가요? <Link to="/signUp"><span>회원가입</span></Link>
                </p>
            </div>



        </div>

        )





}



export default Login;