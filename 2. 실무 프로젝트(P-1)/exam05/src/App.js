import { Routes, Route } from 'react-router-dom';

import Home from './pages/Home';
import About from './pages/About';
import Board from './pages/Board';
import BoardList from './pages/BoardList';
import MainLayout from './layouts/MainLayout';

const App = () => {
  return (
    <Routes>
     <Route path="/" element={<MainLayout />}>
        
     </Route>
    </Routes>
  );
};

export default App;
