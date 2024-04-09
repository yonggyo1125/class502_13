import styled from 'styled-components';

const FormBox = styled.form`
  width: 420px;
  margin: 0 auto;
`;

const InputBox = styled.input`
  display: block;
  height: 45px;
  border: 1px solid #ccc;
  border-radius: 5px;
  width: 100%;

  & + & {
    margin-top: 5px;
  }
`;

const LoginForm = () => {
  return (
    <>
      <h1>로그인</h1>
      <FormBox autoComplete="off">
        <InputBox type="text" placeholder="아이디" />
        <InputBox type="password" placeholder="비밀번호" />
        <button type="submit">로그인</button>
      </FormBox>
    </>
  );
};

export default LoginForm;
