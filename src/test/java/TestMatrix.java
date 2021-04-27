import Concurrency.MatrixMultiply.MatrixMultiplySerial;
import Util.CreateTestMatrix;
import org.testng.annotations.Test;

public class TestMatrix {
    @Test
    public void testSerial() {
        CreateTestMatrix createMatrix = new CreateTestMatrix();
        MatrixMultiplySerial matrixMultiplySerial = new MatrixMultiplySerial();

        matrixMultiplySerial.multiply(createMatrix.create(1000, 1000), createMatrix.create(1000, 1000));

    }
}
