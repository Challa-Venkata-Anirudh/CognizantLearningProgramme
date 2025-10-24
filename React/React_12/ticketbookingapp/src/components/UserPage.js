// src/components/UserPage.js
import React from 'react';
import FlightDetails from './FlightDetails';

function UserPage({ handleLogout }) {
  return (
    <div>
      <h1>Welcome Back, User!</h1>
      <FlightDetails showBooking={true} />
      <button onClick={handleLogout}>Logout</button>
    </div>
  );
}

export default UserPage;
