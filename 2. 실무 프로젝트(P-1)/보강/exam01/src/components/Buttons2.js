import React, { Component } from 'react';

class Buttons2 extends Component {
  render() {
    const { color, children } = this.props;

    console.log('props', Object.getOwnPropertyDescriptors(this.props));
    console.log('props', Object.isExtensible(this.props));
    console.log('props', Object.isFrozen(this.props));
    const styles = {
      background: color,
    };

    return <button style={styles}>{children}</button>;
  }
}

export default Buttons2;
