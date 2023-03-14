package practice4;

import java.util.concurrent.*;

public class Main {
    public static void main(String[] args) {
        ExecutorService executorService = new MyExecutorService(3);

        executorService.submit(() -> {
            try {
                Thread.sleep(100);
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
            System.out.println("First thread");
        });

        executorService.submit(() -> {
            System.out.println("Second thread");
        });

        executorService.submit(() -> {
            try {
                Thread.sleep(700);
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
            System.out.println("Third thread");
        });

        executorService.shutdown();
    }
}
