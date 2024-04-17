import { Link } from 'react-router-dom';

const Home = () => {
  return (
    <>
      <h1>메인페이지</h1>
      <Link to="/about">About 페이지</Link>
    </>
  );
};

export default Home;
