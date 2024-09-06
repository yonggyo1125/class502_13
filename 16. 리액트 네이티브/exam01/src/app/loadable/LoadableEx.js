'use client';

import React, { useState } from 'react';
import loadable from '@loadable/component';

const Content = loadable(() => import('./Content'), {
  fallback: <div>로딩중....</div>,
});

const LoadableEx = () => {
  const [visible, setVisible] = useState(false);

  return (
    <>
      {visible && <Content />}
      <button type="button" onClick={() => setVisible(!visible)}>
        보이기
      </button>
    </>
  );
};

export default LoadableEx;
