package multithreading.waitAndNotify;


import java.util.ArrayList;
import java.util.concurrent.CopyOnWriteArrayList;

public class SearchPrimeNumber implements Runnable {

    private final Object lock;
    private int fromInt;
    private int toInt;
    private CopyOnWriteArrayList<Integer> numbersToCheck;

    public SearchPrimeNumber(int fromInt, int toInt, CopyOnWriteArrayList<Integer> numbersToCheck, Object lock) {
        this.fromInt = fromInt;
        this.toInt = toInt;
        this.numbersToCheck = numbersToCheck;
        this.lock = lock;
    }

    @Override
    public void run() {
        synchronized (lock) {
            for (int i = fromInt; i <= toInt; i++) {
                numbersToCheck.add(i);
            }
            ((CheckPrimeNumber) lock).setIsFinished(true);
            lock.notify();
        }

        synchronized (lock) {
            System.out.println("Start range: " + fromInt + " End range: " + toInt);
        }
    }
}