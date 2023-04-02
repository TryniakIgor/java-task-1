package multithreading.joinMethod;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Result result = new Result();
        Random random = new Random();

        int num1 = random.nextInt(100);
        int num2 = random.nextInt(100);

        if (!isNatural(num1) || !isNatural(num1)) {
            throw new NaturalNumberException("Number isn`t natural");
        }

        Count count1 = new Count(num1, result);
        Count count2 = new Count(num2, result);


        Thread thread1 = new Thread(count1);
        Thread thread2 = new Thread(count2);

        thread1.start();
        thread2.start();

        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("Result: " + result.getValue());
    }

    public static boolean isNatural(int number) {
        return number > 0;
    }
}
