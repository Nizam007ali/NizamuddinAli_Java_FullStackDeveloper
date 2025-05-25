import React from 'react'

function MovieCard({movie}) {
  return (
    <div style={{ border: '1px solid #ccc', marginBottom: '10px', padding: '10px' }}>
      <img src={movie.poster} alt={movie.name} width="150" />
      <h3>{movie.name}</h3>
      <p><strong>Director:</strong> {movie.director}</p>
      <p><strong>Genres:</strong> {movie.genre.join(', ')}</p>
      <p><strong>IMDb:</strong> {movie.preRating.IMDb}</p>
    </div>
  )
}

export default MovieCard