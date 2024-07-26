import React, { useState } from 'react';
import JoinForm from '../components/JoinForm';

const JoinContainer = () => {
  const [form, setForm] = useState({});
  console.log('container', Object.getOwnPropertyDescriptors(form));
  return <JoinForm form={form} />;
};

export default JoinContainer;
