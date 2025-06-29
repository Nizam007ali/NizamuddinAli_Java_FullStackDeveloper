import React, { useState } from 'react'
import './Students.css'
import axios from 'axios';
import { useNavigate } from 'react-router-dom';

function AddStudent() {

    const navigate = useNavigate();
    const [student, setStudent] = useState({
        "name": "",
        "email": "",
        "password": "",
        studentClass: { className: "class 1" },
        "sub1": 0,
        "sub2": 0,
        "sub3": 0,
        "sub4": 0,
        "sub5": 0,
        "total": 0,
        "percentage": 0.0,
        "grade": ""
    });

    const handlechange = (e) => {
        setStudent({ ...student, [e.target.name]: e.target.value })
    }

    const handleSubmit = async (e) => {
        e.preventDefault();
        if (student.sub1 < 0 || student.sub1 > 100) {
            alert("Invalid Marks for subject 1 must between 0 to 100");
            return;
        } else if (student.sub2 < 0 || student.sub2 > 100) {
            alert("Invalid Marks for subject 2 must between 0 to 100");
            return;
        } else if (student.sub3 < 0 || student.sub3 > 100) {
            alert("Invalid Marks for subject 3 must between 0 to 100");
            return;
        } else if (student.sub4 < 0 || student.sub4 > 100) {
            alert("Invalid Marks for subject 4 must between 0 to 100");
            return;
        } else if (student.sub5 < 0 || student.sub5 > 100) {
            alert("Invalid Marks for subject 5 must between 0 to 100");
            return;
        }
        const res = await axios.post('http://localhost:8080/students/student/add', student);
        if (res.data) {
            navigate('/students')
        }
    }

    return (
        <div className="addStudent">
            <div className="student-card">
                <form onSubmit={handleSubmit}>
                    <table className="student-table">
                        <tbody>
                            <tr>
                                <td>Name</td>
                                <td><input type="text" name="name" value={student.name} onChange={handlechange} required /></td>
                            </tr>
                            <tr>
                                <td>Email</td>
                                <td><input type="text" name="email" value={student.email} onChange={handlechange} required /></td>
                            </tr>
                            <tr>
                                <td>Password</td>
                                <td><input type="text" name="password" value={student.password} onChange={handlechange} required /></td>
                            </tr>
                            <tr>
                                <td>Class</td>
                                <td>
                                    <select name="class_name" value={student.studentClass.className} onChange={(e) => setStudent({ ...student, studentClass: { ...student.studentClass, className: e.target.value } })} required>
                                        <option value="Class 1">1</option>
                                        <option value="Class 2">2</option>
                                        <option value="Class 3">3</option>
                                        <option value="Class 4">4</option>
                                        <option value="Class 5">5</option>
                                        <option value="Class 6">6</option>
                                        <option value="Class 7">7</option>
                                        <option value="Class 8">8</option>
                                        <option value="Class 9">9</option>
                                        <option value="Class 10">10</option>
                                        <option value="Class 11">11</option>
                                        <option value="Class 12">12</option>
                                    </select>
                                </td>
                            </tr>
                            <tr>
                                <td>Subject 1</td>
                                <td><input type="text" name="sub1" value={student.sub1} onChange={handlechange} required /></td>
                            </tr>
                            <tr>
                                <td>Subject 2</td>
                                <td><input type="text" name="sub2" value={student.sub2} onChange={handlechange} required /></td>
                            </tr>
                            <tr>
                                <td>Subject 3</td>
                                <td><input type="text" name="sub3" value={student.sub3} onChange={handlechange} required /></td>
                            </tr>
                            <tr>
                                <td>Subject 4</td>
                                <td><input type="text" name="sub4" value={student.sub4} onChange={handlechange} required /></td>
                            </tr>
                            <tr>
                                <td>Subject 5</td>
                                <td><input type="text" name="sub5" value={student.sub5} onChange={handlechange} required /></td>
                            </tr>
                            <tr>
                                <td></td>
                                <td colSpan={2}><input type="submit" value="Add Student" /></td>
                            </tr>
                        </tbody>
                    </table>
                </form>
            </div>
        </div>
    )
}

export default AddStudent