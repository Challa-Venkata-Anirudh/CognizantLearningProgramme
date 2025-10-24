// src/components/FlightDetails.js
import React from 'react';

function FlightDetails({ showBooking = false }) {
  const flights = [
    { id: 1, from: 'Delhi', to: 'Mumbai', price: 5000 },
    { id: 2, from: 'Chennai', to: 'Bangalore', price: 3000 },
    { id: 3, from: 'Hyderabad', to: 'Kolkata', price: 4500 }
  ];

  return (
    <div className="flight-table">
      <h2></h2>
      <table border="1" cellPadding="8">
        <thead>
          <tr>
            <th>From</th>
            <th>To</th>
            <th>Price</th>
            {showBooking && <th>Action</th>}
          </tr>
        </thead>
        <tbody>
          {flights.map(flight => (
            <tr key={flight.id}>
              <td>{flight.from}</td>
              <td>{flight.to}</td>
              <td>₹{flight.price}</td>
              {showBooking && (
                <td>
                  <button onClick={() => alert(`Booked flight ${flight.id}!`)}>
                    Book Now
                  </button>
                </td>
              )}
            </tr>
          ))}
        </tbody>
      </table>
    </div>
  );
}

export default FlightDetails;
