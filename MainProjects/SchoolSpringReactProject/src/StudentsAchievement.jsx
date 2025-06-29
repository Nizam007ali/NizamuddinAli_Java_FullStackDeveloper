import axios from 'axios'
import React, { useEffect, useState } from 'react'
import { useNavigate } from 'react-router-dom'
import './Students.css'


function StudentsAchievement() {

    const navigate = useNavigate();
    const [classname, setClassname] = useState("Class 01");
    const [classId, setClassId] = useState("Class 01");
    const [top5, setTop5] = useState([{
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
    }])
    const [classe, SetClasse] = useState({})
    const [top5c, setTop5c] = useState([{
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
    }])
    const [top5cs, setTop5cs] = useState([{
        "sub1": 0,
        "sub2": 0,
        "sub3": 0,
        "sub4": 0,
        "sub5": 0
    }])

    const fetchTop5 = async () => {
        const res = await axios.get('http://localhost:8080/students/top5')
        // console.log(res)
        setTop5(res.data)
    }

    const fetchTop5c = async (classname) => {
        const res = await axios.get(`http://localhost:8080/students/top5/${classname}`)
        // console.log(res)
        setTop5c(res.data)
    }

    const fetchClass = async (classId) => {
        const response = await axios.get(`http://localhost:8080/classes/${classId}`);
        SetClasse(response.data);
        // console.log(response.data);
    }

    const fetchTop5cs = async (classId) => {
        const response = await axios.get(`http://localhost:8080/students/top5/${classId}/subjects`);
        setTop5cs(response.data);
        // console.log(response.data);
    }

    useEffect(() => {
        fetchTop5();
    }, []);

    useEffect(() => {
        fetchTop5c(classname);
    }, [classname]);

    useEffect(() => {
        fetchTop5cs(classId);
        fetchClass(classId);
    }, [classId]);


    return (
        <div className="students-container">
            <h1 className="students-title">Students Achievements</h1>
            <h2 className="students-title">Overall top 5</h2>
            <div className="student-card">
                <table className="student-table">
                    <thead>
                        <tr>
                            <th>Position</th>
                            <th>Name</th>
                            <th>Class</th>
                            <th>Total</th>
                            <th>Percentage</th>
                        </tr>
                    </thead>
                    <tbody>
                        {
                            top5.map((student, index) => (
                                <tr key={index}>
                                    <td>{index + 1}</td>
                                    <td>{student.name}</td>
                                    <td>{student.studentClass.className}</td>
                                    <td>{student.total}</td>
                                    <td>{student.percentage}</td>
                                </tr>
                            ))
                        }
                    </tbody>
                </table>
            </div>
            <h2 className="students-title">
                Classwise top 5
                <div>{classname}</div>
                <select name="classname" className="sizes" value={classname} onChange={(e) => setClassname(e.target.value)}>
                    <option value="Class 01">1</option>
                    <option value="Class 02">2</option>
                    <option value="Class 03">3</option>
                    <option value="Class 04">4</option>
                    <option value="Class 05">5</option>
                    <option value="Class 06">6</option>
                    <option value="Class 07">7</option>
                    <option value="Class 08">8</option>
                    <option value="Class 09">9</option>
                    <option value="Class 10">10</option>
                    <option value="Class 11">11</option>
                    <option value="Class 12">12</option>
                </select>
            </h2>
            <div className="student-card">
                <table className="student-table">
                    <thead>
                        <tr>
                            <th>Position</th>
                            <th>Name</th>
                            <th>Total</th>
                            <th>Percentage</th>
                        </tr>
                    </thead>
                    <tbody>
                        {
                            top5c.map((student, index) => (
                                <tr key={index}>
                                    <td>{index + 1}</td>
                                    <td>{student.name}</td>
                                    <td>{student.total}</td>
                                    <td>{student.percentage}</td>
                                </tr>
                            ))
                        }
                    </tbody>
                </table>
            </div>
            <h2 className="students-title">
                Classwise Subjectwise top 5
                <div>{classId}</div>
                <select name="classname" className="sizes" value={classId} onChange={(e) => setClassId(e.target.value)}>
                    <option value="Class 01">1</option>
                    <option value="Class 02">2</option>
                    <option value="Class 03">3</option>
                    <option value="Class 04">4</option>
                    <option value="Class 05">5</option>
                    <option value="Class 06">6</option>
                    <option value="Class 07">7</option>
                    <option value="Class 08">8</option>
                    <option value="Class 09">9</option>
                    <option value="Class 10">10</option>
                    <option value="Class 11">11</option>
                    <option value="Class 12">12</option>
                </select>
            </h2>
            <div className="student-card">
                <table className="student-table">
                    <thead>
                        <tr>
                            <th>Position</th>
                            <th>{classe.sub1name}</th>
                            <th>{classe.sub2name}</th>
                            <th>{classe.sub3name}</th>
                            <th>{classe.sub4name}</th>
                            <th>{classe.sub5name}</th>
                        </tr>
                    </thead>
                    <tbody>
                        {
                            top5cs.map((student, index) => (
                                <tr key={index}>
                                    <td>{index + 1}</td>
                                    <td>{student.sub1}</td>
                                    <td>{student.sub2}</td>
                                    <td>{student.sub3}</td>
                                    <td>{student.sub4}</td>
                                    <td>{student.sub5}</td>
                                </tr>
                            ))
                        }
                    </tbody>
                </table>
            </div>
        </div>
    )
}

export default StudentsAchievement