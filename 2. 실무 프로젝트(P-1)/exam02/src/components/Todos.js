const items = [
  { title: '할일1', done: false },
  { title: '할일2', done: false },
  { title: '할일3', done: false },
];

const Todos = () => {
  const listItems = items.map((item) => <li>{item.title}</li>);
  return <ul></ul>;
};

export default Todos;
