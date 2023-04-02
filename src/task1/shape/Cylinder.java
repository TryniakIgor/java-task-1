package task1.shape;



public class Cylinder extends SolidOfRevolution {
    private double height;

    @Override
    public double getVolume() {
        return Math.PI * this.getRadius() * this.getRadius() * height;
    }

    public Cylinder(double radius, double height) {
        super(radius);
        this.height = height;
    }
}
