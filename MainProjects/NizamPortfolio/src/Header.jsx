import React, { useEffect, useState } from 'react';
import { Link, useLocation } from 'react-router-dom';
import nizamLogo from './assets/nizam.jpg';
import './css/Header.css';

function Header() {
    const location = useLocation();
    const [darkMode, setDarkMode] = useState(() => localStorage.getItem('theme') === 'dark');

    const toggleTheme = () => {
        const newTheme = darkMode ? 'light' : 'dark';
        setDarkMode(!darkMode);
        document.documentElement.setAttribute('data-theme', newTheme);
        localStorage.setItem('theme', newTheme);
    };

    useEffect(() => {
        const storedTheme = localStorage.getItem('theme') || 'light';
        document.documentElement.setAttribute('data-theme', storedTheme);
    }, []);

    useEffect(() => {
        // const handleResize = () => {
        //     handleOpen();
        // };
        // window.addEventListener('resize', handleResize);
        // handleResize();
        // return () => {
        //     window.removeEventListener('resize', handleResize);
        // };
    }, []);

    const navLinks = [
        { path: '/', label: 'About' },
        { path: '/projects', label: 'Projects' },
        { path: '/skills', label: 'Skills' },
        { path: '/contact', label: 'Contact' },
        { path: '/freelance', label: 'Freelance' }
    ];

    const handleOpen = () => {
        if (window.innerWidth <= 600) {
            var x = document.getElementById("headernav");
            var x1 = document.getElementById("headernav1");
            var y = document.getElementById("header");
            if (x.style.display === "flex") {
                x.style.display = "none";
                x1.style.display = "flex";
                document.body.style.overflowY = 'initial';
            } else {
                x.style.display = "flex";
                x1.style.display = "none";
                document.body.style.overflowY = 'hidden';
            }
        } else {
            var x = document.getElementById("headernav");
            var x1 = document.getElementById("headernav1");
            var y = document.getElementById("header");
            if (x.style.display === "none") {
                x.style.display = "flex";
                x1.style.display = "none";
            }
        }
    }

    return (
        <div className='header' id='header'>
            <div className="headerimg"><img src={nizamLogo} alt="Logo" /></div>
            <div className='headercontent'>
                <div className='headertext'>
                    <div className='htext'>
                        <span>Nizamuddin Ali</span>
                        <span>
                            <button className="theme-toggle" onClick={toggleTheme}>
                                {darkMode ? "☀️" : "🌙"}
                            </button>
                        </span>
                    </div>
                    <p>
                        Java Full Stack Developer |
                        <a className='headerlink' href="https://github.com/Nizam007ali/NizamuddinAli_Java_FullStackDeveloper" target="_blank"> GitHub</a> |
                        <a className='headerlink' href="https://www.linkedin.com/in/nizamuddin-ali-0273b6221/" target="_blank"> LinkedIn</a>
                        <span className='textNone'>
                            <div>Html</div><div>Css</div><div>Javascript</div>
                            <div>React</div><div>Cpp</div><div>Java</div>
                            <div>Dsa</div><div>Jsp</div><div>Spring</div>
                            <div>Spring Boot</div><div>Git</div><div>Sdlc</div>
                        </span>
                    </p>
                </div>

                <nav className='headernav' id='headernav'>
                    {navLinks.map((link, idx) => (
                        <Link
                            key={idx}
                            to={link.path}
                            onClick={handleOpen}
                            className={`link ${location.pathname === link.path ? 'active' : ''}`}
                        >
                            {link.label}
                        </Link>
                    ))}
                </nav>
                <nav className='headernav1' id='headernav1' onClick={handleOpen}>
                    <div></div>
                    <div></div>
                    <div></div>
                </nav>
            </div>
        </div>
    );
}

export default Header;
