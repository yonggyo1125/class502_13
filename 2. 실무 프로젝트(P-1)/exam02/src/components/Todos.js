import {
  MdOutlineCheckBox,
  MdOutlineCheckBoxOutlineBlank,
} from 'react-icons/md';

const items = [
  { id: 1, title: '할일1', done: false },
  { id: 2, title: '할일2', done: true },
  { id: 3, title: '할일3', done: false },
];

const Todos = () => {
  //const listItems = items.map((item) => <li>{item.title}</li>);

  return (
    <ul>
      {items.map(({ id, title, done }) => (
        <li key={id}>
          {done ? <MdOutlineCheckBox /> : <MdOutlineCheckBoxOutlineBlank />}
          {title}
        </li>
      ))}
    </ul>
  );
};

export default Todos;
