package annotationAndExeption.validEmail;

public class InputEmailException extends RuntimeException {

    public InputEmailException(String message) {
        super(message);
    }

    @Override
    public String getMessage() {
        return super.getMessage();
    }

}
