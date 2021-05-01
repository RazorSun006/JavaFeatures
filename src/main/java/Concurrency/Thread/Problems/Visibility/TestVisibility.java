package Concurrency.Thread.Problems.Visibility;

public class TestVisibility {
    private static boolean flag = true;

    public static void main(String[] args) throws InterruptedException {
        new Thread(() -> {
            while (flag) {
            }
        }).start();

        Thread.sleep(2000);

        new Thread(() -> {
            flag = false;
            System.out.println(flag);
        }).start();
    }

}
