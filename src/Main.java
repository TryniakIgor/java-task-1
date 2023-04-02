import annotationAndExeption.immutablePerson.ImmutablePerson;
import annotationAndExeption.immutablePerson.InputEmailException;
import annotationAndExeption.movie.InputYearException;
import annotationAndExeption.movie.Movie;
import annotationAndExeption.validEmail.User;

public class Main {

    public static void main(String[] args) throws NoSuchFieldException {
        ImmutablePerson.isFieldImmutable();
        System.out.println("*******************");

        try {
            User user = new User("Luk", "luk@ mail.com", "0000");
        } catch (InputEmailException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("*******************");

        Movie movie = new Movie("Mavka", 2023);
        try {
            movie.setYear(2025);
        } catch (InputYearException e) {
            System.out.println(e.getMessage());
        }
    }
}
