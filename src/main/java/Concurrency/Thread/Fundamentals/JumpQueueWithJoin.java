package Concurrency.Thread.Fundamentals;

public class JumpQueueWithJoin implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            System.out.println("vip thread " + i);
        }
    }

    public static void main(String[] args) throws InterruptedException {
        JumpQueueWithJoin join = new JumpQueueWithJoin();
        Thread thread = new Thread(join);
        thread.start();
        for (int i = 0; i < 500; i++) {
            if (i == 200) {
                thread.join();
            }
            System.out.println("main thread " + i);
        }
    }
}
