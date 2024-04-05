import { Component } from 'react';

class LifeCycle extends Component {
  state = {
    number: 0,
  };

  constructor(props) {
    super(props);

    console.log('constructor');
  }

  static getDerivedStateFromProps(prevProps, prevState) {
    console.log('getDerivedStateFromProps');

    return null;
  }

  componentDidMount() {
    console.log('componentDidMount');
  }

  render() {
    console.log('render');
    const { number } = this.state;
    return (
      <>
        <h1>{number}</h1>
        <button
          type="button"
          onClick={() => this.setState({ number: number + 1 })}
        >
          +1
        </button>
        <button
          type="button"
          onClick={() => this.setState({ number: number - 1 })}
        >
          -1
        </button>
      </>
    );
  }
}

export default LifeCycle;
