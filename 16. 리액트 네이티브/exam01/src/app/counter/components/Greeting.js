import React from 'react';

const Greeting = ({ name, age }) => {
  // const { name } = props;
  return (
    <div>
      <h1>{name}님, 안녕하세요.</h1>
      <h2>나이는: {age} 입니다.</h2>
    </div>
  );
};

export default Greeting;
