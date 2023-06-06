import { Link } from "react-router-dom";
import styles from './SignUp.module.css';
import React, { useState } from 'react';
import axios from 'axios';

const SignUp = () =>{

    const [inputs,setInputs]=useState({
        id:'',
        pw:''
    });

    const onChange=(e)=>{
        const {value , name} = e.target;
        console.log(value);
        setInputs({
            ...inputs,
            [name]: value
        });
    };


    const {id,pw}=inputs;

    const register=()=>{

        axios.post('http://localhost:8080/user',{
            id:id,
            pw:pw
        }).then((response)=>{
            console.log("hello");
        });
    }


    return(
        <div id={styles.SignUpForm}>
        <h1>회원가입</h1>
        <div>
            <label>아이디
            <br/>
            <input type="text" id="ID" onChange={onChange} name='id'></input>
            </label>
        </div>
        <div>
            <label>비밀번호
            <br/>
            <input type="password" id="PW" onChange={onChange} name='pw'></input>
            </label>
        </div>
        <div>
            <br/>
        <input type="button" value="회원가입" onClick={register}></input>
        </div>
        
       
        

    </div>
    )


}


export default SignUp;