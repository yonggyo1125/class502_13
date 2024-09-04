import React from 'react';

const Greeting = ({ name, age, children }) => {
  age = age ?? 20;
  return (
    <div>
      <h1>{name}님, 안녕하세요.</h1>
      <h2>나이는: {age} 입니다.</h2>
      <div>{children(100)}</div>
      {/*<div>{chidren}</div> */}
    </div>
  );
};

/*
Greeting.defaultProps = {
  age: 20,
};
*/

export default Greeting;
