import { Component } from 'react';

class Color extends Component {
  state = {
    color: 'blue',
    subColor: 'black',
  };

  render() {
    /*
    function changeColor(color) {
      console.log(this);
    }
    */
    const changeColor = (color) => this.setState({ color }); // Color
    const changeSubColor = (color) =>
      this.setState((prevState) => ({ ...prevState, subColor: color }));

    const { color, subColor } = this.state;
    return (
      <>
        <div
          style={{ background: color, width: '100px', height: '100px' }}
        ></div>
        <button type="button" onClick={() => changeColor('red')}>
          RED
        </button>
        <button type="button" onClick={() => changeColor('orange')}>
          ORANGE
        </button>
        <button type="button" onClick={() => changeColor('green')}>
          GREEN
        </button>
        <div style={{ background: subColor }}
      </>
    );
  }
}

export default Color;
