package task1.shape;

public class Ball extends SolidOfRevolution {

    @Override
    public double getVolume() {
        return 4 / 3 * Math.PI * Math.pow(this.getRadius(), 3);
    }

    public Ball(double radius) {
        super(radius);
    }
}
