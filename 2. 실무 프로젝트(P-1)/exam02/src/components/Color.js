import { Component } from 'react';

class Color extends Component {
  state = {
    color: 'blue',
  };

  

  render() {
    const { color } = this.state;
    return (
      <>
        <div
          style={{ background: color, width: '100px', height: '100px' }}
        ></div>
        <button type="button">RED</button>
        <button type="button">ORANGE</button>
        <button type="button">GREEN</button>
      </>
    );
  }
}

export default Color;
