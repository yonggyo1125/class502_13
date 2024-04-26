import { ColorConsumer } from '../modules/ColorContext';
const Color2 = () => {
  return (
    <ColorConsumer>
      {({ color }) => (
        <div
          style={{ background: color, width: '200px', height: '200px' }}
        ></div>
      )}
    </ColorConsumer>
  );
};

export default Color2;
