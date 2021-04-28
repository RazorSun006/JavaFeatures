import Concurrency.Thread.BankCounterCall.Window;
import org.testng.annotations.Test;

public class TestThread {
    @Test
    private void testBankCall() {
        Window window1 = new Window("1");
        Window window2 = new Window("2");
        Window window3 = new Window("3");

        window1.start();
        window2.start();
        window3.start();
    }
}
