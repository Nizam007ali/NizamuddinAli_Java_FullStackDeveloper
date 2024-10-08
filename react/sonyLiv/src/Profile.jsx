import React, { useEffect, useState } from 'react'
import { useNavigate } from 'react-router-dom';
function Profile() {
  const navigate = useNavigate();
  const [data, updatedata] = useState({
      name: '',
      email: '',
      phone: '',
      password: '',
      image: '',
  })

  useEffect(() => {
      let user_data = localStorage.getItem("key")
      // console.log(user_data)
      let user_email = localStorage.getItem('key1')
      // console.log(user_email)
      let data1 = JSON.parse(user_data)
      let user
      if (data1) {
          user = data1.find((res) => res.phone === user_email)
          if (user) {
              updatedata({
                  name: user.name,
                  email: user.email,
                  phone: user.phone,
                  password: user.password,
                  image: user.image,
              })
          }
          else {
              alert("login again")
              navigate('/Login')
          }
      }
  })

  return (
    <div className='about'>
        <h1 className='Abouth1'>Profile</h1>
        <div className="profile">
            <div className="ah1"><h1>Name</h1></div><div className="v1"><p>{data.name}</p></div>
            <div className="ah1"><h1>E-mail</h1></div><div className="v1"><p>{data.email}</p></div>
            <div className="ah1"><h1>Phone</h1></div><div className="v1"><p>{data.phone}</p></div>
            <div className="ah1"><h1>Password</h1></div><div className="v1"><p>{data.password}</p></div>
            <div className="ah1 ah1a"><h1>Image</h1></div><div className="v1"><img src={data.image} alt="no img found" /></div>
            </div></div>
  )
}

export default Profile