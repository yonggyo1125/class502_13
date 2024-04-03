import { useState } from 'react';

const Profile = () => {
  const [data, setData] = useState({
    name: '이이름',
    age: 40,
  });

  const changeProfile = () => {
    //data.name = '김이름';
    //data.age = 30;
    //console.log(data);
    //setData(data);
    //setData({ name: '김이름', age: 30 });
    //setData({ ...data, name: '김이름' });

    setData((state) => {
      console.log('이전 상태값 : ', state);

      return { ...state, name: '김이름' };
    });
  };

  const { name, age } = data;
  return (
    <>
      <h1>{name}</h1>
      <h2>{age}</h2>
      <button type="button" onClick={changeProfile}>
        변경
      </button>
    </>
  );
};

export default Profile;
