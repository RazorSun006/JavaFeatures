package Concurrency.Thread;

public class FundamentalThread {
    public static void main(String[] args) {
        Thread thread = new Thread(" Thread - A ") {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName());
            }
        };
        thread.run(); // if you just run  a thread that is just like a normal method !
        thread.start();
    }

}
