package Concurrency.Thread.BankCounterCall;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

public class Window extends Thread {
    private final String name;
    private static final int MAX = 50;
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
