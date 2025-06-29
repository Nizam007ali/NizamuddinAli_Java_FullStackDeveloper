import axios from 'axios';
import React, { useEffect, useState } from 'react';
import './Teachers.css';
import './Students.css'

function Teachers() {
    const [teachers, setTeachers] = useState([]);
    const [classes, setClasses] = useState([]);
    const [page,setPage] = useState(0);
    const [pages, setPages] = useState(0);
    const [size,setSize] = useState(3);

    useEffect(() => {
        const fetchTeachers = async () => {
            try {
                const res = await axios.get('http://localhost:8080/teachers');
                setTeachers(res.data);
                const res1 = await axios.get('http://localhost:8080/classes');
                setClasses(res1.data);
                console.log(res
                    .data)
                console.log(res1.data)
            } catch (err) {
                console.error('Error fetching teachers:', err);
            }
        };
        fetchTeachers();
    }, []);

    const getTeachingDetails = (teacherName) => {
        const teachingList = [];

        classes.forEach(cls => {
            if (cls.sub1teacher == teacherName) teachingList.push({ className: cls.className, period: 1 });
            if (cls.sub2teacher == teacherName) teachingList.push({ className: cls.className, period: 2 });
            if (cls.sub3teacher == teacherName) teachingList.push({ className: cls.className, period: 3 });
            if (cls.sub4teacher == teacherName) teachingList.push({ className: cls.className, period: 4 });
            if (cls.sub5teacher == teacherName) teachingList.push({ className: cls.className, period: 5 });
        });
        // console.log(teachingList)
        return teachingList;
    };

    const achievements=()=>{

    }

    const add=()=>{

    }

    return (
        <div className="students-container">
            <h1 className="students-title">Teachers<button onClick={achievements}>Achievements</button> <button onClick={add}>Add</button></h1>
            <select className="sizes" onChange={(e)=>setSize(e.target.value)}>
                {[...Array(8)].map(
                    (_,index)=>{
                        const value = index + 3;
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
            <div className="gridcontainer">
                {teachers.map((item, index) => {
                    const teachingSubjects = getTeachingDetails(item.name);
                    return (
                        <table key={index} className="teacher-card">
                            <tbody>
                                <tr><td>Name</td><td><h3>{item.name}</h3></td></tr>
                                <tr><td>Email</td><td><h3>{item.email}</h3></td></tr>
                                <tr><td>Subjects</td><td><h3>{item.subjects}</h3></td></tr>
                                <tr>
                                    <td>Class Teacher Of</td>
                                    <td><h4>{item.classTeacherOf || 'N/A'}</h4></td>
                                </tr>
                                <tr>
                                    <td>Teaches In</td>
                                    <td>

                                        <table key={index}>
                                            <thead>
                                                <tr><th>Class</th><th>Period</th></tr>
                                            </thead>
                                            <tbody>
                                                    {teachingSubjects.length > 0 ? (
                                                        teachingSubjects.map((t, i) => (
                                                            <tr key={i}><td>{t.className.slice(6,8)}</td><td>{t.period}</td></tr>
                                                        ))
                                                    ) : (
                                                        <tr><td colSpan={2}>Not assigned to any class</td></tr>
                                                    )}
                                            </tbody>
                                        </table>
                                    </td>
                                </tr>
                            </tbody>
                        </table>
                    )
                })}
            </div>
        </div>
    );
}

export default Teachers;
