import React from 'react';

function CohortDetails(props) {
    return (
        <div>
            <h2>Cohort Details</h2>
            <p><strong>Cohort Code:</strong> {props.cohort.cohortCode}</p>
            <p><strong>Technology:</strong> {props.cohort.technology}</p>
            <p><strong>Trainer Name:</strong> {props.cohort.trainerName}</p>
            <p><strong>Coach Name:</strong> {props.cohort.coachName}</p>
            <p><strong>Start Date:</strong> {props.cohort.startDate}</p>
            <p><strong>Current Status:</strong> {props.cohort.currentStatus}</p>
        </div>
    );
}

export default CohortDetails;
