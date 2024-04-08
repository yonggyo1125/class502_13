import styles from './CSSModule.module.scss';
console.log(styles);

const CSSModule = () => {
  return (
    <div className={styles.wrapper}>
      <span className="commonColor">안녕하세요</span>,
      <span className={styles.highlight}>반갑습니다.</span>
    </div>
  );
};

export default CSSModule;
