import Concurrency.MatrixMultiply.*;
import Util.CreateTestMatrix;
import org.testng.annotations.Test;

public class TestMatrix {
    @Test
    public void test() {
        CreateTestMatrix createMatrix = new CreateTestMatrix();
        int[][] matrixA = createMatrix.create(240, 100000);
        int[][] matrixB = createMatrix.create(100000, 60);
        ComputingMatrix computingMatrix = new SerialComputing();
        MatrixMultiply matrixMultiply = new
                MatrixMultiply(matrixA, matrixB, computingMatrix);
        int[][] result = matrixMultiply.multiply();
        System.out.println("++++++++++++++++++++++++");
        ComputingMatrix computingMatrix2 = new ParallelComputing_CoreNum();
        MatrixMultiply matrixMultiply2 = new
                MatrixMultiply(matrixA, matrixB, computingMatrix2);
        int[][] result2 = matrixMultiply2.multiply();
        System.out.println("is same ? " + ifSameResultArray(result, result2));
    }

    private void display(int[][] result) {
        for (int[] ints : result) {
            for (int j = 0; j < result[0].length; j++) {
                System.out.printf("%8d", ints[j]);
            }
            System.out.println();
        }
        System.out.println("ssh without ssr ");
    }

    private boolean ifSameResultArray(int[][] result, int[][] result2) {
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[0].length; j++) {
                if (result[i][j] != result2[i][j]) {
                    return false;
                }
            }
        }
        return true;
    }
}
