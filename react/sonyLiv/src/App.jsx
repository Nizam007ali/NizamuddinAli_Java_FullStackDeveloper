import { useState } from 'react'
import { BrowserRouter,Routes,Route } from 'react-router-dom';
import Signin from './Signin.jsx'
import Signup from './Signup.jsx'
import Profile from './Profile.jsx'
import Nav from './Nav.jsx'
import Subscribe from './Subscribe.jsx';
import Search from './Search.jsx';
import Index1 from './Index1.jsx';

export default function App() {

  return (
    <>
    <BrowserRouter>
    {<Nav/>}
    {<Index1/>}
    <Routes>
    {/* <Route path='About' element={<About/>} ></Route> */}
    <Route path='Signin' element={<Signin/>} ></Route>
    <Route path='Signup' element={<Signup/>} ></Route>
    <Route path='Profile' element={<Profile/>} ></Route>
    <Route path='Subscribe' element={<Subscribe/>} ></Route>
    <Route path='Search' element={<Search/>} ></Route>
    </Routes>
    </BrowserRouter>
    
    </>
  )
}