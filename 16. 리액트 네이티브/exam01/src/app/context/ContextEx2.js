'use client';
import React, { useContext } from 'react';
import UserContext from './UserContext';

const ContextEx2 = () => {
  const {
    states: { isLogin, userInfo },
    actions: { setIsLogin, setUserInfo },
  } = useContext(UserContext);

  const onLogin = () => {
    setIsLogin(true);
    setUserInfo({ userName: '이이름', email: 'user01@test.org' });
  };

  const onLogout = () => {
    setIsLogin(false);
    setUserInfo(null);
  };
  return (
    <div>
      {isLogin ? (
        <button type="button" onClick={onLogout}>
          로그아웃
        </button>
      ) : (
        <button type="button" onClick={onLogin}>
          로그인
        </button>
      )}
    </div>
  );
};

export default ContextEx2;
