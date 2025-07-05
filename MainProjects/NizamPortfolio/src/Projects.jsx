import React from 'react';
import './css/Projects.css';

const projects = [
  {
    title: "Portfolio React App",
    description: "My portfolio with freelancing and payment through Razorpay.",
    tech: "React, Razorpay",
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
    <section className="projects-section">
      <h2 className="projects-title">Projects</h2>
      <div className="projects-container">
        {projects.map((project) => (
          <div className="project-card" key={project.title}>
            <h3 className="project-title">{project.title}</h3>
            <p className="project-desc">{project.description}</p>
            <p className="project-tech"><strong>Tech:</strong> {project.tech}</p>
            <div className="project-links">
              <a href={project.github} className="project-link" target="_blank" rel="noreferrer">GitHub</a>
              <a href={project.demo} className="project-link demo" target="_blank" rel="noreferrer">Demo</a>
            </div>
          </div>
        ))}
      </div>
    </section>
  );
}

export default Projects;
