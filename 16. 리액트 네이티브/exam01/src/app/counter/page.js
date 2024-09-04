'use client';
import React, { useState } from 'react';

const Counter = () => {
  const [num, setNum] = useState(0);

  let num2 = 1;

  const onIncrease = () => {
    setNum(num + 1);
    num2++;
    console.log('num2', num2);
  };

  const onDecrease = () => setNum(num - 1);
  return (
    <>
      <h1>{num}</h1>
      <button type="button" onClick={onDecrease}>
        -1
      </button>
      <button type="button" onClick={onIncrease}>
        +1
      </button>
    </>
  );
};

export default Counter;
