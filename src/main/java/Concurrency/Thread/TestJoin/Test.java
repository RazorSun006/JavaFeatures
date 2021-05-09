package Concurrency.Thread.TestJoin;

public class Test {
    public static void main(String[] args) {
        ThreadJoining t1 = new ThreadJoining();
        ThreadJoining t2 = new ThreadJoining();
        ThreadJoining t3 = new ThreadJoining();
        t1.start();
        t2.start();
        t3.start();
        try {
            System.out.println("Current Thread: "
                    + Thread.currentThread().getName());
            t3.join();
        } catch (Exception ex) {
            System.out.println("Exception has " +
                    "been caught" + ex);
        }

        try {
            System.out.println("Current Thread: "
                    + Thread.currentThread().getName());
            t2.join();
        } catch (Exception ex) {
            System.out.println("Exception has been" +
                    " caught" + ex);
        }


    }
}
