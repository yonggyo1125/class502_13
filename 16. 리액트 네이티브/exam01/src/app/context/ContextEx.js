'use client';
import UserContext from './UserContext';
import ContextEx2 from './ContextEx2';

const ContextEx = () => {
  return (
    <UserContext.Provider value={{ color: 'red' }}>
      <ContextEx2 />
    </UserContext.Provider>
  );
};

export default ContextEx;
