package multithreading.joinMethod;

import java.util.Optional;

public class Count implements Runnable {
    private int myInt;
    private Result result;

    Count(int myInt, Result result) {
        this.myInt = myInt;
        Optional.ofNullable(result).orElseThrow(() -> new NullResultException("The email can't be null"));
        this.result = result;
    }

    @Override
    public void run() {
        for (int i = myInt; i > 0; i--) {
            if (i % 2 == 0) {
                result.addToResult(i);
            }
        }
    }


}

