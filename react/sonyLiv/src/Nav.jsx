import React, { useEffect, useState } from 'react'
import { FaAngleRight } from "react-icons/fa";
import { FaSearch } from "react-icons/fa";
import { IoMdContact } from "react-icons/io";
import { FaCrown } from "react-icons/fa";
import { FaTv } from "react-icons/fa";
import { IoIosSettings } from "react-icons/io";
import { TiContacts } from "react-icons/ti";
import { FaWhatsapp } from "react-icons/fa";
import { FaArrowRight } from "react-icons/fa";
import { FaPercent } from "react-icons/fa";
import './main.css'
import { Link } from 'react-router-dom';
import Index1 from './Index1';

function Nav() {

  const phone = localStorage.getItem("key1");
  const [linkData, setLinkData] = useState({
    href: 'Signin'
  });

  const changeLink = () => {
    setLinkData({
      href: 'Profile'
    });
  };

  useEffect(() => {
    sp1()
    tp1()
    mp1()
    let y = document.getElementById("signinimg")
    let y1 = document.getElementById("signinimg1")
    let y2 = document.getElementById("signinh1")
    let y3 = document.getElementById("signinp")

    let name1
    let user_data = localStorage.getItem("key")
    let data1 = JSON.parse(user_data)
    let user
    if (data1) {
      user = data1.find((res) => res.phone === phone)
      if (user) {
        name1 = user.name
      }
    }
    if (phone == null) {
      y.src = "profile/" + phone + ".png"
      y1.src = "profile/" + phone + ".png"
    }
    if (phone!=null) {
      y.src = "profile/" + phone + ".png"
      y1.src = "profile/" + phone + ".png"
      y2.innerHTML = name1
      y3.innerHTML = ""
      changeLink()
    }
  }, [])

  let x = document.getElementById("signinblock")

  function fun1() {
    x.style.display = 'grid'
  }
  function fun2() {
    x.style.display = 'none'
  }

  function fun3() {
    document.getElementById("sportblock").style.display = 'block'
  }
  function fun4() {
    document.getElementById("sportblock").style.display = 'none'
  }

  function fun5() {
    document.getElementById("tvblock").style.display = 'block'
  }
  function fun6() {
    document.getElementById("tvblock").style.display = 'none'
  }

  function fun7() {
    document.getElementById("mvblock").style.display = 'block'
  }
  function fun8() {
    document.getElementById("mvblock").style.display = 'none'
  }

  function sp1() {
    document.getElementById('sbc1').classList.add('active');
    document.getElementById('sbc2').classList.remove('active');
    document.getElementById('sbc3').classList.remove('active');

    document.getElementById('spc').style.display = 'grid'
    document.getElementById('spf').style.display = 'none'
    document.getElementById('spw').style.display = 'none'
  }
  function sp2() {
    document.getElementById('sbc2').classList.add('active');
    document.getElementById('sbc1').classList.remove('active');
    document.getElementById('sbc3').classList.remove('active');

    document.getElementById('spf').style.display = 'grid'
    document.getElementById('spc').style.display = 'none'
    document.getElementById('spw').style.display = 'none'
  }
  function sp3() {
    document.getElementById('sbc3').classList.add('active');
    document.getElementById('sbc1').classList.remove('active');
    document.getElementById('sbc2').classList.remove('active');

    document.getElementById('spw').style.display = 'grid'
    document.getElementById('spf').style.display = 'none'
    document.getElementById('spc').style.display = 'none'
  }

  function tp1() {
    document.getElementById('tbc1').classList.add('active');
    document.getElementById('tbc2').classList.remove('active');
    document.getElementById('tbc3').classList.remove('active');
    document.getElementById('tbc4').classList.remove('active');

    document.getElementById('tpset').style.display = 'grid'
    document.getElementById('tpsony').style.display = 'none'
    document.getElementById('tpsm').style.display = 'none'
    document.getElementById('tpsys').style.display = 'none'
  }

  function tp2() {
    document.getElementById('tbc1').classList.remove('active');
    document.getElementById('tbc2').classList.add('active');
    document.getElementById('tbc3').classList.remove('active');
    document.getElementById('tbc4').classList.remove('active');

    document.getElementById('tpset').style.display = 'none'
    document.getElementById('tpsony').style.display = 'grid'
    document.getElementById('tpsm').style.display = 'none'
    document.getElementById('tpsys').style.display = 'none'
  }

  function tp3() {
    document.getElementById('tbc1').classList.remove('active');
    document.getElementById('tbc2').classList.remove('active');
    document.getElementById('tbc3').classList.add('active');
    document.getElementById('tbc4').classList.remove('active');

    document.getElementById('tpset').style.display = 'none'
    document.getElementById('tpsony').style.display = 'none'
    document.getElementById('tpsm').style.display = 'grid'
    document.getElementById('tpsys').style.display = 'none'
  }

  function tp4() {
    document.getElementById('tbc4').classList.add('active');
    document.getElementById('tbc2').classList.remove('active');
    document.getElementById('tbc3').classList.remove('active');
    document.getElementById('tbc1').classList.remove('active');

    document.getElementById('tpset').style.display = 'none'
    document.getElementById('tpsony').style.display = 'none'
    document.getElementById('tpsm').style.display = 'none'
    document.getElementById('tpsys').style.display = 'grid'
  }

  function mp1() {
    document.getElementById('mbc1').classList.add('active');
    document.getElementById('mbc2').classList.remove('active');
    document.getElementById('mbc3').classList.remove('active');
    document.getElementById('mbc4').classList.remove('active');

    document.getElementById('mpset').style.display = 'grid'
    document.getElementById('mpsony').style.display = 'none'
    document.getElementById('mpsm').style.display = 'none'
    document.getElementById('mpsys').style.display = 'none'
  }
  function mp2() {
    document.getElementById('mbc2').classList.add('active');
    document.getElementById('mbc1').classList.remove('active');
    document.getElementById('mbc3').classList.remove('active');
    document.getElementById('mbc4').classList.remove('active');

    document.getElementById('mpset').style.display = 'none'
    document.getElementById('mpsony').style.display = 'grid'
    document.getElementById('mpsm').style.display = 'none'
    document.getElementById('mpsys').style.display = 'none'
  }
  function mp3() {
    document.getElementById('mbc3').classList.add('active');
    document.getElementById('mbc2').classList.remove('active');
    document.getElementById('mbc1').classList.remove('active');
    document.getElementById('mbc4').classList.remove('active');

    document.getElementById('mpset').style.display = 'none'
    document.getElementById('mpsony').style.display = 'none'
    document.getElementById('mpsm').style.display = 'grid'
    document.getElementById('mpsys').style.display = 'none'
  }
  function mp4() {
    document.getElementById('mbc4').classList.add('active');
    document.getElementById('mbc2').classList.remove('active');
    document.getElementById('mbc3').classList.remove('active');
    document.getElementById('mbc1').classList.remove('active');

    document.getElementById('mpset').style.display = 'none'
    document.getElementById('mpsony').style.display = 'none'
    document.getElementById('mpsm').style.display = 'none'
    document.getElementById('mpsys').style.display = 'grid'
  }

  return (
    <>
      <div className="navbar">
        <div className="logo"><Link to='/'><img className='NavLogoImg' src="/sonyliv1_icon.png" alt="" /></Link></div>
        <div className="subscribeButton"><Link to='Subscribe'><button className='.subBut'>Subscribe<FaAngleRight /></button></Link></div>
        <ul className='ul1'>
          <li className='li1'><Link to='/' className='a1'>KBC 2024</Link></li>
          <li className='li1'><Link to='/' className='a1'>UCL 2024-25</Link></li>
          <li className='li1'><Link to='/' className='a1'>ENG V AUS</Link></li>
          <li className='li1'><Link to='/' className='a1'>Originals</Link></li>
          <li className='li1' onMouseOver={fun3} onMouseOut={fun4}><Link to='/' className='a1'>Sports</Link></li>
          <li className='li1' onMouseOver={fun5} onMouseOut={fun6}><Link to='/' className='a1'>TV Shows</Link></li>
          <li className='li1' onMouseOver={fun7} onMouseOut={fun8}><Link to='/' className='a1'>Movies</Link></li>
          <li className='li1'><Link to='/' className='a1'>Premium</Link></li>
        </ul>
        <Link to='/search' ><div className="searchicon"><FaSearch className='fasearch' /></div></Link>
        <Link to='/profile' ><div className="signinicon" onMouseOver={fun1} onMouseOut={fun2}><img id='signinimg' className='signinimgimg' src="7077027.png" /></div></Link>
      </div>
      <div className="signinblock" id="signinblock" onMouseOver={fun1} onMouseOut={fun2}>
        <Link to={linkData.href} id='signinlink' className='navlink1'><div className="sign1"><div className="signinimg"><img id='signinimg1' className='signinimgimg' src="7077027.png" /></div><div className="sign11"><h1 className='sign11h1' id="signinh1">Sign in</h1><p className='sign11p' id='signinp'>a better experience</p></div></div>
        </Link><Link to='Subscribe' className='navlink1'><div className="sign1"><div className="sign12"><FaCrown className='facrown' /></div><h2 className='sign12h2'>Subscribe now</h2></div>
        </Link><Link to='/' className='navlink1'><div className="sign1"><div className="sign12"><FaTv className='facrown' /></div><h2 className='sign12h2'>Activate TV</h2></div>
        </Link><Link to='/' className='navlink1'><div className="sign1"><div className="sign12"><IoIosSettings className='facrown' /></div><h2 className='sign12h2'>Settings & Preferences</h2></div>
        </Link><Link to='/' className='navlink1'><div className="sign1"><div className="sign12"><TiContacts className='facrown' /></div><h2 className='sign12h2'>Contact Us</h2></div>
        </Link><Link to='/' className='navlink1'><div className="sign1"><div className="sign12"><FaWhatsapp className='facrown' /></div><h2 className='sign12h2'>Chat with us on Whatsapp</h2></div>
        </Link><Link to='/' className='navlink1'><div className="sign1"><div className="sign12"><FaPercent className='facrown1' /></div><h2 className='sign12h2'>Activate Offer</h2></div>
        </Link>
      </div>
      <div className="sportblock" id="sportblock" onMouseOver={fun3} onMouseOut={fun4}>
        <div className="opt">
          <div className="sports">Sports < FaArrowRight fontSize={'1vw'} /></div>
          <button id='sbc1' onClick={sp1} className='spopt active'>Cricket</button>
          <button id='sbc2' onClick={sp2} className='spopt'>Football</button>
          <button id='sbc3' onClick={sp3} className='spopt'>WWE</button>
        </div>
        <div className="spcp" id='spc'>
          <div className="spcc"><img src="/sportsimage/australia_tour_of_england_2024_gob_portrait_thumb_dated.avif" alt="" /></div>
          <div className="spcc"><img src="/sportsimage/lavercup2024_1_portrait_thumb.avif" alt="" /></div>
          <div className="spcc"><img src="/sportsimage/usopen2024_2_portrait_thumb2.avif" alt="" /></div>
          <div className="spcc"><img src="/sportsimage/daviscup24_25_groupstage_portrait_thumb.avif" alt="" /></div>
          <div className="spcc"><img src="/sportsimage/rolexshanghaimasters2024_1_portrait_thumb.avif" alt="" /></div>
          <div className="spcc"><img src="/sportsimage/hundred_mens_gob_portrait_thumb.avif" alt="" /></div>
          <div className="spcc"><div className="stmarr"><FaArrowRight /></div><img src="/sportsimage/roland_garros_2024_3_portrait_thumb_1.avif" alt="" /></div>
        </div>
        <div className="spcp" id='spf'>
          <div className="spcc"><img src="/sportsimage/" alt="" /></div>
          <div className="spcc"><img src="/sportsimage/" alt="" /></div>
          <div className="spcc"><img src="/sportsimage/" alt="" /></div>
          <div className="spcc"><img src="/sportsimage/" alt="" /></div>
          <div className="spcc"><img src="/sportsimage/" alt="" /></div>
          <div className="spcc"><img src="/sportsimage/" alt="" /></div>
          <div className="spcc"><div className="stmarr"><FaArrowRight /></div><img src="/sportsimage/roland_garros_2024_3_portrait_thumb_1.avif" alt="" /></div>
        </div>
        <div className="spcp" id='spw'>
          <div className="spcc"><img src="/sportsimage/" alt="" /></div>
          <div className="spcc"><img src="/sportsimage/" alt="" /></div>
          <div className="spcc"><img src="/sportsimage/" alt="" /></div>
          <div className="spcc"><img src="/sportsimage/" alt="" /></div>
          <div className="spcc"><img src="/sportsimage/" alt="" /></div>
          <div className="spcc"><img src="/sportsimage/" alt="" /></div>
          <div className="spcc"><div className="stmarr"><FaArrowRight /></div><img src="/sportsimage/roland_garros_2024_3_portrait_thumb_1.avif" alt="" /></div>
        </div>
      </div>
      <div className="sportblock" id="tvblock" onMouseOver={fun5} onMouseOut={fun6}>
        <div className="opt">
          <div className="sports">All TV Shows < FaArrowRight fontSize={'1vw'} /></div>
          <button id='tbc1' onClick={tp1} className='tpopt active'>SET Shows</button>
          <button id='tbc2' onClick={tp2} className='tpopt'>SAB Shows</button>
          <button id='tbc3' onClick={tp3} className='tpopt'>Sony Marathi</button>
          <button id='tbc4' onClick={tp4} className='tpopt'>Sony Yay Shows</button>
        </div>
        <div className="spcp" id='tpset'>
          <div className="spcc"><img src="/tvimage/" alt="" /></div>
          <div className="spcc"><img src="/tvimage/" alt="" /></div>
          <div className="spcc"><img src="/tvimage/" alt="" /></div>
          <div className="spcc"><img src="/tvimage/" alt="" /></div>
          <div className="spcc"><img src="/tvimage/" alt="" /></div>
          <div className="spcc"><img src="/tvimage/" alt="" /></div>
          <div className="spcc"><div className="stmarr"><FaArrowRight /></div><img src="/sportsimage/roland_garros_2024_3_portrait_thumb_1.avif" alt="" /></div>
        </div>
        <div className="spcp" id='tpsony'>
          <div className="spcc"><img src="/tvimage/" alt="" /></div>
          <div className="spcc"><img src="/tvimage/" alt="" /></div>
          <div className="spcc"><img src="/tvimage/" alt="" /></div>
          <div className="spcc"><img src="/tvimage/" alt="" /></div>
          <div className="spcc"><img src="/tvimage/" alt="" /></div>
          <div className="spcc"><img src="/tvimage/" alt="" /></div>
          <div className="spcc"><div className="stmarr"><FaArrowRight /></div><img src="/sportsimage/roland_garros_2024_3_portrait_thumb_1.avif" alt="" /></div>
        </div>
        <div className="spcp" id='tpsm'>
          <div className="spcc"><img src="/tvimage/" alt="" /></div>
          <div className="spcc"><img src="/tvimage/" alt="" /></div>
          <div className="spcc"><img src="/tvimage/" alt="" /></div>
          <div className="spcc"><img src="/tvimage/" alt="" /></div>
          <div className="spcc"><img src="/tvimage/" alt="" /></div>
          <div className="spcc"><img src="/tvimage/" alt="" /></div>
          <div className="spcc"><div className="stmarr"><FaArrowRight /></div><img src="/sportsimage/roland_garros_2024_3_portrait_thumb_1.avif" alt="" /></div>
        </div>
        <div className="spcp" id='tpsys'>
          <div className="spcc"><img src="/tvimage/" alt="" /></div>
          <div className="spcc"><img src="/tvimage/" alt="" /></div>
          <div className="spcc"><img src="/tvimage/" alt="" /></div>
          <div className="spcc"><img src="/tvimage/" alt="" /></div>
          <div className="spcc"><img src="/tvimage/" alt="" /></div>
          <div className="spcc"><img src="/tvimage/" alt="" /></div>
          <div className="spcc"><div className="stmarr"><FaArrowRight /></div><img src="/sportsimage/roland_garros_2024_3_portrait_thumb_1.avif" alt="" /></div>
        </div>
      </div>
      <div className="sportblock" id="mvblock" onMouseOver={fun7} onMouseOut={fun8}>
        <div className="opt">
          <div className="sports">All Movies < FaArrowRight fontSize={'1vw'} /></div>
          <button id='mbc1' onClick={mp1} className='mpopt active'>Hindi</button>
          <button id='mbc2' onClick={mp2} className='mpopt'>English</button>
          <button id='mbc3' onClick={mp3} className='mpopt'>Tamil</button>
          <button id='mbc4' onClick={mp4} className='mpopt'>Telugu</button>
        </div>
        <div className="spcp" id='mpset'>
          <div className="spcc"><img src="/mvimage/" alt="" /></div>
          <div className="spcc"><img src="/mvimage/" alt="" /></div>
          <div className="spcc"><img src="/mvimage/" alt="" /></div>
          <div className="spcc"><img src="/mvimage/" alt="" /></div>
          <div className="spcc"><img src="/mvimage/" alt="" /></div>
          <div className="spcc"><img src="/mvimage/" alt="" /></div>
          <div className="spcc"><div className="stmarr"><FaArrowRight /></div><img src="/sportsimage/roland_garros_2024_3_portrait_thumb_1.avif" alt="" /></div>
        </div>
        <div className="spcp" id='mpsony'>
          <div className="spcc"><img src="/mvimage/" alt="" /></div>
          <div className="spcc"><img src="/mvimage/" alt="" /></div>
          <div className="spcc"><img src="/mvimage/" alt="" /></div>
          <div className="spcc"><img src="/mvimage/" alt="" /></div>
          <div className="spcc"><img src="/mvimage/" alt="" /></div>
          <div className="spcc"><img src="/mvimage/" alt="" /></div>
          <div className="spcc"><div className="stmarr"><FaArrowRight /></div><img src="/sportsimage/roland_garros_2024_3_portrait_thumb_1.avif" alt="" /></div>
        </div>
        <div className="spcp" id='mpsm'>
          <div className="spcc"><img src="/mvimage/" alt="" /></div>
          <div className="spcc"><img src="/mvimage/" alt="" /></div>
          <div className="spcc"><img src="/mvimage/" alt="" /></div>
          <div className="spcc"><img src="/mvimage/" alt="" /></div>
          <div className="spcc"><img src="/mvimage/" alt="" /></div>
          <div className="spcc"><img src="/mvimage/" alt="" /></div>
          <div className="spcc"><div className="stmarr"><FaArrowRight /></div><img src="/sportsimage/roland_garros_2024_3_portrait_thumb_1.avif" alt="" /></div>
        </div>
        <div className="spcp" id='mpsys'>
          <div className="spcc"><img src="/mvimage/" alt="" /></div>
          <div className="spcc"><img src="/mvimage/" alt="" /></div>
          <div className="spcc"><img src="/mvimage/" alt="" /></div>
          <div className="spcc"><img src="/mvimage/" alt="" /></div>
          <div className="spcc"><img src="/mvimage/" alt="" /></div>
          <div className="spcc"><img src="/mvimage/" alt="" /></div>
          <div className="spcc"><div className="stmarr"><FaArrowRight /></div><img src="/sportsimage/roland_garros_2024_3_portrait_thumb_1.avif" alt="" /></div>
        </div>
      </div>
    </>
  )
}
export default Nav