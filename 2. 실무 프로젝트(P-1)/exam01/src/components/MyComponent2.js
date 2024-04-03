import { Component } from 'react';

class MyComponent extends Component {
  render() {
    const { name, num, children } = this.props;

    return (
      <>
        <div>안녕하세요!, 제 이름은 {name}입니다.</div>
        <div>좋아하는 숫자는 {num}입니다.</div>
        {children}
      </>
    );
  }
}

MyComponent.defaultProps = {
  name: '기본이름',
};

export default MyComponent;
