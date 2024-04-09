import styled, { css } from 'styled-components';
import { BigButton } from './commons/ButtonStyle';

const commonStyle = css`
  width: 100%;
`;

const OuterBox = styled.div`
  ${commonStyle}
  position: fixed;
  height: 100%;
  left: 0;
  top: 0;
  display: flex;
  align-items: center;
`;

const FormBox = styled.form`
  width: 420px;
  margin: 0 auto;

  h1 {
    text-align: center;
  }
`;

const InputBox = styled.input`
  ${commonStyle}
  display: block;
  height: 45px;
  border: 1px solid #ccc;
  border-radius: 5px;
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
        <BigButton type="submit" bgcolor="red" selected={true}>
          로그인
        </BigButton>
      </FormBox>
    </OuterBox>
  );
};

export default LoginForm;
