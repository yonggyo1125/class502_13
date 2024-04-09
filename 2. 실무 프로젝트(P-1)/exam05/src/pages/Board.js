import React from 'react';
import { useParams } from 'react-router-dom';

const posts = {
  post1: {
    subject: '게시글1번',
    content: '게시글1번 내용',
  },
  post2: {
    subject: '게시글2번',
    content: '게시글2번 내용',
  },
};

const Board = () => {
  const { id } = useParams();
  const data = posts[`post${id}`];

  return (
    <>
      {data ? (
        <>
          <h1>{data.subject}</h1>
          <div>{data.content}</div>
        </>
      ) : (
        <div>게시글이 없습니다.</div>
      )}
    </>
  );
};

export default React.memo(Board);
