import React from 'react';
import './css/Skill.css';

function Skills() {
  return (
    <div className="skill">
      <h2>Skills</h2>
      <div>
        <div className="acquired">
          <b>Skills I Have Acquired:</b>
          <ul>
            <li><a href="#frontend"><b>Frontend:</b></a> <a href="#html">HTML</a>, <a href="#css">CSS</a>, <a href="#javascript">JavaScript</a>, <a href="#react">React</a></li>
            <li><a href="#backend"><b>Backend:</b></a> <a href="#cpp">C++</a>, <a href="#java">Java</a>, <a href="#hibernate">Hibernate</a>, <a href="#spring">Spring</a>, <a href="#springboot">Spring Boot</a></li>
            <li><a href="#database"><b>Database:</b></a> <a href="#mysql">MySQL</a></li>
            <li><a href="#tools"><b>Tools:</b></a> <a href="#git">Git</a>, <a href="#jira">Jira</a>, <a href="#figma">Figma</a>, <a href="#vscode">VS Code</a>, <a href="#netbeans">NetBeans</a>, <a href="#eclipse">Eclipse</a></li>
          </ul>
        </div>
        <div>
          <h3 id='frontend'>🎨 Frontend</h3>
          <p>Proficient in HTML, CSS, and JavaScript to build responsive, visually appealing user interfaces. Experienced in
            React for component-based architecture, state management, and dynamic rendering. Skilled in creating clean
            layouts, transitions, and accessible designs. Focused on seamless user experience and optimized performance
            across devices using modern frontend tools and practices.</p>
          <h4 id='html'>HTML</h4>
          <p>HTML (HyperText Markup Language) is the backbone of web content structure. It uses elements and tags to define
            headers, paragraphs, links, forms, and multimedia. Mastery of HTML enables semantic, accessible layouts and
            proper SEO structure. It integrates seamlessly with CSS and JavaScript for building interactive and responsive
            web pages.</p>
          <h4 id='css'>CSS</h4>
          <p>CSS (Cascading Style Sheets) enhances web aesthetics by styling HTML elements. It controls layout, color,
            fonts, and responsiveness. With Flexbox, Grid, animations, and media queries, CSS creates visually appealing
            interfaces. Proficiency ensures consistency and adaptability across devices, contributing to polished UI/UX in
            modern web development.</p>
          <h4 id='javascript'>JavaScript</h4>
          <p>JavaScript adds interactivity and dynamic behavior to web applications. It handles DOM manipulation, event
            handling, and asynchronous operations using callbacks, promises, or async/await. It's essential for client-side
            logic and APIs. Combined with modern frameworks, JavaScript enables scalable, high-performance web apps with
            real-time features and responsive interfaces.</p>
          <h4 id='react'>React</h4>
          <p>React is a JavaScript library for building fast, modular UIs. It leverages reusable components, hooks for
            state and lifecycle management, and virtual DOM for efficient updates. React simplifies complex UI rendering
            and integrates easily with backend APIs, making it ideal for SPAs and dynamic, real-time web applications.</p>
        </div>
        <div>
          <h3 id='backend'>🔧 Backend</h3>
          <p>Experienced in C++ and Java for developing robust, scalable backend systems. Skilled with Spring and Spring
            Boot for RESTful API development, dependency injection, and service layers. Proficient in Hibernate for ORM and
            efficient database access. Adept at integrating secure, modular backend logic with frontend interfaces in
            enterprise-grade applications.</p>
          <h4 id='cpp'>C++</h4>
          <p>C++ is a high-performance language used in system programming, game engines, and embedded systems. It supports
            object-oriented and low-level memory manipulation. Mastering C++ builds strong logic and algorithmic thinking.
            It's ideal for performance-critical applications where direct hardware control and resource optimization are
            essential.</p>
          <h4 id='java'>Java</h4>
          <p>Java is a platform-independent, object-oriented language known for reliability and scalability. It powers
            Android apps, enterprise applications, and backend systems. With robust libraries, multi-threading, and
            garbage collection, Java enables clean, maintainable code. Its integration with frameworks like Spring makes
            it a core language in backend development.</p>
          <h4 id='hibernate'>Hibernate</h4>
          <p>Hibernate is a Java ORM tool that maps Java classes to database tables. It simplifies database CRUD
            operations by handling SQL internally. Features include lazy loading, caching, and transaction management.
            Hibernate reduces boilerplate code and ensures efficient database communication, especially in Spring-based
            Java applications</p>
          <h4 id='spring'>Spring</h4>
          <p>Spring is a powerful Java framework for enterprise applications. It promotes loose coupling using dependency
            injection, AOP, and modular components. Spring supports testability, security, and robust backend logic. It’s
            often used with Hibernate and Spring Boot to develop scalable, production-ready applications following best
            practices.</p>
          <h4 id='springboot'>Spring Boot</h4>
          <p>Spring Boot simplifies Spring-based development by providing production-ready defaults, embedded servers,
            and auto-configuration. It reduces setup time and minimizes boilerplate code. Ideal for microservices and
            REST API development, it integrates easily with JPA, Spring Security, and monitoring tools for robust
            enterprise applications.</p>
        </div>
        <div>
          <h3 id='database'>🗄️ Database</h3>
          <p>Proficient in MySQL for managing structured data and implementing relational database schemas. Experienced in
            designing normalized tables, writing optimized SQL queries, and integrating databases with backend services.
            Skilled in managing transactions, indexing, and ensuring data integrity. Familiar with using MySQL in both
            development and production environments for secure data storage.</p>
        </div>
        <h4 id='mysql'>MySQL</h4>
        <p>MySQL is a widely used relational database management system. It supports structured data storage with SQL
          queries for CRUD operations. Features include indexing, constraints, transactions, and joins. MySQL
          integrates well with Java through JDBC and ORM tools like Hibernate. It’s ideal for scalable, data-driven web
          applications.</p>
        <div>
          <h3 id='tools'>🛠️ Tools</h3>
          <p>Hands-on experience with Git for version control and collaborative development workflows. Skilled with Jira
            for agile project tracking. Use Figma to create and interpret UI/UX designs. Develop React projects in Visual
            Studio Code and Java applications in NetBeans 22 and Eclipse IDEs. Comfortable across tools for efficient and
            organized development.</p>
          <h4 id='git'>Git</h4>
          <p>Git is a distributed version control system enabling collaborative development. It tracks changes, manages
            branches, and supports rollbacks. Platforms like GitHub and GitLab enhance workflow visibility and code
            sharing. Mastery of Git ensures team efficiency, safe experimentation, and project history integrity during
            software development.</p>
          <h4 id='jira'>Jira</h4>
          <p>Jira is a project management tool for agile teams. It facilitates task tracking, sprint planning, bug
            tracking, and workflow automation. With boards, backlogs, and custom fields, Jira enhances productivity and
            team collaboration. It integrates with Git, CI/CD tools, and reporting dashboards for streamlined development
            cycles.</p>
          <h4 id='figma'>Figma</h4>
          <p>Figma is a cloud-based UI/UX design tool for creating interactive wireframes, prototypes, and design systems.
            It allows real-time collaboration and version tracking. Developers use Figma to interpret layouts and convert
            them into pixel-perfect code. It’s essential for responsive design planning and user-focused development
            workflows.</p>
          <h4 id='vscode'>Visual Studio Code</h4>
          <p>VS Code is a lightweight yet powerful IDE, ideal for React development. It supports extensions, intelligent
            code completion, debugging, and Git integration. With features like ESLint, Prettier, and JSX support, it
            streamlines the frontend development workflow. Customizable themes and shortcuts enhance productivity and
            code quality.</p>
          <h4 id='netbeans'>NetBeans</h4>
          <p>NetBeans is a comprehensive Java IDE that supports Maven, Gradle, and various application servers. It
            features intelligent code completion, debugging tools, and integrated Git support. Great for building Java
            desktop, web, or enterprise apps with smooth navigation, project templates, and fast error detection.</p>
          <h4 id='eclipse'>Eclipse</h4>
          <p>Eclipse is a robust, extensible IDE widely used in Java development. It supports plugins, JUnit testing,
            and tools for Spring and Hibernate integration. With support for Git, server deployments, and database
            connectors, Eclipse helps streamline full-stack application development with modular architecture and
            efficient debugging tools.</p>
        </div>
      </div>
    </div>
  );
}

export default Skills;