package Concurrency.Thread.Fundamentals;

import static com.sun.xml.internal.ws.spi.db.BindingContextFactory.LOGGER;
import static org.junit.Assert.assertFalse;

public class SampleThread extends Thread {
    public int processingCount = 1;

    @Override
    public void run() {
        LOGGER.info("Thread " + Thread.currentThread().getName() + " started");
        while (processingCount > 0) {
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                LOGGER.info("Thread " + this.getName() + " interrupted");
            }
            processingCount--;
        }
        LOGGER.info("Thread " + this.getName() + " exiting");
    }


    public static void main(String[] args) throws InterruptedException {
        Thread t0 = new SampleThread();
        t0.setName("T0");
        t0.start();
        Thread t1 = new SampleThread();
        t1.setName("T1");
        t1.start();
        t1.join(1000);
        System.out.println(t1.isAlive());
    }
}

