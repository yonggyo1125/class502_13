import React from 'react';
import { Link } from 'react-router-dom';

const Home = () => {
  return (
    <div>
      <h1>HOME</h1>
      <div>메인 페이지</div>
      <div>
        <Link to="/about">회사 소개</Link>
      </div>
    </div>
  );
};

export default React.memo(Home);
