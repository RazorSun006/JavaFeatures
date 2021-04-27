import Concurrency.MatrixMultiply.*;
import Util.CreateTestMatrix;
import org.testng.annotations.Test;

public class TestMatrix {
    @Test
    public void testSerial() {
        CreateTestMatrix createMatrix = new CreateTestMatrix();
        ComputingMatrix computingMatrix = new ParallelComputing_V1();
        MatrixMultiply matrixMultiply = new
                MatrixMultiply(createMatrix.create(300, 300), createMatrix.create(300, 500), computingMatrix);
        matrixMultiply.multiply();
    }
}
