import React from 'react';
import Buttons from './components/Buttons2';

function App() {
  const name = '김이름';

  return (
    <>
      {name && <h1>안녕하세요!, {name}</h1>}
      <h2>반갑습니다.</h2>
      <Buttons color="orange">확인</Buttons>
    </>
  );
}

export default App;
