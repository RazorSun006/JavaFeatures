import Concurrency.FileSearch.Result;
import Concurrency.FileSearch.SerialFileSearch;
import org.testng.annotations.Test;

import java.io.File;

import static Concurrency.FileSearch.SerialFileSearch.searchFiles;

public class TestFile {
    @Test
    public void testSerialFileSearch() {
        File file = new File("D:\\");
        String fileName = "006.jpg";
        Result result = new Result();
        searchFiles(file, fileName, result);
        System.out.println("test name change for github");
    }
}
