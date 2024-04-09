import React from 'react';

const MessageBox = ({ className, children }) => {
  return <div className={className}>{children}</div>;
};

export default React.memo(MessageBox);
