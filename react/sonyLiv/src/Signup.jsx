import React, { useState, useEffect } from 'react'
import { useNavigate } from 'react-router-dom'
import './Signup.css'

function Signup() {

  const usenavigate = useNavigate();

  const [name, updatename] = useState("");
  const [email, updateemail] = useState("");
  const [phone, updatephone] = useState("");
  const [password, updatepassword] = useState("");
  const [cpassword, updatecpassword] = useState("");
  let data = localStorage.getItem("key")

  const add_user_data = (e) => {

    e.preventDefault();

    if (password == cpassword) {
      const user_data = { name, email, phone, password };
      let users = JSON.parse(data)

      const user = users.find(
        (res) => res.phone === user_data.phone || res.email === user_data.email
      )

      if (user) {
        alert("already exist");
      }
      else {
        fetch("http://localhost:8000/user", {
          method: "POST",
          headers: { "content-type": "application/json" },
          body: JSON.stringify(user_data)
        }).then((res) => {
          alert("added successfully");
          usenavigate("/Signin");
        }).catch((err) => {
          alert("not added")
        })
      }
    } else {
      alert("Both password must be same");
    }
  }

  return (
    <>
      <div className="signup">
        <div className="s2"><h1 className='signuph1'>Signup</h1>
          <form action="" onSubmit={add_user_data}>
            <input className='s2inp' type="text" onChange={(e) => updatename(e.target.value)} placeholder='name' name='name' required /><br />
            <input className='s2inp' type="text" onChange={(e) => updateemail(e.target.value)} placeholder='email' name='email' required /><br />
            <input className='s2inp' type="text" onChange={(e) => updatephone(e.target.value)} placeholder='phone' name='phone' required /><br />
            <input className='s2inp' type="text" onChange={(e) => updatepassword(e.target.value)} placeholder='password' name='pwd' required /><br />
            <input className='s2inp' type="text" onChange={(e) => updatecpassword(e.target.value)} placeholder='re-enter password' name='pwd1' required /><br />
            <input className='s2but' type="submit" />
          </form>
        </div>
      </div>
    </>
  )
}

export default Signup