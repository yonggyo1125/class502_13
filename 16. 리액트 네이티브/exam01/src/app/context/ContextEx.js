'use client';
import ContextEx2 from './ContextEx2';
import ContextEx3 from './ContextEx3';
import { UserProvider } from './UserContext';

const ContextEx = () => {
  return (
    <UserProvider>
      <ContextEx3 />
      <ContextEx2 />
    </UserProvider>
  );
};

export default ContextEx;
