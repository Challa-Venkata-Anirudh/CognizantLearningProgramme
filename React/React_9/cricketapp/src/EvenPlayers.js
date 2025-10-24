// src/EvenPlayers.js
import React from 'react';

function EvenPlayers({ IndianTeam }) {
  const evenPlayers = IndianTeam.filter((_, index) => index % 2 === 0);
  return (
    <ul>
      {evenPlayers.map((player, index) => (
        <li key={index}>{player}</li>
      ))}
    </ul>
  );
}

export default EvenPlayers;
