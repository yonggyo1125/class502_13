import { useState, useEffect, useRef } from 'react';

const JoinForm = () => {
  const [form, setForm] = useState({});

  let userIdEl = useRef();
  //let userIdEl;

  useEffect(() => {
    //userIdEl.focus();
    //console.log(userIdEl.current);
    //userIdEl.current.focus();
    console.log(userIdEl.current);
  }, [userIdEl]);

  const onChange = (e) => {
    //setForm({ ...form, [e.currentTarget.name]: e.currentTarget.value });
    const name = e.currentTarget.name;
    const value = e.currentTarget.value;
    setForm((prevForm) => ({ ...prevForm, [name]: value }));
  };

  const onSubmit = (e) => {
    e.preventDefault();
    // 처리 완료

    // 양식 값을 비워주기

    setForm({});
  };

  return (
    <form onSubmit={onSubmit}>
      <dl>
        <dt>아이디</dt>
        <dd>
          <input
            type="text"
            name="userId"
            onChange={onChange}
            value={form.userId ?? ''}
            //ref={(ref) => (userIdEl = ref)}
            ref={userIdEl}
          />
        </dd>
      </dl>
      <dl>
        <dt>비밀번호</dt>
        <dd>
          <input
            type="password"
            name="userPw"
            onChange={onChange}
            value={form.userPw ?? ''}
          />
        </dd>
      </dl>
      <dl>
        <dt>비밀번호 확인</dt>
        <dd>
          <input
            type="password"
            name="confirmPw"
            onChange={onChange}
            value={form.confirmPw ?? ''}
          />
        </dd>
      </dl>
      <dl>
        <dt>회원명</dt>
        <dd>
          <input
            type="text"
            name="userNm"
            onChange={onChange}
            value={form.userNm ?? ''}
          />
        </dd>
      </dl>
      <button type="submit">가입하기</button>
    </form>
  );
};

export default JoinForm;
