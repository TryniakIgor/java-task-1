package annotationAndExeption.movie;

public class InputYearException extends RuntimeException {

    public InputYearException(String message) {
        super(message);
    }
    @Override
    public String getMessage() {
        return super.getMessage();
    }

}
