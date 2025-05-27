import { useEffect, useRef, useState } from 'react'
import './App.css'

function App() {

  const [mindex, setmindex] = useState(0);
  const [sindex, setsindex] = useState(0);
  const [gsindex, setgsindex] = useState(0);
  const [gcsindex, setgcsindex] = useState(0);
  const [mcount, setmcount] = useState(0);
  const [scount, setscount] = useState(0);
  const [gscount, setgscount] = useState(0);
  const [gcscount, setgcscount] = useState(0);
  const [movies, setmovies] = useState([]);
  const [searchmovies, setsearchmovies] = useState([]);
  const [series, setseries] = useState([]);
  const [search, setsearch] = useState('');
  const currentlyPlaying = useRef(null);
  const gramPanchayatRef = useRef(null);
  const moviesRef = useRef(null);
  const gullakRef = useRef(null);

  const scrollTo = (e) => {
    if (e == 'gramPanchayat')
      gramPanchayatRef.current.scrollIntoView({ behavior: "smooth" });
    if (e == 'gullak')
      gullakRef.current.scrollIntoView({ behavior: "smooth" });
    if (e == 'movies')
      moviesRef.current.scrollIntoView({ behavior: "smooth" });
  }

  useEffect(() => {
    fetch("http://localhost:3000/movies")
      .then((res) => res.json())
      .then((data) => {
        setmovies(data);
        setmcount(data.length);
      })
      .catch((error) => console.error(error));

    fetch("http://localhost:3000/series")
      .then((res) => res.json())
      .then((data) => {
        setseries(data);
        setscount(data.length);
        const cnt = data.filter(element => element.name === "Gullak").length;
        const cnt1 = data.filter(element => element.name === "Gram Chikitsalaya").length;
        setgscount(cnt);
        setgcscount(cnt1);
      })
      .catch((error) => console.error(error));
  }, []);

  const handleNavigate = (name, direction) => {
    if (name === 'movie') {
      if (direction === 'next') {
        setmindex((prev) => (prev + 1) % Math.max(mcount - 2, 1));
      }
      if (direction === 'prev') {
        setmindex((prev) => (prev - 1 + Math.max(mcount - 2, 1)) % Math.max(mcount - 2, 1));
      }
    }
    if (name === 'gseries') {
      if (direction === 'next') {
        setgsindex((prev) => (prev + 1) % Math.max(gscount - 2, 1));
      }
      if (direction === 'prev') {
        setgsindex((prev) => (prev - 1 + Math.max(gscount - 2, 1)) % Math.max(gscount - 2, 1));
      }
    }
    if (name === 'gcseries') {
      if (direction === 'next') {
        setgcsindex((prev) => (prev + 1) % Math.max(gcscount - 2, 1));
      }
      if (direction === 'prev') {
        setgcsindex((prev) => (prev - 1 + Math.max(gcscount - 2, 1)) % Math.max(gcscount - 2, 1));
      }
    }
  }

  const handleVideoPlay = (e) => {
    if (currentlyPlaying.current && currentlyPlaying.current != e.target) {
      currentlyPlaying.current.pause();
      currentlyPlaying.current.currentTime = 0;
    }
    currentlyPlaying.current = e.target;
  }

  const handleSearch = (e) => {
    const searchterm = e.target.value.toLowerCase();
    document.getElementById("sel").style.display = 'block';
    setsearch(searchterm);
    if (searchterm === "") {
      setsearchmovies([])
    }
    else {
      const moviefilter = movies.filter((movie) => movie.name.toLowerCase().includes(searchterm));
      const seriesfilter = series.filter((movie) => movie.name.toLowerCase().includes(searchterm));
      const sortedResult = [...moviefilter, ...seriesfilter].sort(
        (a, b) => b.likes - a.likes
      );
      setsearchmovies(sortedResult)
    }
  }

  return (<>
    <nav>
      <button className='navbut' onClick={() => scrollTo('movies')}>Movies</button>
      <button className='navbut' onClick={() => scrollTo('gullak')}>Gullak Series</button>
      <button className='navbut' onClick={() => scrollTo('gramPanchayat')}>Gram Chikitsalaya Series</button>
      <input type="text" name='search' value={search} onChange={(e) => handleSearch(e)} />
    </nav>
    <div className='a'>
      <div className="searchelement" id='sel'>
        {
          searchmovies.slice(0, 4).map((m) => (
            <div key={m.id} className='searchDiv'>
              <video className='searchvid' src={m.path} controls onPlay={(e) => handleVideoPlay(e)} />
              <div style={{ "paddingLeft": '5px' }}>
                <h3>{m.name}</h3>
                <h3>{m.seasonName}</h3>
                <h3>{(m.episodeName && m.episodeName !== "") ? m.episodeName.slice(0, 10) : ""}</h3>
              </div>
            </div>
          ))
        }
        {Array.from({ length: Math.ceil(searchmovies.length / 4) }, (_, i) => (
          <div key={i} className="spage">{i + 1}</div>
        ))}
      </div>
      <h2 ref={moviesRef}>Movies</h2>
      <button className='mbut butl' onClick={() => handleNavigate('movie', 'prev')}>prev</button>
      <button className='mbut butr' onClick={() => handleNavigate('movie', 'next')}>next</button>
      <div className='mpar'>
        {
          movies.slice(mindex, mindex + 3).map((m) => (
            <div key={m.id} className='mchi'>
              <video src={m.path} controls onPlay={(e) => handleVideoPlay(e)} />
              <h3>{m.name} </h3>
            </div>
          ))
        }
      </div>
      <h2 ref={gullakRef}>Gullak Series</h2>
      <button className='mbut1 butl' onClick={() => handleNavigate('gseries', 'prev')}>prev</button>
      <button className='mbut1 butr' onClick={() => handleNavigate('gseries', 'next')}>next</button>
      <div className='mpar'>
        {
          series.filter(s => s.name === 'Gullak').slice(gsindex, gsindex + 3).map((m) => (
            <div key={m.id} className='mchi'>
              <video src={m.path} controls onPlay={(e) => handleVideoPlay(e)} />
              <h3>{m.name} {m.seasonName} {m.episodeName.slice(0, 10)}</h3>
            </div>
          ))
        }
      </div><h2 ref={gramPanchayatRef}>Gram Chikitsalaya Series</h2>
      <button className='mbut2 butl' onClick={() => handleNavigate('gcseries', 'prev')}>prev</button>
      <button className='mbut2 butr' onClick={() => handleNavigate('gcseries', 'next')}>next</button>
      <div className='mpar'>
        {
          series.filter(s => s.name === 'Gram Chikitsalaya').slice(gcsindex, gcsindex + 3).map((m) => (
            <div key={m.id} className='mchi'>
              <video src={m.path} controls onPlay={(e) => handleVideoPlay(e)} />
              <h3>{m.name} {m.seasonName} {m.episodeName}</h3>
            </div>
          ))
        }
      </div>
    </div>
  </>
  )
}

export default App
