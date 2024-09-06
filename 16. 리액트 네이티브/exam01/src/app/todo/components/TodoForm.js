import React from 'react';
import { IoMdRadioButtonOff, IoMdRadioButtonOn } from 'react-icons/io';
import classNames from 'classnames/bind';
import MessageBox from '@/app/commons/components/MessageBox';
import styles from '../todo.module.scss';
import styled, { css } from 'styled-components';

const commonStyle = css`
  border: 0;
  height: 45px;
  padding: 0 35px;
  color: #fff;
`;

const ButtonBox = styled.button`
  background: ${({ color }) => color ?? 'blue'};
  font-size: 1.3rem;
  ${commonStyle}
  ${({ width }) =>
    width &&
    css`
      width: ${width};
    `}
`;

const cx = classNames.bind(styles);

const TodoForm = ({ onSubmit, onChange, onClick, form, titleRef, errors }) => {
  const active = true;
  return (
    <form autoComplete="off" onSubmit={onSubmit}>
      <button type="button" className={cx({ on: active })}>
        클릭!
      </button>

      <dl className={styles.item}>
        <dt className="tit">할일</dt>
        <dd>
          <input
            type="text"
            name="title"
            value={form?.title ?? ''}
            onChange={onChange}
            ref={titleRef}
          />
          {errors?.title && <MessageBox>{errors.title}</MessageBox>}
        </dd>
      </dl>
      <dl>
        <dt>내용</dt>
        <dd>
          <textarea
            name="content"
            onChange={onChange}
            value={form?.content ?? ''}
          ></textarea>
          {errors?.content && <MessageBox>{errors.content}</MessageBox>}
        </dd>
      </dl>
      <dl>
        <dt>완료여부</dt>
        <dd>
          <span onClick={() => onClick(true)}>
            {form?.done ? <IoMdRadioButtonOn /> : <IoMdRadioButtonOff />}
            완료
          </span>
          <span onClick={() => onClick(false)}>
            {form?.done ? <IoMdRadioButtonOff /> : <IoMdRadioButtonOn />}
            미완료
          </span>
        </dd>
      </dl>
      <ButtonBox type="submit" color="black" width="300px">
        할일 등록
      </ButtonBox>
    </form>
  );
};

export default React.memo(TodoForm);
