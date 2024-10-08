import React, { useState , useEffect } from 'react'
import { Link, useNavigate } from 'react-router-dom'
import './signin.css'

function Signin() {

  const navigate = useNavigate();
  const [phone, updatephone] = useState("")
  const [password, updatepassword] = useState("")
  const [data,updatedata]=useState(null);

  useEffect(()=>{
    fetch("http://localhost:8000/user").then((res)=>{
      return res.json();
    }).then((resp)=>{
      updatedata(resp);
    }).catch((error)=>{
      alert("data not found")
    })
  },[])

  localStorage.setItem("key",JSON.stringify(data));

  const user_signin = (e) => {

    e.preventDefault()

    let signindata = { phone, password }
    let data = localStorage.getItem("key")

    if (data) {
      let users = JSON.parse(data)
      const user = users.find(
        (res) => res.phone === signindata.phone && res.password === signindata.password
      )
      // alert(user)
      if (user) {
        // alert("Signin successful");
        localStorage.setItem("key1", signindata.phone);
        navigate('/Profile');
      } else {
        alert("invalid phone or password");
      }
    } else {
      alert("no user data found");
    }

  }

  return (
    <>
      <div className='signin'>
        <div className="s1">
          <form action="" onSubmit={user_signin}>
            <h1 className='signinh1'>Sign in to watch</h1>
            <input type="text" onChange={(e) => updatephone(e.target.value)} name='mobile' placeholder='Mobile number' className='s1inp' /><br />
            <input type="text" onChange={(e) => updatepassword(e.target.value)} name='password' placeholder='Enter password' className='s1inp' /><br />
            <input type="submit" value='Next' className='s1but' /><br />
          </form>
          <p className='signinp'>By proceeding you confirm that you are of 18 years or above and accept the <Link to='/' className='s1link'>Terms of Use</Link> & <Link to='/' className='s1link'>Privacy Policy</Link>.</p>
          <p className='signinp'>Not have an account?</p>
          <h3 className='signinh3'><Link to='/Signup' className='signinlink'>Click to Signup</Link></h3>
        </div>
      </div>
    </>
  )
}

export default Signin