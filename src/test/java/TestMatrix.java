import Concurrency.MatrixMultiply.*;
import Util.CreateTestMatrix;
import org.testng.annotations.Test;

public class TestMatrix {
    @Test
    public void test() {
        CreateTestMatrix createMatrix = new CreateTestMatrix();
        int[][] matrixA = createMatrix.create(120, 600000);
        int[][] matrixB = createMatrix.create(600000, 60);

        ComputingMatrix computingMatrix = new SerialComputing();
        MatrixMultiply matrixMultiply = new
                MatrixMultiply(matrixA, matrixB, computingMatrix);
        matrixMultiply.multiply();
        System.out.println("++++++++++++++++++++++++");

        ComputingMatrix computingMatrix2 = new ParallelComputing_CoreNum();
        MatrixMultiply matrixMultiply2 = new
                MatrixMultiply(matrixA, matrixB, computingMatrix2);
        matrixMultiply2.multiply();
    }
}
