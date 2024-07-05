package exam01.global.validators;

public interface Validator<T> {
    void check(T form);
}
