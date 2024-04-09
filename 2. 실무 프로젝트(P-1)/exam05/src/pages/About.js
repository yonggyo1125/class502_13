import React, { useState } from 'react';
import { FaCheckSquare, FaRegCheckSquare } from 'react-icons/fa';

const About = () => {
  const [checked, setChecked] = useState(false);

  return (
    <div>
      <h1>회사 소개</h1>
      <div>소개 내용....</div>
      <div onClick={() => setChecked(!checked)}>
        {checked ? <FaCheckSquare /> : <FaRegCheckSquare />} 토글
      </div>
    </div>
  );
};

export default React.memo(About);
