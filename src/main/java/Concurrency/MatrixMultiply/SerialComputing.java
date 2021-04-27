package Concurrency.MatrixMultiply;

public class SerialComputing implements ComputingMatrix {
    @Override
    public void compute(int[][] matrixA, int[][] matrixB, int rowA, int rowB, int columnB, int[][] result) {
        for (int i = 0; i < rowA; i++) {
            for (int j = 0; j < columnB; j++) {
                for (int k = 0; k < rowB; k++) {
                    result[i][j] += matrixA[i][k] * matrixB[k][j];
                }
            }
        }
        System.out.println(" the execution time of serial version ");
    }

}
