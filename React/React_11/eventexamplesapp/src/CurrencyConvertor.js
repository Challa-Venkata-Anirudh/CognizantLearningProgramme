// src/CurrencyConvertor.js
import React, { useState } from 'react';

function CurrencyConvertor() {
  const [amount, setAmount] = useState('');
  const [currency, setCurrency] = useState('');
  const [converted, setConverted] = useState('');

  const handleSubmit = (e) => {
    e.preventDefault();
    const conversionRate = 0.011; // INR to EURO (static example)
    const euro = parseFloat(amount) * conversionRate;
    setConverted(`€${euro.toFixed(2)} (${currency})`);
  };

  return (
    <div>
      <h2 style={{ color: 'green' }}>Currency Convertor!!!</h2>
      <form onSubmit={handleSubmit}>
        <div>
          <label>Amount: </label>
          <input
            type="text"
            value={amount}
            onChange={e => setAmount(e.target.value)}
          />
        </div>
        <br />
        <div>
          <label>Currency: </label>
          <textarea
            value={currency}
            onChange={e => setCurrency(e.target.value)}
          />
        </div>
        <br />
        <button type="submit">Submit</button>
      </form>
      <br />
      {converted && (
        <h3>Converted Amount: <span style={{ color: 'blue' }}>{converted}</span></h3>
      )}
    </div>
  );
}

export default CurrencyConvertor;
