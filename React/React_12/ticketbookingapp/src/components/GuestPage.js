// src/components/GuestPage.js
import React from 'react';
import FlightDetails from './FlightDetails';

function GuestPage({ handleLogin }) {
  return (
    <div>
      <h1>Welcome Guest</h1>
      <FlightDetails />
      <button onClick={handleLogin}>Login</button>
    </div>
  );
}

export default GuestPage;
