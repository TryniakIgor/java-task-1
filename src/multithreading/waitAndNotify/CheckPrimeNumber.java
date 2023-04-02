package multithreading.waitAndNotify;

import java.util.ArrayList;

public class CheckPrimeNumber implements Runnable {

    private final Object lock;
    private ArrayList<Integer> numbersToCheck;
    private ArrayList<Integer> primes;
    private boolean isFinished;

    public CheckPrimeNumber(ArrayList<Integer> numbersToCheck, ArrayList<Integer> primes, Object lock) {
        this.numbersToCheck = numbersToCheck;
        this.primes = primes;
        this.lock = lock;
        this.isFinished = false;
    }

    public void setIsFinished(boolean isFinished) {
        this.isFinished = isFinished;
    }

    @Override
    public void run() {
        while (true) {
            synchronized (lock) {
                while (numbersToCheck.isEmpty() && !isFinished) {
                    try {
                        lock.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                if (numbersToCheck.isEmpty() && isFinished) {
                    break;
                }
                int numberToCheck = numbersToCheck.remove(0);
                if (isPrime(numberToCheck)) {
                    primes.add(numberToCheck);
                }
                lock.notify();

            }
        }
        synchronized (lock) {
            if (isFinished) {
                System.out.println(primes);
            }
        }
    }

    private boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}