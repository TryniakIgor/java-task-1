package primeNumbers;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Prime {
/*
a small improvement)
the possibility of setting the range prime number.
 */
    public static void findPrimeNumbers() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Input start range");
        int first = Integer.valueOf(reader.readLine());
        System.out.println("Input end range");
        int second = Integer.valueOf(reader.readLine());

        while (first < second) {
            boolean flag = false;

            for(int i = 2; i <= first/2; ++i) {
                if(first % i == 0) {
                    flag = true;
                    break;
                }
            }
            if (!flag && first != 0 && first != 1)
                System.out.print(first + " ");
            ++first;
        }
    }
}