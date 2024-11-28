import React, { useState, useEffect } from 'react'
import { useNavigate } from 'react-router-dom'
import './Signup.css'
import {toast,ToastContainer} from 'react-toastify'

function Signup() {

  const usenavigate = useNavigate();

  const [name,updatename] = useState("");
  const [email,updateemail] = useState("");
  const [phone,updatephone] = useState("");
  const [password,updatepassword] = useState("");
  const [cpassword,updatecpassword] = useState("");

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


  // console.log(data)
  const add_user_data=(e)=>{

    e.preventDefault();
    if(password==cpassword){
    const user_data={name,email,phone,password};

    var isData;
    data.map((item)=>{
      if(user_data.email==item.email || user_data.phone==item.phone){
        isData='true';
      while(true) {
          break;
      }
      }
    })
    if(isData=='true'){
      toast.error("already exist");
      usenavigate("/signin");
    }
    else{
    fetch("http://localhost:8000/user",{
      method:"POST",
      headers:{"content-type":"application/json"},
      body:JSON.stringify(user_data)
    }).then((res)=>{
      toast.success("added successfully");
      usenavigate("/signin");
    }).catch((err)=>{
      toast.error("not added")
    })
  }} else {
    toast.info("Both password must be same");
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