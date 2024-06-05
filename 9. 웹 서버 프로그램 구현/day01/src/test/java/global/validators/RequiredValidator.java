package global.validators;

public interface RequiredValidator {
    default void checkRequired(String field, RuntimeException e) {
        if (field == null || field.isBlank()) {
            throw e;
        }
    }
}
