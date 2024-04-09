const LoginForm = () => {
  return (
    <>
      <h1>로그인</h1>
      <form autoComplete="off">
        <input type="text" placeholder="아이디" />
        <input type="password" placeholder="비밀번호" />
        <button type="submit">로그인</button>
      </form>
    </>
  );
};

export default LoginForm;
