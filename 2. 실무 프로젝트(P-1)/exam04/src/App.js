import { useState } from 'react';
import LifeCycle from './components/LifeCycle';

const App = () => {
  const [visible, setVisible] = useState(true);

  return (
    <>
      {visible && <LifeCycle mode="even" />}
      <button type="button" onClick={() => setVisible(!visible)}>
        클릭
      </button>
    </>
  );
};

export default App;
