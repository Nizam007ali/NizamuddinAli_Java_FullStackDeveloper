import { useState } from 'react'
import './App.css'
import Header from './Header'
import { BrowserRouter as Router, Route, Routes } from 'react-router-dom'
import About from './About'
import Projects from './Projects'
import Skills from './Skills'
import Contact from './Contact'
import Freelance from './Freelance'

function App() {

  return (
    <>
      <Router>
        <Header />
        <Routes>
          <Route path="/" element={<About />} />
          <Route path="/projects" element={<Projects />} />
          <Route path="/skills" element={<Skills />} />
          <Route path="/contact" element={<Contact />} />
          <Route path="/freelance" element={<Freelance />} />
        </Routes>
      </Router>
    </>
  )
}

export default App
