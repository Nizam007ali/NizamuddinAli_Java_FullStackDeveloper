import { useState } from 'react'
import { BrowserRouter,Routes,Route } from 'react-router-dom'
import Nav from './Components/Nav'
import Signup from './Components/Signup'
import Login from './Components/Login'
import Home from './Components/Home'
function App() {
  return (
    <>
    <BrowserRouter>
    <Nav/>
    <Routes>
    <Route path='/' element={<Home/>}></Route>
    <Route path='/signup' element={<Signup/>}></Route>
    <Route path='/login' element={<Login/>}></Route>
    </Routes>
    </BrowserRouter>
    </>
  )
}

export default App
