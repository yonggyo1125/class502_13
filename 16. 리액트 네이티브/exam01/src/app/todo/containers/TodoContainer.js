'use client';
import React, { useEffect, useState, useRef, useCallback } from 'react';
import { produce } from 'immer';
import TodoForm from '../components/TodoForm';
import TodoList from '../components/TodoList';



const TodoContainer = () => {
  const [items, setItems] = useState([]);
  const [form, setForm] = useState({});
  const [errors, setErrors] = useState({});



  const titleRef = useRef();

  /*
  useEffect(() => {
    //if (titleRef) {
    //  titleRef.current.focus();
    //}
    console.log('useEffect() 호출');

    return () => {
      console.log('뒷정리 함수 - 2번째 부터 처음 호출 - 정리 작업 ');
    };
  }, [form]);
  */
  useEffect(() => {
    if (titleRef) {
      titleRef.current.focus();
    }
  }, [titleRef]);

  const onToggle = useCallback((id) => {
    /*
    const newItems = items.map((item) =>
      id === item.id ? { ...item, done: !item.done } : item,
    );
    setItems(newItems);
    */
    /*
    setItems((prev) =>
      prev.map((item) =>
        item.id === id ? { ...item, done: !item.done } : item,
      ),
    );
    */
    setItems(
      produce((draft) => {
        draft
          .filter((item) => item.id === id)
          .forEach((item) => {
            item.done = !item.done;
          });
      }),
    );
  }, []);

  const onRemove = useCallback((id) => {
    // filter 메서드
    setItems((items) => items.filter((item) => item.id !== id));
  }, []);

  const onChange = useCallback((e) => {
    /**
     * e.target
     * //e.currentTarget
     */

    const name = e.target.name;
    const value = e.target.value;
    setForm((form) => ({ ...form, [name]: value }));
    //setForm({ ...form, [name]: value });
  }, []);

  const onClick = useCallback((done) => {
    setForm((form) => ({ ...form, done }));
  }, []);

  const onSubmit = useCallback(
    (e) => {
      e.preventDefault(); // 양식 기본 동작 차단

      // 검증
      const _errors = {};
      let hasErrors = false;

      const requiredFields = {
        title: '제목을 입력하세요.',
        content: '내용을 입력하세요.',
      };

      for (const [field, message] of Object.entries(requiredFields)) {
        if (!form[field] || !form[field].trim()) {
          _errors[field] = _errors[field] ?? [];
          _errors[field].push(message);
          hasErrors = true;
        }
      }

      setErrors(_errors);
      if (hasErrors) {
        // 검증 실패
        return;
      }

      // 일정 등록 처리
      const nextId = items ? Math.max(...items.map((item) => item.id)) + 1 : 1;
      setItems((items) => items.concat({ ...form, id: nextId }));

      // 양식 초기화
      setForm({});
      titleRef.current.focus();
    },
    [form, items],
  );

  return (
    <>
      <TodoForm
        onSubmit={onSubmit}
        onChange={onChange}
        onClick={onClick}
        form={form}
        titleRef={titleRef}
        errors={errors}
      />
      <TodoList items={items} onToggle={onToggle} onRemove={onRemove} />
    </>
  );
};

export default React.memo(TodoContainer);
