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
    if (prevProps.mode === 'even' && prevState.number % 2 === 1) {
      return { number: prevState.number + 1 };
    }

    return null;
  }

  shouldComponentUpdate(props, state) {
    //return state.number % 3 !== 0;
    return true;
    /*
    if (state.number % 3 === 0) {
      
      return false;
    }

    return true;
    */
  }

  componentDidMount() {
    console.log('componentDidMount');
  }

  getSnapshotBeforeUpdate(props, state) {
    console.log('getSnapshotBeforeUpdate');

    return { value: 100 };
  }

  componentDidUpdate(props, state, snapshot) {
    console.log('componentDidUpdate');
    console.log('snapshot', snapshot);
  }

  componentWillUnmount() {
    console.log('componentWillUnmount');
  }

  render() {
    console.log('render');

    const { number } = this.state;
    try {
      number.abc();
    } catch (err) {
      console.log(err.message);
      console.error(err);
      console.log('에러 처리....');
    } finally {
      console.log('무조건 실행!');
    }

    throw new Error('에러 발생!!!!!');

    console.log('실행!');
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
