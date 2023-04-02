package task1.shape;

public class Box extends Shape {

    private double freeSpace;
    private double volume;
    private static int count = 0;

    public Box(int freeSpace) {
        this.freeSpace = freeSpace;
        this.volume = freeSpace;
    }

    public String add(Shape shape) {
        if (freeSpace >= shape.getVolume()) {
            count++;
            freeSpace -= shape.getVolume();
            return "Shape successfuly added. Box contains "+ count + " shapes";
        } else {
            return "Not enough space for this task1.shape";
        }
    }

    @Override
    public double getVolume() {
        return volume;
    }
}
