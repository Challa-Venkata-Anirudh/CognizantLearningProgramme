import React from 'react';
import CohortDetails from './CohortDetails';

function App() {
  const cohortData = {
    cohortCode: "COH-1024",
    technology: "React JS",
    trainerName: "Aditi Rao",
    coachName: "Siddharth Mehra",
    startDate: "2025-07-15",
    currentStatus: "Ongoing"
  };

  return (
    <div className="App">
      <h1>Welcome to Cohort Dashboard</h1>
      <CohortDetails cohort={cohortData} />
    </div>
  );
}

export default App;
