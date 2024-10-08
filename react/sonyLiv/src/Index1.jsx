import React from 'react'
import './Index1.css'

function Index1() {

    var x = document.getElementById("iani")

    function moveSlidep() {
        x.style.transform = "translatex(-100%)"
    }
    function moveSliden() {
        alert('next')
    }

    return (
        <>
            <div className="index">
                <div className="ian">
                    <div className="iani" id='iani'>
                        <div className="ia1"><img src="/slideimage/indianidol2024_rev_27sep_masthead_web_v1.avif" alt="" /></div>
                        <div className="ia2"><img src="/slideimage/manvatmurders2_3oct_masthead_web_v1_5.avif" alt="" /></div>
                        <div className="ia3"><img src="/slideimage/kbc2024_4oct_masthead_web_v1.avif" alt="" /></div>
                        <div className="ia4"><img src="/slideimage/uel_md2_fc_porto_vs_manunited_hls_masthead_web_v1.avif" alt="" /></div>
                    </div>
                    <button className="prev" onClick={moveSlidep}>&#10094;</button>
                    <button className="next" onClick={moveSliden}>&#10095;</button>
                </div>
            </div>
        </>
    )
}

export default Index1