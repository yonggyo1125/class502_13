import React from 'react';
import Greeting from './components/Greeting';

const Counter = () => {
  const num = 10;
  const visible = false;

  return (
    <>
      <Greeting name="김이름" age={40} />
      {/* 주석.... */}
      <h1 style={{ backgroundColor: 'skyblue', color: 'blue' }}>{num}</h1>
      <button
        type="button" // 주석
      >
        -1
      </button>
      <button type="button">+1</button>
      {visible && <h1>보일까?</h1>}
    </>
  );
};

export default Counter;
