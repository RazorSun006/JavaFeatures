package Concurrency.Thread.Problems;

import java.util.ArrayList;
import java.util.List;

public class TestAtom {
    private static int number = 0;

    public static void main(String[] args) throws InterruptedException {
        Runnable increment = () -> {
            for (int i = 0; i < 1000; i++) {
                number++;
            }
        };
        List<Thread> list = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            Thread t = new Thread(increment);
            t.start();
        }
        for (Thread t : list) {
            t.join();
        }
        System.out.println("result " + number);
    }
}
