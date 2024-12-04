import React from 'react'

const Login = () => {
    const users = localStorage.getItem("users")
    
  return (
    <div>
        <h1>Login</h1>
        <h3>{users}</h3>    
    </div>
  )
}

export default Login