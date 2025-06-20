import React, { useEffect } from 'react'
import nizamLogo from './assets/nizam.jpg'
import { Link } from 'react-router-dom'
import './css/Header.css'

function Header() {

    useEffect(() => {
        const links = document.querySelectorAll('.link');

        // Retrieve last active index from localStorage
        const savedIndex = localStorage.getItem('activeLinkIndex');
        const activeIndex = savedIndex ? parseInt(savedIndex, 10) : 0;

        links.forEach((link, index) => {
            link.classList.remove('active');

            link.addEventListener('click', () => {
                links.forEach(l => l.classList.remove('active'));
                link.classList.add('active');
                localStorage.setItem('activeLinkIndex', index);
            });
        });

        if (links[activeIndex]) {
            links[activeIndex].classList.add('active');
        }
    }, []);

    return (
        <div className='header'>
            <img src={nizamLogo} alt="" />
            <div className='headercontent'>
                <div className='headertext'>
                    <h1>Nizamuddin Ali</h1>
                    <p>Java Full Stack Developer <span className='textNone'><div>Html</div><div>Css</div><div>Javascript</div><div>React</div><div>Cpp</div><div>Java</div><div>Dsa</div><div>Jsp</div><div>Spring</div><div>Sprinboot</div><div>Git</div><div>Sdlc</div></span></p>
                    {/* <p></p> */}
                </div>
                <nav className='headernav'>
                    <Link className='link' to="/">About</Link>
                    <Link className='link' to="/projects">Projects</Link>
                    <Link className='link' to="/skills">Skills</Link>
                    <Link className='link' to="/contact">Contact</Link>
                </nav>
            </div>

        </div>
    )
}

export default Header