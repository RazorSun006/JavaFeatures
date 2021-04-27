package Concurrency.MatrixMultiply;

public class ForEverySingleComputing implements Runnable{
    int rowB;
    int[][] result;
    int[][] matrixA;
    int[][] matrixB;
    int i;
    int j;

    public ForEverySingleComputing(int rowB, int[][] result, int[][] matrixA, int[][] matrixB, int i, int j) {
        this.rowB = rowB;
        this.result = result;
        this.matrixA = matrixA;
        this.matrixB = matrixB;
        this.i = i;
        this.j = j;
    }

    @Override
    public void run() {
        for (int k = 0; k < rowB; k++) {
            result[i][j] += matrixA[i][k] * matrixB[k][j];
        }
    }
}
