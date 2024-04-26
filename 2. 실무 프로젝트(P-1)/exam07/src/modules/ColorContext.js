import { createContext, useState } from 'react';

const ColorContext = createContext({
  color: null,
  setColor: null,
});

const ColorProvider = ({ children }) => {
  const [color, setColor] = useState('black');
  const value = { color, setColor };
  return (
    <ColorContext.Provider value={value}>{children}</ColorContext.Provider>
  );
};

const {Consumer: ColorConsumer } = ColorContext;

export { ColorProvider, ColorConsumer };
export default ColorContext;
