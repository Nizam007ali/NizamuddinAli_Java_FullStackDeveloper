import React from 'react'
import './search.css'
import { IoMdClose } from "react-icons/io";
import { Link } from 'react-router-dom';
import { FaCrown } from "react-icons/fa";

function Search() {
  return (
    <>
    <div className="search">
        <div className="searchbar"><input type="text" placeholder='Search for movies, shows, sports etc.' className='sinp'/></div>
        <div className="secls"><Link to='/'><IoMdClose/></Link></div>
        <div className="searchps"><h2 className='spsh2'>Popular Searches</h2></div>
        <div className="spsgp">
        <div className="spshc"><img src="/searchimage/ucl24_25_1_generic_portrait_thumb.avif" alt="" /></div>
        <div className="spshc"><img src="/searchimage/australia_tour_of_england_2024_gob_portrait_thumb_dated.avif" alt="" /></div>
        <div className="spshc"><img src="/searchimage/1725622528779_KBC2024_10_Portrait_Thumb.avif" alt="" /></div>
        <div className="spshc"><img src="/searchimage/turbo_malayalam_rev1_newmovie_8aug_portrait_thumb_clean.avif" alt="" /></div>
        <div className="spshc"><img src="/searchimage/gullak_26june_portrait_thumb.avif" alt="" /></div>
        <div className="spshc"><img src="/searchimage/brinda1_portrait_thumb.avif" alt="" /></div>
        <div className="spshc"><img src="/searchimage/raisinghanivsraisinghani_portrait_thumb.avif" alt="" /></div>
        <div className="spshc"><img src="/searchimage/1717235763479_scam2003thetelgistory_1may_portrati_thumb.avif" alt="" /></div>
        <div className="spshc"><img src="/searchimage/maharani_1june_promo_portrait_thumbnail.avif" alt="" /></div>
        <div className="spshc"><img src="/searchimage/indianidol2023_24_portrait_thumb_9.avif" alt="" /></div>
        <div className="spshc"><img src="/searchimage/barsatein_15nov_portrait_thumb.avif" alt="" /></div>
        <div className="spshc"><img src="/searchimage/1723469227685_RAMAYAN_5_Portrait_Thumb.avif" alt="" /></div>
        <div className="spshc"><img src="/searchimage/baalveer4_3_portrait_thumb.avif" alt="" /></div>
        <div className="spshc"><img src="/searchimage/tmkoc23_16_portrait_thumb.avif" alt="" /></div>
        <div className="spshc"><img src="/searchimage/Pushpa1_Portrait_Thumb.avif" alt="" /></div>
        <div className="spshc"><img src="/searchimage/WaglekiDuniya_Portrait_Thumb.avif" alt="" /></div>
        </div>
    </div>
    </>
  )
}

export default Search