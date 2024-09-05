'use client';
import React, { useState } from 'react';

function getAverage(nums) {
  if (nums.length === 0) return 0;

  const total = nums.reduce((a, b) => a + b);
  return total / nums.length;
}

const Calculator = () => {
  const [numbers, setNumbers] = useState([]);

  const avg = getAverage(numbers);

  return (
    <>
      <form autoComplete="off" onSubmit={onSubmit}>
        <input type="number" onChange={onChange} />
        <button type="submit">숫자 추가하기</button>
      </form>
    </>
  );
};

export default Calculator;
