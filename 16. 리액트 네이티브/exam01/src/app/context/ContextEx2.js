'use client';
import React, { useContext } from 'react';
import UserContext from './UserContext';

const ContextEx2 = () => {
  const {
    states: { isLogin, userInfo },
    actions: { setIsLogin, setUserInfo },
  } = useContext(UserContext);

  return (
    <div>
      <button type="button"></button>
    </div>
  );
};

export default ContextEx2;
