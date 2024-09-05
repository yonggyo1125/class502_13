import React from 'react';
import { IoMdRadioButtonOff, IoMdRadioButtonOn } from 'react-icons/io';
import MessageBox from '@/app/commons/components/MessageBox';

const TodoForm = ({ onSubmit, onChange, onClick, form, titleRef, errors }) => {
  return (
    <form autoComplete="off" onSubmit={onSubmit}>
      <dl>
        <dt>할일</dt>
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
      <button type="submit">할일 등록</button>
    </form>
  );
};

export default TodoForm;
