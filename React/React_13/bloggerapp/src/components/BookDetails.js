import React from 'react';

const BookDetails = ({ show }) =>
  show ? (
    // Conditional Rendering using ternary operator
    <div>
      <h2>Book Details</h2>
      <h3>Master React</h3>
      <p>670</p>
      <h3>Deep Dive into Angular 11</h3>
      <p>800</p>
      <h3>Mongo Essentials</h3>
      <p>450</p>
    </div>
  ) : null;

export default BookDetails;
