package annotationAndExeption.validEmail;

import java.util.Optional;

public class User {
    private String name;
    @ValidEmail
    private String email;
    private String password;

    public User(String name, String email, String password) {
        validateEmail(email);
        this.name = name;
        this.email = email;
        this.password = password;

    }

    /**
     * Validated email is not shorter than 6 characters, contains @
     **/
    private boolean isValidEmail(String email) {
        String regex = "^(?=.*[@])(?=\\S+$).{6,}$";
        return email.matches(regex);
    }

    private void validateEmail(String email) {
        Optional.ofNullable(email).orElseThrow(() -> new InputEmailException("The email can't be null"));

        if (!email.contains("@")) {
            throw new InputEmailException("The email must contain @ ");
        }
        if (email.contains(" ")) {
            throw new InputEmailException("The email must not contain spaces ");
        }
        if (email.length() < 7) {
            throw new InputEmailException("The email must contain at least 6 characters ");
        }
    }
}






