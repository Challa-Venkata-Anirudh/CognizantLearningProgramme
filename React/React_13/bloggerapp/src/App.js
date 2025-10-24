import React, { useState } from 'react';
import CourseDetails from './components/CourseDetails';
import BookDetails from './components/BookDetails';
import BlogDetails from './components/BlogDetails';
import './App.css';

function App() {
  const [view, setView] = useState("course");

  return (
    <div className="App">
      <h1>Blogger App</h1>
      <div className="button-group">
        <button onClick={() => setView("course")}>Show Courses</button>
        <button onClick={() => setView("book")}>Show Books</button>
        <button onClick={() => setView("blog")}>Show Blogs</button>
      </div>
      <div className="container">
        <CourseDetails show={view === "course"} />
        <BookDetails show={view === "book"} />
        <BlogDetails show={view === "blog"} />
      </div>
    </div>
  );
}

export default App;
