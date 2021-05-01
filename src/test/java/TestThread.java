import Concurrency.Thread.BankCounterCall.Window;
import Concurrency.Thread.Fly;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class TestThread {
    @Test
    private void testBankCall() throws InterruptedException {
        Window window1 = new Window("1");
        Window window2 = new Window("2");
        Window window3 = new Window("3");
        List<Thread>  list = new ArrayList<>();
        window1.start();
        list.add(window1);
        window2.start();
        list.add(window2);
        window3.start();
        list.add(window3);

        for (Thread thread:list) {
            thread.join();
        }


      /*  Fly fly = new Fly();
        Thread thread = new Thread(fly);
        thread.start();*/
    }
}
