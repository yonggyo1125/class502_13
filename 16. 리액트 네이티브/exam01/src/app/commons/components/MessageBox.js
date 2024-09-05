export default function MessageBox({ children }) {
  const messages = Array.isArray(children) ? children : [children];

  return (
    <>
      {messages &&
        messages.length > 0 &&
        messages.map((m) => <div key={m}>{m}</div>)}
    </>
  );
}
