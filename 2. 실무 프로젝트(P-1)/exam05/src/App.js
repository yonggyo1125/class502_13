import { Routes, Route } from 'react-router-dom';

import Home from './pages/Home';
import About from './pages/About';
import Board from './pages/Board';
import BoardList from './pages/BoardList';

const App = () => {
  return (
    <Routes>
      <Route index element={<Home />} />
      <Route path="/about" element={<About />} />
      <Route path="/board" element={<BoardList />}>
        <Route path="view/:id" element={<Board />} /> {/* /board/view/:id */}
      </Route>
    </Routes>
  );
};

export default App;
