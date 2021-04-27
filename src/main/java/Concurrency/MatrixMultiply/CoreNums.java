package Concurrency.MatrixMultiply;

public class CoreNums implements Runnable{
    int rowB;
    int rowA;
    int columnB;
    int[][] result;
    int[][] matrixA;
    int[][] matrixB;

    public CoreNums(int rowB, int rowA, int columnB, int[][] result, int[][] matrixA, int[][] matrixB) {
        this.rowB = rowB;
        this.rowA = rowA;
        this.columnB = columnB;
        this.result = result;
        this.matrixA = matrixA;
        this.matrixB = matrixB;
    }

    @Override
    public void run() {
        computingResultMatrix(rowA, columnB, rowB, result, matrixA, matrixB);
    }

    static void computingResultMatrix(int rowA, int columnB, int rowB, int[][] result, int[][] matrixA, int[][] matrixB) {
        for (int i = 0; i < rowA; i++) {
            for (int j = 0; j < columnB; j++) {
                for (int k = 0; k < rowB; k++) {
                    result[i][j] += matrixA[i][k] * matrixB[k][j];
                }
            }
        }
    }
}
