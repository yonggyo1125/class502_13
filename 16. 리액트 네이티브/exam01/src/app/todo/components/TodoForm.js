import React from 'react';
import { IoMdRadioButtonOff, IoMdRadioButtonOn } from 'react-icons/io';

const TodoForm = () => {
  return (
    <form autoComplete="off">
      <dl>
        <dt>할일</dt>
        <dd>
          <input type="text" />
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
    </form>
  );
};

export default TodoForm;
