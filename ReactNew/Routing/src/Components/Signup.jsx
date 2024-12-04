import React, { useState, useEffect, useRef, useId } from 'react'
import { useNavigate } from 'react-router-dom'

const Signup = () => {
    const user_data = [{
        id: 1,
        name: 'u1',
        email: 'u1@gmail.com',
        mobile: '9874563210',
        password: '123'
    }, {
        id: 2,
        name: 'u2',
        email: 'u2@gmail.com',
        mobile: '7894563210',
        password: '321'
    }
    ]
    localStorage.setItem('users', JSON.stringify(user_data))
    const usenavigate = useNavigate();
    const Signup = () => {
        usenavigate("/login")
    }
    return (
        <div>
            <h1>Signup Page</h1>
            <input type="text" name='name' placeholder='Enter your name' /><br />
            <input type="text" name='email' placeholder='Enter your email' /><br />
            <input type="text" name='mobile' placeholder='Enter your mobile' /><br />
            <input type="text" name='password' placeholder='Enter your password' /><br />
            <button onClick={Signup}>Signup</button>
        </div>
    )
}

export default Signup