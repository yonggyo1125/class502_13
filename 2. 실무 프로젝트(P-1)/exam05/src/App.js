import { Routes, Route } from 'react-router-dom';

import Home from './pages/Home';
import About from './pages/About';
import Board from './pages/Board';
import BoardList from './pages/BoardList';
import MainLayout from './layouts/MainLayout';
import NotFound from './pages/NotFound';

const App = () => {
  return (
    <Routes>
      <Route element={<MainLayout />}>
        <Route index element={<Home />} /> {/* / */}
        <Route path="about" element={<About />} /> {/* /about */}
        <Route path="board" element={<BoardList />} />
        <Route path="*" element={<NotFound />} />
      </Route>
    </Routes>
  );
};

export default App;
