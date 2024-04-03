import { useState } from 'react';

const Profile = () => {
  const [data, setData] = useState({
    name: '이이름',
    age: 40,
  });
  // const d1 = data;
  const changeProfile = () => {
    // data.name = '김이름';
    // data.age = 30;

    //const d2 = data;
    // const newData = { name: '김이름', age: 30 };
    // console.log(data === newData);
    //setData(newData);
    //setData({ ...data, name: '김이름' });
    setData((prevState) => {
      console.log('변경전 상태값 : ', prevState);
      return { ...prevState, name: '김이름' };
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
