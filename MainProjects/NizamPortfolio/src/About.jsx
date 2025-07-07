import React from 'react';
import './css/About.css';

function About() {
  return (
    <section id="about" className="about">
      <div className="container">
        <h2 className="abouth1">About Me</h2>

        <p className="aboutp1">
          Hello! I'm <span className="aboutp1s1">Nizamuddin Ali</span>, a passionate and detail-oriented full stack developer
          with a strong foundation in modern web development technologies.
        </p>

        <p className="aboutp1">
          <span className="aboutp1s2"><b>Frontend:</b></span> HTML, CSS, JavaScript, React
          <br />
          <span className="aboutp1s2"><b>Backend:</b></span> C++, Java, Hibernate, Spring, Spring Boot
          <br />
          <span className="aboutp1s2"><b>Database:</b></span> MySQL
          <br />
          <span className="aboutp1s2"><b>Tools:</b></span> Git, Jira, Figma, VS Code (React), NetBeans 22, Eclipse (Java)
        </p>

        <p className="aboutp1">
          I enjoy building clean, user-friendly, and high-performance web applications. I continuously challenge myself to
          learn new technologies and apply them in real-world projects that solve problems and add value.
        </p>

        <p className="aboutp1">
          My journey began with a deep curiosity for coding and problem-solving. Since then, I've grown through
          hands-on projects, self-learning, and consistent exploration of full stack development practices. Whether it's
          creating dynamic interfaces with React or designing scalable backend systems with Spring Boot, I'm always
          committed to writing clean, maintainable, and efficient code.
        </p>

        <p className="aboutp1">
          Outside of development, I enjoy playing chess, watching movies, and listening to music. I believe in continuous
          improvement and strive to build software that makes a real impact.
        </p>
        {/* <iframe
          src="/NizamuddinAli_JavaFullStackDeveloper_Resume.pdf"
          width="100%"
          height="500px"
          title="My Resume"
          style={{ border: '1px solid #ccc', borderRadius: '10px' }}
        > 
        </iframe> */}
        <a
          href="/NizamuddinAli_JavaFullStackDeveloper_Resume.pdf"
          download
          className="download-button"
          target="_blank"
          rel="noreferrer"
        >
          📥 Download Resume (PDF)
        </a>
      </div>
    </section>
  );
}

export default About;
