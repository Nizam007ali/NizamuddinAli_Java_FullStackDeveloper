import axios from 'axios';
import React, { useEffect, useState } from 'react'
import './Students.css'
import { Link, useNavigate } from 'react-router-dom';

function Students() {

    const navigate = useNavigate();
    const [pages, setPages] = useState(0);
    const [page, setPage] = useState(0);
    const [size, setSize] = useState(5);
    const [students, setStudents] = useState([{
        "id": "",
        "name": "",
        "email": "",
        "password": "",
        "class_name": "",
        "sub1": 0,
        "sub2": 0,
        "sub3": 0,
        "sub4": 0,
        "sub5": 0,
        "total": 0,
        "percentage": 0.0,
        "grade": ""
    }]);

    const fetch = async () => {
        const res = await axios.get('http://localhost:8080/students', {
            params: { page: page, size: size }
        })
        setStudents(res.data.content)
        setPages(res.data.totalPages)
    }

    const handleUpdate = async (id) => {
        navigate(`/updatestudent/${id}`)
    }

    const handleDelete = async (id) => {
        const res = await axios.delete(`http://localhost:8080/students/student/delete/${id}`)
        navigate('/students')
        fetch()
    }

    const referred = (id) => {
        navigate(`/student/${id}`);
    }

    const achievements = () => {
        navigate(`/students/achievements`);
    }

    const add = () => {
        navigate('/addstudent');
    }

    useEffect(() => {
        fetch()
    }, [page,size])

    return (
        <div className="students-container">
            <h1 className="students-title">Students <button onClick={achievements}>Achievements</button> <button onClick={add}>Add</button></h1>
            <select className="sizes" onChange={(e)=>setSize(e.target.value)}>
                {[...Array(16)].map(
                    (_,index)=>{
                        const value = index + 5;
                        return(
                            <option key={value} value={value}>{value}</option>
                        );
                    }
                )}
            </select>
            <div className='pages'>
                {
                [...Array(pages)].map((_,index)=>(
                    <div key={index} className={`page ${index === page ? 'active' : ''}`} onClick={()=>{
                        setPage(index) 
                        fetch(page)
                    }}>
                        {index+1}
                    </div>
                ))
                }
            </div>
            {students.map((item, index) => (
                <div key={index} className="student-card">
                    <table className="student-table">
                        <tbody>
                            <tr><td>Name</td><td>{item.name}</td></tr>
                            <tr><td>Email</td><td>{item.email}</td></tr>
                            <tr><td>Class</td><td>{item.studentClass?.className}</td></tr>
                            <tr><td colSpan={2}><div className="butflex"><button onClick={() => handleUpdate(item.id)}>update</button><button onClick={() => handleDelete(item.id)}>delete</button><button onClick={() => referred(item.id)}>Click here to get record</button></div></td></tr>
                        </tbody>
                    </table>
                </div>
            ))}
        </div>
    );
}

export default Students