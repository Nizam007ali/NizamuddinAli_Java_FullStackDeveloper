import React from 'react';
import './css/About.css';

const projects = [
  {
    title: "Portfolio react app",
    description: "Myportfolio with freelancing taking payment through razor pay.",
    tech: "React,  razorpay",
    github: "https://github.com/Nizam007ali/NizamuddinAli_Java_FullStackDeveloper/tree/main/MainProjects/NizamPortfolio",
    demo: "https://shiny-dusk-7816ac.netlify.app/",
  },
  {
    title: "E-commerce",
    description: "Full-stack shopping cart with Spring Boot backend.",
    tech: "React, Spring Boot, MySQL",
    github: "https://github.com/yourname/ecommerce",
    demo: "https://ecommerce-demo.netlify.app",
  },
];

function Projects() {
  return (
    <div  className="about">
      <h2>Projects</h2>
      <div>
        {projects.map((project) => (
          <div key={project.title}>
            <h3>{project.title}</h3>
            <p>{project.description}</p>
            <p>Tech: {project.tech}</p>
            <div>
              <a href={project.github} target="_blank" rel="noreferrer">GitHub</a>
              <a href={project.demo} target="_blank" rel="noreferrer">Demo</a>
            </div>
          </div>
        ))}
      </div>
    </div>
  );
}

export default Projects;
