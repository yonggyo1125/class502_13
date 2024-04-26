const ColorConsumer2 = ({children}) => {
    const value = { states: { isLogin: true }};

    return children(value);
};

export default ColorConsumer2;