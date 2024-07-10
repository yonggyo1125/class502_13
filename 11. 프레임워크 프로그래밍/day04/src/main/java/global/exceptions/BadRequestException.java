package global.exceptions;

public class BadRequestException extends CommonException {
    public BadRequestException(String message) {
        super(message);
    }
}
