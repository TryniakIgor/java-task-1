package annotationAndExeption.movie;


import java.lang.reflect.Method;
import java.time.Year;

public class Movie {
    private String title;
    private int year;

    public Movie(String title, int year) {
        this.title = title;
        this.year = year;
    }

    public int getYear() {
        return year;
    }

    @YearAnnotation()
    public void setYear(int year) {
        if (ValidateYear(year)) {
            throw new InputYearException("Inputted incorrect year");
        }

        this.year = year;
    }

    private boolean ValidateYear(int year) {
        YearAnnotation annotation = null;
        try {
            Method method = Movie.class.getDeclaredMethod("setYear", int.class);
            annotation = method.getAnnotation(YearAnnotation.class);
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
        int min = annotation.minYear();

        return year < min || year > Year.now().getValue();
    }
}
