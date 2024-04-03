import { Component } from 'react';

class Counter extends Component {
  state = {
    number: 0,
  };

  render() {
    const { number } = this.state;
    const plus = () => this.setState({ number: number + 1 });
    const minus = () => this.setState({ number: number - 1 });

    return (
      <>
        <h1>{number}</h1>
        <button type="button" onClick={plus}>
          +1
        </button>
        <button type="button" onClick={minus}>
          -1
        </button>
      </>
    );
  }
}

export default Counter;
