const Counter = ({ number, onIncrease, onDecrease }) => {
  return (
    <>
      <h1>{number}</h1>
      <button type="button" onClick={onIncrease}>
        +1
      </button>
      <button type="button" onClick={onDecrease}>
        -1
      </button>
    </>
  );
};

export default Counter;
