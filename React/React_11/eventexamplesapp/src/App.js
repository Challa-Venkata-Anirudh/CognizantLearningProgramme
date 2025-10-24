// src/App.js
import React, { useState } from 'react';
import CurrencyConvertor from './CurrencyConvertor';

function App() {
  const [count, setCount] = useState(5);

  // Multiple methods for Increment button
  const handleIncrement = () => {
    setCount(prev => prev + 1);
    sayHello();
  };

  const sayHello = () => {
    alert('Hello! Member1');
  };

  const sayWelcome = (message) => {
    alert(message);
  };

  const handleClick = (e) => {
    alert("I was clicked");
  };

  return (
    <div className="App" style={{ padding: "20px" }}>
      <p>{count}</p>
      <button onClick={handleIncrement}>Increment</button>
      <br /><br />
      <button onClick={() => setCount(count - 1)}>Decrement</button>
      <br /><br />
      <button onClick={() => sayWelcome("Welcome")}>Say welcome</button>
      <br /><br />
      <button onClick={handleClick}>Click on me</button>

      <hr />

      <CurrencyConvertor />
    </div>
  );
}

export default App;
