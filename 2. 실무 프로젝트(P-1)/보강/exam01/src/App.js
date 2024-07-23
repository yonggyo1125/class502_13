import Buttons from "./components/Buttons";

function App() {
  const name = "김이름";

  return (
    <>
      {name && <h1>안녕하세요!, {name}</h1>}
      <h2>반갑습니다.</h2>
      <Buttons />
    </>
  );
}

export default App;
