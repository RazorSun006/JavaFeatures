package Concurrency.Thread.TwoDistinctTask;

public class Watching extends Thread {
    private int watchingTimes = 0;

    public int getWatchingTimes() {
        return watchingTimes;
    }

    @Override
    public void run() {
        while (watchingTimes <= 1000) {
            System.out.println("watching times : " + watchingTimes++);
        }
    }
}
