import { useState } from 'react';

const Counter = () => {
  let num = 10;
  console.log('렌더링!', 'num', num);

  const [number, setNumber] = useState(0);

  const plus = () => {
    num++;
    setNumber(number + 1);
  };
  const minus = () => setNumber(number - 1);

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
