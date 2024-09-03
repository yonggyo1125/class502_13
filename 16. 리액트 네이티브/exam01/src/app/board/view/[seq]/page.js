const BoardView = ({ params }) => {
  const { seq } = params;

  return (
    <>
      <h1>게시글 보기..</h1>
      <h2>게시글 번호: {seq}</h2>
    </>
  );
};

export default BoardView;
