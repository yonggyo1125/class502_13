import React from 'react';
import { Outlet, Link } from 'react-router-dom';

const BoardList = () => {
  return (
    <>
      <h1>게시판</h1>
      <ul>
        <li>
          <Link to="/board/view/1">게시글1</Link>
        </li>
        <li>
          <Link to="/board/view/2">게시글2</Link>
        </li>
      </ul>
      <Outlet />
    </>
  );
};

export default React.memo(BoardList);
