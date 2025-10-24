// src/App.js
import React from 'react';
import './App.css';

function App() {
  const offices = [
    {
      name: 'DBS',
      rent: 50000,
      address: 'Chennai',
      image: 'https://img.staticmb.com/mbcontent/images/uploads/2022/11/DBS%20Business%20Center.jpg'
    },
    {
      name: 'WeWork',
      rent: 75000,
      address: 'Bangalore',
      image: 'https://assets.weforum.org/article/image/large_w7Vjs7hhEDkF9f0ZKfvGnV7BqzAAM69SfQs0YzphsQs.jpg'
    },
    {
      name: 'Regus',
      rent: 58000,
      address: 'Mumbai',
      image: 'https://www.regus.com/images/india/mumbai-office-space.jpg'
    }
  ];

  return (
    <div className="App">
      <h1 style={{ fontWeight: 'bold' }}>Office Space, at Affordable Range</h1>

      {offices.map((office, index) => (
        <div key={index} className="office-card">
          <img
            src={office.image}
            alt={`Office ${office.name}`}
            style={{ width: '400px', height: '300px' }}
          />
          <h2>Name: {office.name}</h2>
          <p
            style={{
              color: office.rent < 60000 ? 'red' : 'green',
              fontWeight: 'bold'
            }}
          >
            Rent: Rs. {office.rent}
          </p>
          <p><strong>Address:</strong> {office.address}</p>
        </div>
      ))}
    </div>
  );
}

export default App;
