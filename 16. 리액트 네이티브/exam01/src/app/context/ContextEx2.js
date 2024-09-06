'use client';
import React, { useContext } from 'react';
import UserContext from './UserContext';

const ContextEx2 = () => {
  const value = useContext(UserContext);
  
  return <div>{value.color}</div>;
};

export default ContextEx2;
