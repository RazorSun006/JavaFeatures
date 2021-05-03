package Concurrency.Thread.TwoDistinctTask;

public class Eating extends Thread {
    private int eatTimes = 0;

    public int getEatTimes() {
        return eatTimes;
    }

    @Override
    public void run() {
        while (eatTimes <= 1000) {
            System.out.println("eating times : " + eatTimes++);
        }
    }
}
