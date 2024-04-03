import PropTypes from 'prop-types';

const MyComponent = ({ name, num, children }) => {
  return (
    <>
      <div>안녕하세요!, 제 이름은 {name}입니다.</div>
      <div>좋아하는 숫자는 {num}입니다.</div>
      {children}
    </>
  );
};

MyComponent.defaultProps = {
  // 기본값 설정
  name: '기본 이름',
};

MyComponent.propTypes = {
  name: PropTypes.string,
  num: PropTypes.number.isRequired,
};

export default MyComponent;
