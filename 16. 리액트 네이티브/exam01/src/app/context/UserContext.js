import React, { createContext, useState } from 'react';

const UserContext = createContext({
  states: { isLogin: false, isAdmin: false, userInfo: null },
  actions: {
    setIsLogin: null,
    setIsAdmin: null,
    setUserInfo: null,
  },
});

const UserProvider = ({ children }) => {
  const [isLogin, setIsLogin] = useState(false);
  const [isAdmin, setIsAdmin] = useState(false);
  const [userInfo, setUserInfo] = useState(null);

  const value = {
    states: { isLogin, isAdmin, userInfo },
    actions: { setIsLogin, setIsAdmin, setUserInfo },
  };

  return <UserContext.Provider value={value}>{children}</UserContext.Provider>;
};

const { Consumer: UserConsumer } = UserContext;

export { UserProvider, UserConsumer };

export default UserContext;
