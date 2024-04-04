import { useState } from 'react';

const JoinForm = () => {
  const [form, setForm] = useState({});

  const onChange = (e) => {};

  const onSubmit = (e) => {
    e.preventDefault();
  };

  return (
    <form onSubmit={onSubmit}>
      <dl>
        <dt>아이디</dt>
        <dd>
          <input type="text" name="userId" onChange={onChange} />
        </dd>
      </dl>
      <dl>
        <dt>비밀번호</dt>
        <dd>
          <input type="password" name="userPw" onChange={onChange} />
        </dd>
      </dl>
      <dl>
        <dt>비밀번호 확인</dt>
        <dd>
          <input type="password" name="confirmPw" onChange={onChange} />
        </dd>
      </dl>
      <dl>
        <dt>회원명</dt>
        <dd>
          <input type="text" name="userNm" onChange={onChange} />
        </dd>
      </dl>
      <button type="submit">가입하기</button>
    </form>
  );
};

export default JoinForm;
