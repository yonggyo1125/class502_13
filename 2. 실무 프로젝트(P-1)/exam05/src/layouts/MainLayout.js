import React from 'react';
import { Outlet, NavLink } from 'react-router-dom';
import classNames from 'classnames';

const MainLayout = () => {
  return (
    <>
      <header>
        <h1>헤더 영역</h1>
        <div>
          <NavLink
            to="/about"
            className={({ isActive }) => classNames('menu', { on: isActive })}
          >
            ABOUT
          </NavLink>
          <NavLink
            to="/board"
            className={({ isActive }) => classNames('menu', { on: isActive })}
          >
            BOARD
          </NavLink>
        </div>
      </header>
      <main>
        <Outlet />
      </main>
      <footer>
        <h1>푸터 영역</h1>
      </footer>
    </>
  );
};

export default React.memo(MainLayout);
