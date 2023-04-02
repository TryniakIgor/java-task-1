package multithreading.joinMethod;

public class Result {
    private int value;

    public synchronized void addToResult(int value) {
        this.value += value;
    }

    public int getValue() {
        return value;
    }
}
