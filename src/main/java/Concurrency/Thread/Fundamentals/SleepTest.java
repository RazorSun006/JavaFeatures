package Concurrency.Thread.Fundamentals;

public class SleepTest implements Runnable {
    @Override
    public void run() {
        for (int i = 10; i < 13; i++) {
            System.out.println(Thread.currentThread().getName() + "  " + i);
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }

    public static void main(String[] args) {
        Thread t = new Thread(new SleepTest());
        t.start();
        Thread t2 = new Thread(new SleepTest());
        t2.start();
    }
}
