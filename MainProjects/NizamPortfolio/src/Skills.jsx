import React from 'react';
import './css/About.css';

function Skills() {
  const skills = ["Java", "Spring Boot", "React", "MySQL", "Tailwind CSS", "Git"];
  return (
    <div className="about">
      <h2>Skills</h2>
      <ul>
        {skills.map(skill => (
          <li key={skill}>
            {skill}
          </li>
        ))}
      </ul>
    </div>
  );
}

export default Skills;