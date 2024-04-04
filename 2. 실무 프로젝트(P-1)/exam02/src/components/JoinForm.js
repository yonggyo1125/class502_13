import { useState } from 'react';

const JoinForm = () => {
  const [userId, setUserId] = useState('');
  const [userPw, setUserPw] = useState('');

  const onUserIdChange = (e) => setUserId(e.currentTarget.value);

  return (
    <form>
      <dl>
        <dt>아이디</dt>
        <dd>
          <input type="text" onChange={onUserIdChange} />
        </dd>
      </dl>
      <dl>
        <dt>비밀번호</dt>
        <dd>
          <input type="password" />
        </dd>
      </dl>
      <dl>
        <dt>비밀번호 확인</dt>
        <dd>
          <input type="password" />
        </dd>
      </dl>
      <dl>
        <dt>회원명</dt>
        <dd>
          <input type="text" />
        </dd>
      </dl>
      <button type="submit">가입하기</button>
    </form>
  );
};

export default JoinForm;
