import React from 'react';

const JoinForm = () => {
  return (
    <form autoComplete="off">
      <dl>
        <dt>이메일</dt>
        <dd>
          <input type="text" name="email" />
        </dd>
      </dl>
      <dl>
        <dt>비밀번호</dt>
        <dd>
          <input type="password" name="password" />
        </dd>
      </dl>
      <dl>
        <dt>비밀번호 확인</dt>
        <dd>
          <input type="password" name="confirmPassword" />
        </dd>
      </dl>
      <dl>
        <dt>회원명</dt>
        <dd>
          <input type="text" name="userName" />
        </dd>
      </dl>
    </form>
  );
};

export default JoinForm;
