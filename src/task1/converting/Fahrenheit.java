package task1.converting;

public class Fahrenheit implements ConverterFromCelsius {
    @Override
    public double convert(double celsius) {
        double f = celsius * 1.8 + 32;
        System.out.println(celsius+" celsys = " + f + " fahrenheit");
        return f;
    }
}
