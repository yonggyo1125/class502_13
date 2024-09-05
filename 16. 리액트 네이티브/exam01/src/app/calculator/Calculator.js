'use client';
import React, { useState, useMemo } from 'react';

function getAverage(nums) {
  console.log('getAverage() 함수 호출!!!');
  if (nums.length === 0) return 0;

  const total = nums.reduce((a, b) => a + b);
  return total / nums.length;
}

const Calculator = () => {
  const [numbers, setNumbers] = useState([]);
  const [number, setNumber] = useState();

  const avg = useMemo(() => getAverage(numbers), [numbers]);

  const onSubmit = (e) => {
    e.preventDefault();
    setNumbers((numbers) => numbers.concat(number));
  };

  const onChange = (e) => {
    const num = e.target.value;
    setNumber(Number(num));
  };
  return (
    <>
      <form autoComplete="off" onSubmit={onSubmit}>
        <input type="number" onChange={onChange} />
        <button type="submit">숫자 추가하기</button>
      </form>
      <ul>
        {numbers.map((n, i) => (
          <li key={i}>{n}</li>
        ))}
      </ul>
      <div>평균: {avg}</div>
    </>
  );
};

export default Calculator;
