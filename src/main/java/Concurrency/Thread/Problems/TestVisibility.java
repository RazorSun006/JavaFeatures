package Concurrency.Thread.Problems;

public class TestVisibility {
    private static boolean flag = true;
    private static Object object = new Object();
    public static void main(String[] args) throws InterruptedException {
        new Thread(() -> {
            while (flag) {
                synchronized (object) {

                }
            }
        }).start();

        Thread.sleep(2000);

        new Thread(() -> {
            flag = false;
            System.out.println(flag);
        }).start();
    }

}
