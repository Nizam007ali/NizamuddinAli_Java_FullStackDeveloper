import React from 'react'

function SeriesCard() {
  return (
    <div style={{ border: '1px solid #ccc', marginBottom: '10px', padding: '10px' }}>
      <img src={series.poster} alt={series.name} width="150" />
      <h3>{series.name} - {series.seasonName} - {series.episodeName}</h3>
      <p><strong>Director:</strong> {series.director}</p>
      <p><strong>Genres:</strong> {series.genre.join(', ')}</p>
      <p><strong>IMDb:</strong> {series.preRating.IMDb}</p>
    </div>
  )
}

export default SeriesCard