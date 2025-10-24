import logo from './logo.svg';
import './App.css';
import {CalculateScore} from '../src/Components/CalculateScore';

function App() {
  return (
    <div>
      <CalculateScore Name={"Steeve"}
      School={"Delhi Public School"}
      total={450}
      goal={500}/>
    </div>
  );
}

export default App;
