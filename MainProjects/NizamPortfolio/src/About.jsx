import React from 'react'
import './css/About.css'

function About() {
  return (
    <section id="about" className="about">
      <div className="container">
        <h2 className="abouth1">About Me</h2>
        <p className="aboutp1">
          Hello! I'm <span className="aboutp1s1">Nizamuddin Ali</span>, a passionate full stack
          developer with a strong foundation as follows:-
          <br />
          <span className="aboutp1s2"><b>Frontend: </b>Html, Css, JavaScript, React.</span>
          <span className="aboutp1s2"><b>Backend: </b>Cpp, Java, Hibernate, Spring, Spring Boot.</span>
          <span className="aboutp1s2"><b>Database: </b>MySQL.</span>
          <span className="aboutp1s2"><b>Tools: </b> Git, Jeera, Figma, Visual studio(React), Netbeans22 and Eclipse(Java).</span>
        </p>
        <p className="aboutp1">I enjoy building efficient, user-friendly web applications and learning new technologies
          to solve real-world problems.
        </p>
        <p className="aboutp1">
          My journey started with a fascination for coding and technology. Over time, I've honed my skills through
          projects, self-learning, and continuous exploration of modern development practices. Whether it's
          building dynamic UIs with React or designing robust APIs with Spring Boot, I'm always eager to grow and
          contribute.
        </p>
        <p className="aboutp1">
          Outside of tech, I enjoy playic chess, watching movies, and listening music.
          My mission is to keep improving every day and build software that makes a difference.
        </p>
      </div>
    </section>
  )
}

export default About