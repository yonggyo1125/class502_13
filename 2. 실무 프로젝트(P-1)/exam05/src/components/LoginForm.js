import styled from 'styled-components';

const OuterBox = styled.div`
  position: fixed;
  width: 100%;
  height: 100%;
  left: 0;
  top: 0;
  background: gray;
`;

const FormBox = styled.form`
  width: 420px;
  margin: 0 auto;

  h1 {
    text-align: center;
  }
`;

const InputBox = styled.input`
  display: block;
  height: 45px;
  border: 1px solid #ccc;
  border-radius: 5px;
  width: 100%;
  padding: 0 10px;

  & + & {
    margin-top: 5px;
  }
`;

const LoginForm = () => {
  return (
    <OuterBox>
      <FormBox autoComplete="off">
        <h1>로그인</h1>

        <InputBox type="text" placeholder="아이디" />
        <InputBox type="password" placeholder="비밀번호" />
        <button type="submit">로그인</button>
      </FormBox>
    </OuterBox>
  );
};

export default LoginForm;
