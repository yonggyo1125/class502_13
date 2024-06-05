package global.validators;

public interface RequiredValidator {
    default void checkRequired(String field, RuntimeException e) {
        if (field == null || field.isBlank()) {
            throw e;
        }
    }

    default void checkTrue(boolean result, RuntimeException e) {
        if (!result) {
            throw e;
        }
    }
}
