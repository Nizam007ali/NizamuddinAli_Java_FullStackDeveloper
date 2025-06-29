import { useState } from 'react'
import './App.css'
import { Link, Routes, Route } from 'react-router-dom'
import Classes from './Classes'
import Teachers from './Teachers'
import Students from './Students'
import Student from './Student'
import AddStudent from './AddStudent'
import UpdateStudent from './UpdateStudent'
import StudentsAchievement from './StudentsAchievement'

function App() {

  return (
    <>
      <nav className="navbar">
        <ul className="nav-list">
          <li><Link to="/classes">Classes</Link></li>
          <li><Link to="/students">Students</Link></li>
          <li><Link to="/teachers">Teachers</Link></li>
        </ul>
      </nav>

      <Routes>
        <Route path="/classes" element={<Classes />} />
        <Route path="/students" element={<Students />} />
        <Route path="/students/achievements" element={<StudentsAchievement />} />
        <Route path="/teachers" element={<Teachers />} />
        <Route path="/student/:id" element={<Student />} />
        <Route path="/addstudent" element={<AddStudent />} />
        <Route path="/updatestudent/:id" element={<UpdateStudent />} />
        <Route path="/" element={<div>Welcome to the School Management System</div>} />
      </Routes>
    </>
  )
}

export default App
