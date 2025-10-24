// src/App.js
import React, { useState } from 'react';
import GuestPage from './components/GuestPage';
import UserPage from './components/UserPage';
import './App.css';

function App() {
  const [isLoggedIn, setIsLoggedIn] = useState(false);

  const handleLogin = () => {
    setIsLoggedIn(true);
  };

  const handleLogout = () => {
    setIsLoggedIn(false);
  };

  return (
    <div style={{ textAlign: 'center', padding: '20px' }}>
      {isLoggedIn ? (
        <UserPage handleLogout={handleLogout} />
      ) : (
        <GuestPage handleLogin={handleLogin} />
      )}
    </div>
  );
}

export default App;
