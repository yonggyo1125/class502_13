import Color from './Color';
import ChangeColor from './ChangeColor';
import { ColorProvider } from '../modules/ColorContext';

const ColorContainer = () => {
  return (
    <>
      <ColorProvider>
        <Color />
        <ChangeColor />
      </ColorProvider>
    </>
  );
};

export default ColorContainer;
