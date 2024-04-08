import { useState } from 'react';

function getAverage(nums) {
  // 합계 / 갯수

  const total = nums.reduce((acc, num) => {
    acc += num;

    return acc;
  });

  let avg = total / nums.length;
  avg = Math.round(avg * 10) / 10; // 소수점 첫째 자리까지 표기(반올림)

  return avg;
}

const Average = () => {
  const [nums, setNums] = useState([]);

  return (
    <>
      <form autoComplete="off">
        <input type="number" />
        <button type="submit">등록</button>
      </form>
      <ul>
        {
            
        }
      </ul>
    </>
  );
};

export default Average;
