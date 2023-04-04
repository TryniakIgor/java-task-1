package multithreading.waitAndNotify;

import java.util.ArrayList;
import java.util.concurrent.CopyOnWriteArrayList;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        CopyOnWriteArrayList<Integer> numbersToCheck = new CopyOnWriteArrayList<Integer>();
        CopyOnWriteArrayList<Integer> primes = new CopyOnWriteArrayList<>();
        Object lock = new CheckPrimeNumber(numbersToCheck, primes, new Object());

        Thread thread1 = new Thread(new SearchPrimeNumber(1, 100, numbersToCheck, lock));
        Thread thread2 = new Thread((CheckPrimeNumber) lock);

        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();

    }
}
