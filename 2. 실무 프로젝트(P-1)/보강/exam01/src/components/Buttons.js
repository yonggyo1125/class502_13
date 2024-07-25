import React from 'react';

const Buttons = ({ color, children }) => {
  //const { color, children} = props;

  const styles = {
    background: color,
  };

  return <button style={styles}>{children}</button>;
}

export default Buttons;
