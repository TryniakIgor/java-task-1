package multithreading.joinMethod;

public class NullResultException extends RuntimeException  {
    public NullResultException(String message) {
        super(message);
    }
    @Override
    public String getMessage() {
        return super.getMessage();
    }
}
