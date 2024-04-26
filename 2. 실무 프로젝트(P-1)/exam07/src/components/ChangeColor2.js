import { useContext } from 'react';
//import { ColorConsumer } from '../modules/ColorContext';
import ColorContext from '../modules/ColorContext';

const ChangeColor2 = () => {
  const { setColor } = useContext(ColorContext);
  return (
    <button type="button" onClick={() => setColor('orange')}>
      변경
    </button>
  );
  /*
  return (
    <ColorConsumer>
      {({ setColor }) => (
        <button type="button" onClick={() => setColor('orange')}>
          변경
        </button>
      )}
    </ColorConsumer>
  );
  */
};

export default ChangeColor2;
