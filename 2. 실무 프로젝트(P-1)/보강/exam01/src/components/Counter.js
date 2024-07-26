import React, { Component } from 'react';

class Counter extends Component {
  state = {
    number: 0,
  };

  render() {
    //const number = this.state.number;
    const { number } = this.state;
    console.log('호출!', this.state);
    return (
      <>
        <h1>{number}</h1>
        <button
          type="button"
          //onClick={() => this.setState({ number: number - 1 })}
          onClick={() =>
            this.setState((prevState) => ({ ...prevState, number: number - 1 }))
          }
        >
          -1
        </button>
        <button
          type="button"
          onClick={() =>
            this.setState((prevState) => ({ ...prevState, number: number + 1 }))
          }
        >
          +1
        </button>
      </>
    );
  }
}

export default Counter;
