import React from 'react';
import { IoMdRadioButtonOff, IoMdRadioButtonOn } from 'react-icons/io';

const TodoForm = ({ onSubmit }) => {
  return (
    <form autoComplete="off" onSubmit={onSubmit}>
      <dl>
        <dt>할일</dt>
        <dd>
          <input type="text" onChange={onChange} />
        </dd>
      </dl>
      <dl>
        <dt>내용</dt>
        <dd>
          <textarea></textarea>
        </dd>
      </dl>
      <dl>
        <dt>완료여부</dt>
        <dd>
          <span>
            <IoMdRadioButtonOff />
            완료
          </span>
          <span>
            <IoMdRadioButtonOff />
            미완료
          </span>
        </dd>
      </dl>
      <button type="submit">할일 등록</button>
    </form>
  );
};

export default TodoForm;
