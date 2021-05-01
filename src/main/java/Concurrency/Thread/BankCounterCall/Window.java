package Concurrency.Thread.BankCounterCall;

public class Window extends Thread {
    private final String name;
    private static final int MAX = 2000;
    private static int index = 1;
    public Window(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        while (index <= MAX) {
            System.out.println("current window ：" + name + " current number :" + index++);
        }
    }
}
