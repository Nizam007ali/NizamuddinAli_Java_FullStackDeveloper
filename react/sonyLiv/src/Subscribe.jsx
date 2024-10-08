import React, { useEffect, useState } from 'react'
import './Subscribe.css'
import { Link } from 'react-router-dom'

export default function Subscribe() {

  const [pay,newpay] = useState("0")

  useEffect(()=>{
    fun2()
  },[])
  function fun1(){
    
    var x = document.getElementById('subch1')
    x.style.backgroundColor='gold'
    x = document.getElementById('subch2')
    x.style.backgroundColor='rgb(21, 21, 21)'
    x = document.getElementById('subch3')
    x.style.backgroundColor='rgb(21, 21, 21)'

    x = document.getElementById('subch11')
    x.style.backgroundColor='rgb(44,38,18)'
    x = document.getElementById('subch21')
    x.style.backgroundColor='rgb(21, 21, 21)'
    x = document.getElementById('subch31')
    x.style.backgroundColor='rgb(21, 21, 21)'

    x = document.getElementById('subch12')
    x.style.backgroundColor='rgb(44,38,18)'
    x = document.getElementById('subch22')
    x.style.backgroundColor='rgb(21, 21, 21)'
    x = document.getElementById('subch32')
    x.style.backgroundColor='rgb(21, 21, 21)'

    x = document.getElementById('subch13')
    x.style.backgroundColor='rgb(44,38,18)'
    x = document.getElementById('subch23')
    x.style.backgroundColor='rgb(21, 21, 21)'
    x = document.getElementById('subch33')
    x.style.backgroundColor='rgb(21, 21, 21)'

    x = document.getElementById('subch14')
    x.style.backgroundColor='rgb(44,38,18)'
    x = document.getElementById('subch24')
    x.style.backgroundColor='rgb(21, 21, 21)'
    x = document.getElementById('subch34')
    x.style.backgroundColor='rgb(21, 21, 21)'

    x = document.getElementById('subch15')
    x.style.backgroundColor='rgb(44,38,18)'
    x = document.getElementById('subch25')
    x.style.backgroundColor='rgb(21, 21, 21)'
    x = document.getElementById('subch35')
    x.style.backgroundColor='rgb(21, 21, 21)'
    
    x = document.getElementById('sh21')
    x.style.color='rgb(21, 21, 21)'
    x = document.getElementById('sh22')
    x.style.color='gold'
    x = document.getElementById('sh23')
    x.style.color='gold'

    x = document.getElementById('sr1')
    x.checked=true
    x = document.getElementById('sr2')
    x.checked=false
    x = document.getElementById('sr3')
    x.checked=false
    
    newpay(699)
  }
  
  function fun2(){

    var x = document.getElementById('subch2')
    x.style.backgroundColor='gold'
    x = document.getElementById('subch1')
    x.style.backgroundColor='rgb(21, 21, 21)'
    x = document.getElementById('subch3')
    x.style.backgroundColor='rgb(21, 21, 21)'

    x = document.getElementById('subch11')
    x.style.backgroundColor='rgb(21, 21, 21)'
    x = document.getElementById('subch21')
    x.style.backgroundColor='rgb(44,38,18)'
    x = document.getElementById('subch31')
    x.style.backgroundColor='rgb(21, 21, 21)'

    x = document.getElementById('subch12')
    x.style.backgroundColor='rgb(21, 21, 21)'
    x = document.getElementById('subch22')
    x.style.backgroundColor='rgb(44,38,18)'
    x = document.getElementById('subch32')
    x.style.backgroundColor='rgb(21, 21, 21)'

    x = document.getElementById('subch13')
    x.style.backgroundColor='rgb(21, 21, 21)'
    x = document.getElementById('subch23')
    x.style.backgroundColor='rgb(44,38,18)'
    x = document.getElementById('subch33')
    x.style.backgroundColor='rgb(21, 21, 21)'

    x = document.getElementById('subch14')
    x.style.backgroundColor='rgb(21, 21, 21)'
    x = document.getElementById('subch24')
    x.style.backgroundColor='rgb(44,38,18)'
    x = document.getElementById('subch34')
    x.style.backgroundColor='rgb(21, 21, 21)'

    x = document.getElementById('subch15')
    x.style.backgroundColor='rgb(21, 21, 21)'
    x = document.getElementById('subch25')
    x.style.backgroundColor='rgb(44,38,18)'
    x = document.getElementById('subch35')
    x.style.backgroundColor='rgb(21, 21, 21)'
    
    x = document.getElementById('sh22')
    x.style.color='rgb(21, 21, 21)'
    x = document.getElementById('sh21')
    x.style.color='gold'
    x = document.getElementById('sh23')
    x.style.color='gold'
    
    x = document.getElementById('sr2')
    x.checked=true
    x = document.getElementById('sr1')
    x.checked=false
    x = document.getElementById('sr3')
    x.checked=false
    
    newpay(1499)
  }
  
  function fun3(){

    var x = document.getElementById('subch3')
    x.style.backgroundColor='gold'
    x = document.getElementById('subch2')
    x.style.backgroundColor='rgb(21, 21, 21)'
    x = document.getElementById('subch1')
    x.style.backgroundColor='rgb(21, 21, 21)'

    x = document.getElementById('subch11')
    x.style.backgroundColor='rgb(21, 21, 21)'
    x = document.getElementById('subch21')
    x.style.backgroundColor='rgb(21, 21, 21)'
    x = document.getElementById('subch31')
    x.style.backgroundColor='rgb(44,38,18)'

    x = document.getElementById('subch12')
    x.style.backgroundColor='rgb(21, 21, 21)'
    x = document.getElementById('subch22')
    x.style.backgroundColor='rgb(21, 21, 21)'
    x = document.getElementById('subch32')
    x.style.backgroundColor='rgb(44,38,18)'

    x = document.getElementById('subch13')
    x.style.backgroundColor='rgb(21, 21, 21)'
    x = document.getElementById('subch23')
    x.style.backgroundColor='rgb(21, 21, 21)'
    x = document.getElementById('subch33')
    x.style.backgroundColor='rgb(44,38,18)'

    x = document.getElementById('subch14')
    x.style.backgroundColor='rgb(21, 21, 21)'
    x = document.getElementById('subch24')
    x.style.backgroundColor='rgb(21, 21, 21)'
    x = document.getElementById('subch34')
    x.style.backgroundColor='rgb(44,38,18)'

    x = document.getElementById('subch15')
    x.style.backgroundColor='rgb(21, 21, 21)'
    x = document.getElementById('subch25')
    x.style.backgroundColor='rgb(21, 21, 21)'
    x = document.getElementById('subch35')
    x.style.backgroundColor='rgb(44,38,18)'
    
    x = document.getElementById('sh23')
    x.style.color='rgb(21, 21, 21)'
    x = document.getElementById('sh22')
    x.style.color='gold'
    x = document.getElementById('sh21')
    x.style.color='gold'
    
    x = document.getElementById('sr3')
    x.checked=true
    x = document.getElementById('sr2')
    x.checked=false
    x = document.getElementById('sr1')
    x.checked=false
    
    newpay(399)
  }
  

  return (
  <>
    <div className="sub">
      <div className='subdh1'><h1 className="subh1">Subscribe to watch all content on Sony LIV</h1></div>
      <div className="subpar">
      <div className="subch"><h2 className='subh2'>Access All Content</h2><p className="subp">Movies, Originals and Live Sports</p></div>
      <div className="subch" id='subch1' onClick={fun1}><input id='sr1' type="radio" name='r'/><p className='subp'>Mobile Only</p><h2 className='subh2' id='sh21'>₹699 <span className='subh2p'>Yearly</span></h2></div>
      <div className="subch" id='subch2' onClick={fun2}><input id='sr2' type="radio" name='r' /><p className='subp'>Liv Premium</p><h2 className='subh2' id='sh22'>₹1499 <span className='subh2p'>Yearly</span></h2></div>
      <div className="subch" id='subch3' onClick={fun3}><input id='sr3' type="radio" name='r' /><p className='subp'>Liv Premium</p><h2 className='subh2' id='sh23'>₹399 <span className='subh2p'>Monthly</span></h2></div>
      <div className="subch"><p className='subp'>Number of logged in devices</p></div>
      <div className="subch" id='subch11' onClick={fun1}><p className='subp'></p>1</div>
      <div className="subch" id='subch21' onClick={fun2}><p className='subp'>5</p></div>
      <div className="subch" id='subch31' onClick={fun3}><p className='subp'>5</p></div>
      <div className="subch"><p className='subp'>Watch on devices at same time</p></div>
      <div className="subch" id='subch12' onClick={fun1}><p className='subp'>1</p></div>
      <div className="subch" id='subch22' onClick={fun2}><p className='subp'>2</p></div>
      <div className="subch" id='subch32' onClick={fun3}><p className='subp'>1</p></div>
      <div className="subch"><p className='subp'>Max Video Quality</p></div>
      <div className="subch" id='subch13' onClick={fun1}><p className='subp'>Upto 720p HD</p></div>
      <div className="subch" id='subch23' onClick={fun2}><p className='subp'>Upto 4K UHD</p></div>
      <div className="subch" id='subch33' onClick={fun3}><p className='subp'>Upto 4K UHD</p></div>
      <div className="subch"><p className='subp'>Max Audio Quality</p></div>
      <div className="subch" id='subch14' onClick={fun1}><p className='subp'>Stereo</p></div>
      <div className="subch" id='subch24' onClick={fun2}><p className='subp'>Dolby Almos</p></div>
      <div className="subch" id='subch34' onClick={fun3}><p className='subp'>Dolby Almos</p></div>
      <div className="subch"><div><p className='subp'>Ad free experience</p></div></div>
      <div className="subch" id='subch15' onClick={fun1}><p className='subp'>Except on Sports, Liv Exclusives, Reality Shows (Live & Recorded) and Interactivity</p></div>
      <div className="subch" id='subch25' onClick={fun2}><p className='subp'>Except on Sports, Liv Exclusives, Reality Shows (Live & Recorded) and Interactivity</p></div>
      <div className="subch" id='subch35' onClick={fun3}><p className='subp'>Except on Sports, Liv Exclusives, Reality Shows (Live & Recorded) and Interactivity</p></div>
      </div>
      <div className='sh3div'><h3 className='subh3'><Link className='sh3l' to="/">Select a promo code</Link></h3></div>
      <div className='subpay'><Link className='sph2l' to="/"><h2 className="sph2">Pay ₹{pay}</h2></Link></div>
      <div className="subli"><li><Link className='sublil' to="/">Terms and Conditions</Link></li><li><Link className='sublil' to="/">Privacy Policy</Link></li><li><Link className='sublil' to="/">FAQ</Link></li></div>
    </div>
  </>
  )
}
