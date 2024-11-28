import React, { useEffect } from 'react'
import { Link } from 'react-router-dom'
import './main.css'

function Index1() {

    var is = document.getElementsByClassName("is0b");
    var ini = document.getElementsByClassName("ch");

    useEffect(() => {
        localStorage.setItem('i', 0)
        var c = 0;
    })

    function imgswap(x) {
        if (x == -1) {
            var x1 = parseInt(localStorage.getItem('i'))
            x1--;
            localStorage.setItem('i', x1)
            x = x1;
        } else if (x == -2) {
            var x1 = parseInt(localStorage.getItem('i'))
            x1++;
            localStorage.setItem('i', x1)
            x = x1;
        }
        for (var i of is) {
            i.innerHTML = '__'
        }
        for (var i of ini) {
            i.style.display = 'none'
        }
        if (x < 0) x = 9;
        else if (x > 9) x = 0;
        is[x].innerHTML = '____'
        ini[x].style.display = 'block'
        localStorage.setItem('i', x)
        // alert(x)

    }
    var l = document.getElementsByClassName('lanp');
    function lan(y) {
        l[0].style.transform = 'translateX(' + y + ')';
        l[0].style.transition = 'ease 1s';
    }
    var s = document.getElementsByClassName('sanp');
    var c1 = localStorage.getItem('c');
    if (c1 == null || c1 == 'NaN') {
        localStorage.setItem('c', 0);
    }
    c1 = parseInt(localStorage.getItem('c'));
    function san(y) {
        if (y === '+') c1 = c1 + 1
        else if (y === '-') c1 = c1 - 1
        if (c1 < 0) c1 = 0;
        else if (c1 > 2) c1 = 2;
        var y1 = '0%';
        if (c1 == 0) y1 = '0%'
        if (c1 == 1) y1 = '-54%'
        if (c1 == 2) y1 = '-108%'
        localStorage.setItem('c', c1);
        s[0].style.transform = 'translateX(' + y1 + ')';
        s[0].style.transition = 'ease 3s';
    }
    var w = document.getElementsByClassName('wanp');
    var c3 = localStorage.getItem('c');
    if (c3 == null || c3 == 'NaN') {
        localStorage.setItem('c2', 0);
    }
    c3 = parseInt(localStorage.getItem('c2'));
    function wan(y) {
        if (y === '+') c3 = c3 + 1
        else if (y === '-') c3 = c3 - 1
        if (c3 < 0) c3 = 0;
        else if (c3 > 2) c3 = 2;
        var y1 = '0%';
        if (c3 == 0) y1 = '0%'
        if (c3 == 1) y1 = '-43%'
        if (c3 == 2) y1 = '-86%'
        localStorage.setItem('c2', c3);
        w[0].style.transform = 'translateX(' + y1 + ')';
        w[0].style.transition = 'ease 3s';
    }

    // setInterval(()=>imgswap(-1), 8000)

    return (
        <>
            <div className="index">
                <div className="ind" id='ind'>
                    <div className="ch">
                        <Link to='/'><img className='ini1' src="slideimage/badeachelagtehe_masthead_logo_re1_21dec.avif" alt="i1" /></Link>
                        <div className="ch10">
                            <div className="ch1"><Link to='/' className='cl'><h1 className='ch11'>+</h1><h1 className='ch12'>Add to My List</h1></Link></div>
                            <div className="chb"><button className="ib">Play Now</button></div>
                            <div className="ch2"><Link to='/' className='cl'><h1 className='ch11'>=&gt;</h1><h1 className='ch12'>Share</h1></Link></div>
                        </div>
                    </div>
                    <div className="ch">
                        <img className='ini1' src="slideimage/EDKV_Foregroundnew.avif" alt="i1" />
                        <div className="ch10">
                            <div className="ch1"><Link to='/' className='cl'><h1 className='ch11'>+</h1><h1 className='ch12'>Add to My List</h1></Link></div>
                            <div className="chb"><button className="ib">Play Now</button></div>
                            <div className="ch2"><Link to='/' className='cl'><h1 className='ch11'>=&gt;</h1><h1 className='ch12'>Share</h1></Link></div>
                        </div>
                    </div>
                    <div className="ch">
                        <img className='ini1' src="slideimage/fam_18nov_reviews_masthead_web_v1_1.avif" alt="i1" />
                        <div className="ch10">
                            <div className="ch1"><Link to='/' className='cl'><h1 className='ch11'>+</h1><h1 className='ch12'>Add to My List</h1></Link></div>
                            <div className="chb"><button className="ib">Play Now</button></div>
                            <div className="ch2"><Link to='/' className='cl'><h1 className='ch11'>=&gt;</h1><h1 className='ch12'>Share</h1></Link></div>
                        </div>
                    </div>
                    <div className="ch">
                        <img className='ini1' src="slideimage/ibd_vs_sd_masthead_web_v1.avif" alt="i1" />
                        <div className="ch10">
                            <div className="ch1"><Link to='/' className='cl'><h1 className='ch11'>+</h1><h1 className='ch12'>Add to My List</h1></Link></div>
                            <div className="chb"><button className="ib">Play Now</button></div>
                            <div className="ch2"><Link to='/' className='cl'><h1 className='ch11'>=&gt;</h1><h1 className='ch12'>Share</h1></Link></div>
                        </div>
                    </div>
                    <div className="ch">
                        <img className='ini1' src="slideimage/indianidol2024_rev_27sep_masthead_web_v1.avif" alt="i1" />
                        <div className="ch10">
                            <div className="ch1"><Link to='/' className='cl'><h1 className='ch11'>+</h1><h1 className='ch12'>Add to My List</h1></Link></div>
                            <div className="chb"><button className="ib">Play Now</button></div>
                            <div className="ch2"><Link to='/' className='cl'><h1 className='ch11'>=&gt;</h1><h1 className='ch12'>Share</h1></Link></div>
                        </div>
                    </div>
                    <div className="ch">
                        <img className='ini1' src="slideimage/kbc2024_4oct_masthead_web_v1.avif" alt="i1" />
                        <div className="ch10">
                            <div className="ch1"><Link to='/' className='cl'><h1 className='ch11'>+</h1><h1 className='ch12'>Add to My List</h1></Link></div>
                            <div className="chb"><button className="ib">Play Now</button></div>
                            <div className="ch2"><Link to='/' className='cl'><h1 className='ch11'>=&gt;</h1><h1 className='ch12'>Share</h1></Link></div>
                        </div>
                    </div>
                    <div className="ch">
                        <img className='ini1' src="slideimage/manvatmurders2_3oct_masthead_web_v1_5.avif" alt="i1" />
                        <div className="ch10">
                            <div className="ch1"><Link to='/' className='cl'><h1 className='ch11'>+</h1><h1 className='ch12'>Add to My List</h1></Link></div>
                            <div className="chb"><button className="ib">Play Now</button></div>
                            <div className="ch2"><Link to='/' className='cl'><h1 className='ch11'>=&gt;</h1><h1 className='ch12'>Share</h1></Link></div>
                        </div>
                    </div>
                    <div className="ch">
                        <img className='ini1' src="slideimage/mdlindia_15nov_masthead_web_v1.avif" alt="i1" />
                        <div className="ch10">
                            <div className="ch1"><Link to='/' className='cl'><h1 className='ch11'>+</h1><h1 className='ch12'>Add to My List</h1></Link></div>
                            <div className="chb"><button className="ib">Play Now</button></div>
                            <div className="ch2"><Link to='/' className='cl'><h1 className='ch11'>=&gt;</h1><h1 className='ch12'>Share</h1></Link></div>
                        </div>
                    </div>
                    <div className="ch">
                        <img className='ini1' src="slideimage/tmkoc23_16_masthead_web_v1.avif" alt="i1" />
                        <div className="ch10">
                            <div className="ch1"><Link to='/' className='cl'><h1 className='ch11'>+</h1><h1 className='ch12'>Add to My List</h1></Link></div>
                            <div className="chb"><button className="ib">Play Now</button></div>
                            <div className="ch2"><Link to='/' className='cl'><h1 className='ch11'>=&gt;</h1><h1 className='ch12'>Share</h1></Link></div>
                        </div>
                    </div>
                    <div className="ch">
                        <img className='ini1' src="slideimage/uel_md2_fc_porto_vs_manunited_hls_masthead_web_v1.avif" alt="i1" />
                        <div className="ch10">
                            <div className="ch1"><Link to='/' className='cl'><h1 className='ch11'>+</h1><h1 className='ch12'>Add to My List</h1></Link></div>
                            <div className="chb"><button className="ib">Play Now</button></div>
                            <div className="ch2"><Link to='/' className='cl'><h1 className='ch11'>=&gt;</h1><h1 className='ch12'>Share</h1></Link></div>
                        </div>
                    </div>
                </div>
                <div className="is">
                    <div className="is0"><button onClick={() => imgswap(0)} className="is0b">____</button></div>
                    <div className="is0"><button onClick={() => imgswap(1)} className="is0b">__</button></div>
                    <div className="is0"><button onClick={() => imgswap(2)} className="is0b">__</button></div>
                    <div className="is0"><button onClick={() => imgswap(3)} className="is0b">__</button></div>
                    <div className="is0"><button onClick={() => imgswap(4)} className="is0b">__</button></div>
                    <div className="is0"><button onClick={() => imgswap(5)} className="is0b">__</button></div>
                    <div className="is0"><button onClick={() => imgswap(6)} className="is0b">__</button></div>
                    <div className="is0"><button onClick={() => imgswap(7)} className="is0b">__</button></div>
                    <div className="is0"><button onClick={() => imgswap(8)} className="is0b">__</button></div>
                    <div className="is0"><button onClick={() => imgswap(9)} className="is0b">__</button></div>
                </div>
                <div className="but">
                    <div className="p">
                        <button className='Ib1' onClick={() => imgswap(-1)}>p</button>
                    </div>
                    <div className="n">
                        <button className='Ib1' onClick={() => imgswap(-2)}>n</button>
                    </div>
                </div>
                <div className="lan" id='lan'>
                    <h1 className="lh">Available in the Language of your Choice</h1>
                    <div className="lanp" id='lap'>
                        <div className="lanc">
                            <img className='lanci' src="slideimage/mdlindia_15nov_masthead_web_v1.avif" alt="" />
                        </div>
                        <div className="lanc">
                            <img className='lanci' src="slideimage/mdlindia_15nov_masthead_web_v1.avif" alt="" />
                        </div>
                        <div className="lanc">
                            <img className='lanci' src="slideimage/mdlindia_15nov_masthead_web_v1.avif" alt="" />
                        </div>
                        <div className="lanc">
                            <img className='lanci' src="slideimage/mdlindia_15nov_masthead_web_v1.avif" alt="" />
                        </div>
                        <div className="lanc">
                            <img className='lanci' src="slideimage/mdlindia_15nov_masthead_web_v1.avif" alt="" />
                        </div>
                        <div className="lanc">
                            <img className='lanci' src="slideimage/mdlindia_15nov_masthead_web_v1.avif" alt="" />
                        </div>
                        <div className="lanc">
                            <img className='lanci' src="slideimage/mdlindia_15nov_masthead_web_v1.avif" alt="" />
                        </div>
                        <div className="lanc">
                            <img className='lanci' src="slideimage/mdlindia_15nov_masthead_web_v1.avif" alt="" />
                        </div>
                    </div>
                    <div className="but1">
                        <div className="p">
                            <button className='Ib1' id='Ib11' onClick={() => lan('0%')}>p</button>
                        </div>
                        <div className="n">
                            <button className='Ib1' id='Ib12' onClick={() => lan('-11%')}>n</button>
                        </div>
                    </div>
                </div>
                <div className="lan" id='san'>
                    <h1 className="lh">Streaming</h1>
                    <div className="sanp" id='sap'>
                        <div className="lanc">
                            <img className='sanci' src="slideimage/fam/fam0.avif" alt="1" />
                        </div>
                        <div className="lanc">
                            <img className='sanci' src="slideimage/fam/fam1.avif" alt="2" />
                        </div>
                        <div className="lanc">
                            <img className='sanci' src="slideimage/fam/fam2.avif" alt="3" />
                        </div>
                        <div className="lanc">
                            <img className='sanci' src="slideimage/fam/fam3.avif" alt="4" />
                        </div>
                        <div className="lanc">
                            <img className='sanci' src="slideimage/fam/fam4.avif" alt="5" />
                        </div>
                        <div className="lanc">
                            <img className='sanci' src="slideimage/fam/fam5.avif" alt="6" />
                        </div>
                        <div className="lanc">
                            <img className='sanci' src="slideimage/fam/fam6.avif" alt="7" />
                        </div>
                        <div className="lanc">
                            <img className='sanci' src="slideimage/fam/fam7.avif" alt="8" />
                        </div>
                    </div>
                    <div className="but2">
                        <div className="p">
                            <button className='Ib1' id='' onClick={() => san('-')}>p</button>
                        </div>
                        <div className="n">
                            <button className='Ib1' id='' onClick={() => san('+')}>n</button>
                        </div>
                    </div>
                </div>
                <div className="lan" id='wan'>
                    <h1 className="lh">WWE Originals &gt;</h1>
                    <div className="wanp" id='wap'>
                        <div className="wanc">
                            <img className='wanci' src="slideimage/fam/fam0.avif" alt="1" />
                        </div>
                        <div className="wanc">
                            <img className='wanci' src="slideimage/fam/fam0.avif" alt="1" />
                        </div>
                        <div className="wanc">
                            <img className='wanci' src="slideimage/fam/fam0.avif" alt="1" />
                        </div>
                        <div className="wanc">
                            <img className='wanci' src="slideimage/fam/fam0.avif" alt="1" />
                        </div>
                        <div className="wanc">
                            <img className='wanci' src="slideimage/fam/fam0.avif" alt="1" />
                        </div>
                        <div className="wanc">
                            <img className='wanci' src="slideimage/fam/fam0.avif" alt="1" />
                        </div>
                        <div className="wanc">
                            <img className='wanci' src="slideimage/fam/fam0.avif" alt="1" />
                        </div>
                        <div className="wanc">
                            <img className='wanci' src="slideimage/fam/fam0.avif" alt="1" />
                        </div>
                        <div className="wanc">
                            <img className='wanci' src="slideimage/fam/fam0.avif" alt="1" />
                        </div>
                        <div className="wanc">
                            <img className='wanci' src="slideimage/fam/fam0.avif" alt="1" />
                        </div>
                        <div className="wanc">
                            <img className='wanci' src="slideimage/fam/fam0.avif" alt="1" />
                        </div>
                        <div className="wanc">
                            <img className='wanci' src="slideimage/fam/fam0.avif" alt="1" />
                        </div>
                    </div>
                    <div className="but3">
                        <div className="p">
                            <button className='Ib1' onClick={() => wan('-')}>p</button>
                        </div>
                        <div className="n">
                            <button className='Ib1' onClick={() => wan('+')}>n</button>
                        </div>
                    </div>
                </div>
                <div className="lan" id='Han'>
                    <h1 className="lh">Hollywood </h1>
                    <div className="wanp" id='Hap'>
                        <div className="wanc">
                            <img className='wanci' src="slideimage/fam/fam0.avif" alt="1" />
                        </div>
                        <div className="wanc">
                            <img className='wanci' src="slideimage/fam/fam0.avif" alt="1" />
                        </div>
                        <div className="wanc">
                            <img className='wanci' src="slideimage/fam/fam0.avif" alt="1" />
                        </div>
                        <div className="wanc">
                            <img className='wanci' src="slideimage/fam/fam0.avif" alt="1" />
                        </div>
                        <div className="wanc">
                            <img className='wanci' src="slideimage/fam/fam0.avif" alt="1" />
                        </div>
                        <div className="wanc">
                            <img className='wanci' src="slideimage/fam/fam0.avif" alt="1" />
                        </div>
                        <div className="wanc">
                            <img className='wanci' src="slideimage/fam/fam0.avif" alt="1" />
                        </div>
                        <div className="wanc">
                            <img className='wanci' src="slideimage/fam/fam0.avif" alt="1" />
                        </div>
                        <div className="wanc">
                            <img className='wanci' src="slideimage/fam/fam0.avif" alt="1" />
                        </div>
                        <div className="wanc">
                            <img className='wanci' src="slideimage/fam/fam0.avif" alt="1" />
                        </div>
                        <div className="wanc">
                            <img className='wanci' src="slideimage/fam/fam0.avif" alt="1" />
                        </div>
                        <div className="wanc">
                            <img className='wanci' src="slideimage/fam/fam0.avif" alt="1" />
                        </div>
                    </div>
                    <div className="but4">
                        <div className="p">
                            <button className='Ib1' onClick={() => wan('-')}>p</button>
                        </div>
                        <div className="n">
                            <button className='Ib1' onClick={() => wan('+')}>n</button>
                        </div>
                    </div>
                </div>
                <div className="lan" id='ban'>
                    <h1 className="lh">Bollywood </h1>
                    <div className="wanp" id='bap'>
                        <div className="wanc">
                            <img className='wanci' src="slideimage/fam/fam0.avif" alt="1" />
                        </div>
                        <div className="wanc">
                            <img className='wanci' src="slideimage/fam/fam0.avif" alt="1" />
                        </div>
                        <div className="wanc">
                            <img className='wanci' src="slideimage/fam/fam0.avif" alt="1" />
                        </div>
                        <div className="wanc">
                            <img className='wanci' src="slideimage/fam/fam0.avif" alt="1" />
                        </div>
                        <div className="wanc">
                            <img className='wanci' src="slideimage/fam/fam0.avif" alt="1" />
                        </div>
                        <div className="wanc">
                            <img className='wanci' src="slideimage/fam/fam0.avif" alt="1" />
                        </div>
                        <div className="wanc">
                            <img className='wanci' src="slideimage/fam/fam0.avif" alt="1" />
                        </div>
                        <div className="wanc">
                            <img className='wanci' src="slideimage/fam/fam0.avif" alt="1" />
                        </div>
                        <div className="wanc">
                            <img className='wanci' src="slideimage/fam/fam0.avif" alt="1" />
                        </div>
                        <div className="wanc">
                            <img className='wanci' src="slideimage/fam/fam0.avif" alt="1" />
                        </div>
                        <div className="wanc">
                            <img className='wanci' src="slideimage/fam/fam0.avif" alt="1" />
                        </div>
                        <div className="wanc">
                            <img className='wanci' src="slideimage/fam/fam0.avif" alt="1" />
                        </div>
                    </div>
                    <div className="but5">
                        <div className="p">
                            <button className='Ib1' onClick={() => wan('-')}>p</button>
                        </div>
                        <div className="n">
                            <button className='Ib1' id='' onClick={() => wan('+')}>n</button>
                        </div>
                    </div>
                </div>
                <div className="lan" id='aan'>
                    <h1 className="lh">Animated </h1>
                    <div className="wanp" id='aap'>
                        <div className="wanc">
                            <img className='wanci' src="slideimage/fam/fam0.avif" alt="1" />
                        </div>
                        <div className="wanc">
                            <img className='wanci' src="slideimage/fam/fam0.avif" alt="1" />
                        </div>
                        <div className="wanc">
                            <img className='wanci' src="slideimage/fam/fam0.avif" alt="1" />
                        </div>
                        <div className="wanc">
                            <img className='wanci' src="slideimage/fam/fam0.avif" alt="1" />
                        </div>
                        <div className="wanc">
                            <img className='wanci' src="slideimage/fam/fam0.avif" alt="1" />
                        </div>
                        <div className="wanc">
                            <img className='wanci' src="slideimage/fam/fam0.avif" alt="1" />
                        </div>
                        <div className="wanc">
                            <img className='wanci' src="slideimage/fam/fam0.avif" alt="1" />
                        </div>
                        <div className="wanc">
                            <img className='wanci' src="slideimage/fam/fam0.avif" alt="1" />
                        </div>
                        <div className="wanc">
                            <img className='wanci' src="slideimage/fam/fam0.avif" alt="1" />
                        </div>
                        <div className="wanc">
                            <img className='wanci' src="slideimage/fam/fam0.avif" alt="1" />
                        </div>
                        <div className="wanc">
                            <img className='wanci' src="slideimage/fam/fam0.avif" alt="1" />
                        </div>
                        <div className="wanc">
                            <img className='wanci' src="slideimage/fam/fam0.avif" alt="1" />
                        </div>
                    </div>
                    <div className="but6">
                        <div className="p">
                            <button className='Ib1' onClick={() => wan('-')}>p</button>
                        </div>
                        <div className="n">
                            <button className='Ib1' onClick={() => wan('+')}>n</button>
                        </div>
                    </div>
                </div>
                <div className="ifoo"></div>
                <div className="indfoo">
                    <div className="ifp1">
                        <div className="ifc1 ifc2">1</div>
                        <div className="ifc1 ifc2">2</div>
                        <div className="ifc1 ifc2">3</div>
                        <div className="ifc1 ifc2">4</div>
                        <div className="ifc1 ifc2">5</div>
                        <div className="ifc1">1</div>
                        <div className="ifc1">2</div>
                        <div className="ifc1">3</div>
                        <div className="ifc1">4</div>
                        <div className="ifc1">5</div>
                        <div className="ifc1">1</div>
                        <div className="ifc1">2</div>
                        <div className="ifc1">3</div>
                        <div className="ifc1">4</div>
                        <div className="ifc1">5</div>
                        <div className="ifc1">1</div>
                        <div className="ifc1">2</div>
                        <div className="ifc1">3</div>
                        <div className="ifc1">4</div>
                        <div className="ifc1">5</div>
                        <div className="ifc1">1</div>
                        <div className="ifc1">2</div>
                        <div className="ifc1">3</div>
                        <div className="ifc1">4</div>
                        <div className="ifc1">5</div>
                        <div className="ifc1">1</div>
                        <div className="ifc1">2</div>
                        <div className="ifc1">3</div>
                        <div className="ifc1">4</div>
                        <div className="ifc1">5</div>
                        <div className="ifc1">1</div>
                        <div className="ifc1">2</div>
                        <div className="ifc1">3</div>
                        <div className="ifc1">4</div>
                        <div className="ifc1">5</div>
                    </div>
                    <div className="ifp1">
                        <div className="ifc1 ifc2">1</div>
                        <div className="ifc1 ifc2">2</div>
                        <div className="ifc1 ifc2">3</div>
                        <div className="ifc1 ifc2">4</div>
                        <div className="ifc1 ifc2">5</div>
                        <div className="ifc1">1</div>
                        <div className="ifc1">2</div>
                        <div className="ifc1">3</div>
                        <div className="ifc1">4</div>
                        <div className="ifc1">5</div>
                        <div className="ifc1">1</div>
                        <div className="ifc1">2</div>
                        <div className="ifc1">3</div>
                        <div className="ifc1">4</div>
                        <div className="ifc1">5</div>
                        <div className="ifc1">1</div>
                        <div className="ifc1">2</div>
                        <div className="ifc1">3</div>
                        <div className="ifc1">4</div>
                        <div className="ifc1">5</div>
                        <div className="ifc1">1</div>
                        <div className="ifc1">2</div>
                        <div className="ifc1">3</div>
                        <div className="ifc1">4</div>
                        <div className="ifc1">5</div>
                        <div className="ifc1">1</div>
                        <div className="ifc1">2</div>
                        <div className="ifc1">3</div>
                        <div className="ifc1">4</div>
                        <div className="ifc1">5</div>
                        <div className="ifc1">1</div>
                        <div className="ifc1">2</div>
                        <div className="ifc1">3</div>
                        <div className="ifc1">4</div>
                        <div className="ifc1">5</div>
                    </div>
                    <div className="fl">
                        <ul className="ful">
                            <li className="fli">Terms of Use</li>
                            <li className="fli">Privacy Policy</li>
                            <li className="fli">FAQs</li>
                            <li className="fli">Contact Us</li>
                            <li className="fli">Advertise With Us</li>
                            <li className="fli">Content Redressal Mechanism</li>
                            <li className="fli">3.5.93</li>
                        </ul>
                        <div className="fd">© 2024 Sony Pictures Networks India Pvt. Ltd.</div>
                    </div>
                </div>
            </div>
        </>
    )
}

export default Index1