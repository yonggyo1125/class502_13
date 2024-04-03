import { useState } from 'react';

const Counter = () => {
  const [number, setNumber] = useState(0);

  return (
    <>
      <h1>{number}</h1>
      <button type="button" onClick={setNumber(number + 1)}>
        +1
      </button>
      <button type="button" onClick={setNumber(number - 1)}>
        -1
      </button>
    </>
  );
};

export default Counter;
