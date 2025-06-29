import axios from 'axios';
import React, { useEffect, useState } from 'react'
import { useNavigate, useParams } from 'react-router-dom'
import './Students.css'

function Student() {

    const { id } = useParams();
    const navigate = useNavigate();
    const [student, setStudent] = useState({
        "id": "",
        "name": "",
        "email": "",
        "password": "",
        studentClass: { className: "" },
        "sub1": 0,
        "sub2": 0,
        "sub3": 0,
        "sub4": 0,
        "sub5": 0,
        "total": 0,
        "percentage": 0.0,
        "grade": ""
    });

    const fetch = async () => {
        const res = await axios.get(`http://localhost:8080/students/student/${id}`)
        setStudent(res.data)
    }

    const handleUpdate=async(id)=>{
        navigate(`/updatestudent/${id}`)
    }

    const handleDelete=async(id)=>{
        const res = await axios.delete(`http://localhost:8080/students/student/delete/${id}`)
        navigate('/students')
    }

    useEffect(() => {
        fetch();
    }, []);

    return (
        <div className="students-container">
            <h1 className="students-title">Student id: {id}</h1>
            <div className="student-card">
                <table className="student-table">
                    <tbody>
                        <tr><td>Name</td><td>{student.name}</td></tr>
                        <tr><td>Email</td><td>{student.email}</td></tr>
                        <tr><td>Class</td><td>{student.studentClass?.className}</td></tr>
                        {/* <tr><td colSpan={2}><button onClick={() => referred(id)}>Click here</button></td></tr> */}
                        <tr><td>Password</td><td>{student.password}</td></tr>
                        <tr>
                            <td>Subjects</td>
                            <td>
                                <table className="subjects-table">
                                    <tbody>
                                        <tr>
                                            <td><b>{student.studentClass?.sub1name}</b></td>
                                            <td><b>{student.studentClass?.sub2name}</b></td>
                                            <td><b>{student.studentClass?.sub3name}</b></td>
                                            <td><b>{student.studentClass?.sub4name}</b></td>
                                            <td><b>{student.studentClass?.sub5name}</b></td>
                                        </tr>
                                        <tr>
                                            <td style={{ color: student.sub1 < 33 ? 'red' : 'inherit' }}>{student.sub1}</td>
                                            <td style={{ color: student.sub2 < 33 ? 'red' : 'inherit' }}>{student.sub2}</td>
                                            <td style={{ color: student.sub3 < 33 ? 'red' : 'inherit' }}>{student.sub3}</td>
                                            <td style={{ color: student.sub4 < 33 ? 'red' : 'inherit' }}>{student.sub4}</td>
                                            <td style={{ color: student.sub5 < 33 ? 'red' : 'inherit' }}>{student.sub5}</td>
                                        </tr>
                                    </tbody>
                                </table>
                            </td>
                        </tr>
                        <tr><td>Total</td><td style={{ color: student.total < 165 ? 'red' : 'inherit' }}>{student.total}</td></tr>
                        <tr><td>Percentage</td><td style={{ color: student.percentage < 33 ? 'red' : 'inherit' }}>{student.percentage}</td></tr>
                        <tr><td>Grade</td><td style={{ color: student.grade.includes('F') ? 'red' : student.grade.includes('S') ? 'orange' : 'inherit' }}>{student.grade}</td></tr>
                        <tr><td colSpan={2}><div className="butflex"><button onClick={()=>handleUpdate(student.id)}>update</button><button onClick={()=>handleDelete(student.id)}>delete</button></div></td></tr>
                    </tbody>
                </table>
            </div>
        </div>

    )
}

export default Student