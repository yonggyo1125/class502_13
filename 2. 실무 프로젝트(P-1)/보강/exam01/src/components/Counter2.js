import React, { useState } from 'react';

const Counter2 = () => {
  const [data, setData] = useState({
    number: 0,
    name: '이이름',
  });

  const { number, name } = data;

  const decreaseFunc = (state) => ({ ...state, number: number - 1 });

  const decrease = () => {
    //setData({ ...data, number: number - 1 }); // 불변성 유지
    //setData((prevState) => ({ ...prevState, number: number - 1 }));
   // setData((prevState) => decreaseFunc(prevState));
    setData(decreaseFunc);
  };

  const increase = () => {
    setData((prevState) => ({ ...prevState, number: number + 1 }));
  };

  console.log('호출', data);
  return (
    <>
      <h1>{number}</h1>
      <h2>{name}</h2>
      <button type="button" onClick={decrease}>
        -1
      </button>
      <button type="button" onClick={increase}>
        +1
      </button>
    </>
  );
};

export default Counter2;
