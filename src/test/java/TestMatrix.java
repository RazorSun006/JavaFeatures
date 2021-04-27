import Concurrency.MatrixMultiply.MatrixMultiply;
import Util.CreateTestMatrix;
import org.testng.annotations.Test;

public class TestMatrix {
    @Test
    public void testSerial() {
        CreateTestMatrix createMatrix = new CreateTestMatrix();
        MatrixMultiply matrixMultiply = new MatrixMultiply(createMatrix.create(3, 3), createMatrix.create(3, 5));
        matrixMultiply.multiply();
    }

    @Test
    public void testParallel_v1() {
        CreateTestMatrix createMatrix = new CreateTestMatrix();


    }
}
