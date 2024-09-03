export const metadata = {
  /* head 태그 안쪽에 치환 */ title: "제목!",
  description: "설명!",
};

export default function RootLayout({ children }) {
  return (
    <html>
      <body>
        <h1>상단</h1>
        <main>{children}</main>
        <h1>하단</h1>
      </body>
    </html>
  );
}
