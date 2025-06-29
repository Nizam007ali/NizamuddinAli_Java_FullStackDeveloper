import React, { useEffect, useState } from 'react'
import axios from 'axios'
import './classes.css'

function Classes() {
  const [classe, setClasse] = useState([{
    className: '',
    classTeacher: '',
    sub1name: '', sub2name: '', sub3name: '', sub4name: '', sub5name: '',
    sub1teacher: '', sub2teacher: '', sub3teacher: '', sub4teacher: '', sub5teacher: ''
  }]);

  const fetch = async () => {
    const response = await axios.get('http://localhost:8080/classes');
    setClasse(response.data);
    console.log(response.data);
  }

  useEffect(() => {
    fetch();
  }, []);

  return (
    <div className="class-container">
      <h1>Classes</h1>
      {
        classe.map((item, index) => (
          <div key={index} className="class-card">
            <h3>{item.className}</h3>
            <p><strong>Class Teacher:</strong> {item.classTeacher}</p>
            <table>
              <thead>
                <tr>
                  <th>Subject No.</th>
                  <th>Subject Name</th>
                  <th>Teacher</th>
                </tr>
              </thead>
              <tbody>
                {[1, 2, 3, 4, 5].map((num) => (
                  <tr key={num}>
                    <td>{num}</td>
                    <td>{item[`sub${num}name`]}</td>
                    <td>{item[`sub${num}teacher`]}</td>
                  </tr>
                ))}
              </tbody>
            </table>
          </div>
        ))
      }
    </div>
  )
}

export default Classes;