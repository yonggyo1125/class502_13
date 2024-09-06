'use client';
import UserContext from './UserContext';

const ContextEx2 = () => {
  return (
    <UserContext.Consumer>
      {(value) => <div>{value.color}</div>}
    </UserContext.Consumer>
  );
};

export default ContextEx2;
