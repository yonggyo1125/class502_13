import React, { useContext } from 'react';
import UserContext from './UserContext';

const ContextEx3 = () => {
  const {
    states: { isLogin, userInfo },
  } = useContext(UserContext);

  return <div>{isLogin && `${userInfo.userName}(${userInfo.email})`}</div>;
};

export default ContextEx3;
