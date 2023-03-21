package converting;

public class Kelvin implements ConverterFromCelsius {

    @Override
    public double convert(double celsius) {
        double k = 274.15 + celsius;
        System.out.println(celsius+" celsius = " + k + " kelvin");
        return k;
    }
}
