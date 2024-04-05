import { useState, useCallback } from 'react';

const Counter = () => {
  const [number, setNumber] = useState(0);

  const plus = useCallback(() => setNumber((number) => number + 1), []);
  const minus = useCallback(() => setNumber((number) => number - 1), []);

  return (
    <>
      <h1>{number}</h1>
      <button type="button" onClick={plus}>
        +1
      </button>
      <button type="button" onClick={minus}>
        -1
      </button>
    </>
  );
};

export default Counter;
