import React, { useState, useCallback, useMemo } from 'react';

function getAverage(nums) {
  console.log('getAverage함수 호출');
  // 합계 / 갯수

  const total = nums.reduce((acc, num) => {
    acc += num;

    return acc;
  }, 0);

  let avg = total / nums.length;
  avg = Math.round(avg * 10) / 10; // 소수점 첫째 자리까지 표기(반올림)

  return avg;
}

const Average = () => {
  const [nums, setNums] = useState([]);
  const [num, setNum] = useState('');

  const onChange = useCallback(
    (e) =>
      setNum(
        Number(e.currentTarget.value) !== NaN
          ? Number(e.currentTarget.value)
          : 0,
      ),
    [],
  );
  const onSubmit = useCallback(
    (e) => {
      e.preventDefault();
      setNums((nums) => nums.concat(num));
    },
    [num],
  );

  //const avg = getAverage(nums);
  const avg = useMemo(() => getAverage(nums), [nums]); // nums의 값이 변경될때만 호출될 필요, 다른 X

  return (
    <>
      <form autoComplete="off" onSubmit={onSubmit}>
        <input type="number" value={num} onChange={onChange} />
        <button type="submit">등록</button>
      </form>
      <ul>
        {nums.map((num, i) => (
          <li key={i}>{num}</li>
        ))}
      </ul>
      평균 : {avg}
    </>
  );
};

export default React.memo(Average);
