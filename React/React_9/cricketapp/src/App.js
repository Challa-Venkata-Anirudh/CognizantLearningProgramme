// src/App.js
import React from 'react';
import ListofPlayers from './ListofPlayers';
import Scorebelow70 from './Scorebelow70';
import OddPlayers from './OddPlayers';
import EvenPlayers from './EvenPlayers';
import ListofIndianPlayers from './ListofIndianPlayers';

function App() {
  const flag = true;

  const players = [
    { name: 'Player 1', score: 88 },
    { name: 'Player 2', score: 55 },
    { name: 'Player 3', score: 90 },
    { name: 'Player 4', score: 40 },
    { name: 'Player 5', score: 75 },
    { name: 'Player 6', score: 65 },
    { name: 'Player 7', score: 85 },
    { name: 'Player 8', score: 30 },
    { name: 'Player 9', score: 95 },
    { name: 'Player 10', score: 68 },
    { name: 'Player 11', score: 72 }
  ];

  const IndianTeam = ['Virat', 'Rohit', 'Dhoni', 'Kohli', 'Ashwin', 'Jadeja'];

  const T20players = ['Bumrah', 'Surya'];
  const RanjiTrophy = ['Pujara', 'Rahane'];

  const IndianPlayers = [...T20players, ...RanjiTrophy]; // Merge using spread

  if (flag === true) {
    return (
      <div>
        <h1>List of Players</h1>
        <ListofPlayers players={players} />
        <hr />
        <h1>List of Players having Scores Less than 70</h1>
        <Scorebelow70 players={players} />
      </div>
    );
  } else {
    return (
      <div>
        <div>
          <h1>Indian Team</h1>
          <h1>Odd Players</h1>
          <OddPlayers IndianTeam={IndianTeam} />
          <hr />
          <h1>Even Players</h1>
          <EvenPlayers IndianTeam={IndianTeam} />
        </div>
        <hr />
        <div>
          <h1>List of Indian Players Merged:</h1>
          <ListofIndianPlayers IndianPlayers={IndianPlayers} />
        </div>
      </div>
    );
  }
}

export default App;
