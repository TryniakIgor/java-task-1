package shape;

public class Piramid extends Shape {
    private double height;
    private double square;

    public Piramid(double height, double square) {
        this.height = height;
        this.square = square;
    }

    @Override
    public double getVolume() {
        return 4 / 3 *height * square;
    }
}
