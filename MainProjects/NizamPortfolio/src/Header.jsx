import React from 'react';
import { Link, useLocation } from 'react-router-dom';
import nizamLogo from './assets/nizam.jpg';
import './css/Header.css';

function Header() {
    const location = useLocation();

    const navLinks = [
        { path: '/', label: 'About' },
        { path: '/projects', label: 'Projects' },
        { path: '/skills', label: 'Skills' },
        { path: '/contact', label: 'Contact' },
        { path: '/freelance', label: 'Freelance' }
    ];

    return (
        <div className='header'>
            <img src={nizamLogo} alt="Logo" />
            <div className='headercontent'>
                <div className='headertext'>
                    <h1>Nizamuddin Ali</h1>
                    <p>
                        Java Full Stack Developer
                        <span className='textNone'>
                            <div>Html</div><div>Css</div><div>Javascript</div>
                            <div>React</div><div>Cpp</div><div>Java</div>
                            <div>Dsa</div><div>Jsp</div><div>Spring</div>
                            <div>Spring Boot</div><div>Git</div><div>Sdlc</div>
                        </span>
                    </p>
                </div>
                <nav className='headernav'>
                    {navLinks.map((link, idx) => (
                        <Link
                            key={idx}
                            to={link.path}
                            className={`link ${location.pathname === link.path ? 'active' : ''}`}
                        >
                            {link.label}
                        </Link>
                    ))}
                </nav>
            </div>
        </div>
    );
}

export default Header;
