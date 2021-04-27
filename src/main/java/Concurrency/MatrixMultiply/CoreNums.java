package Concurrency.MatrixMultiply;

public class CoreNums implements Runnable {
    int[][] result;
    int[][] matrixA;
    int[][] matrixB;
    int currentThread;
    int rowB;
    int rowOfResult;
    int threadSum;

    public CoreNums(int[][] result, int[][] matrixA, int[][] matrixB, int threadSum, int currentThread) {
        this.result = result;
        this.matrixA = matrixA;
        this.matrixB = matrixB;
        this.rowB = matrixB.length;
        this.currentThread = currentThread;
        this.rowOfResult = result.length;
        this.threadSum = threadSum;
    }

    @Override
    public void run() {

        int begin = (rowOfResult / threadSum) * currentThread;
        int end = begin + (rowOfResult / threadSum);
        for (int i = begin; i < end; i++) {
            for (int j = 0; j < result[0].length; j++) {
                result[i][j] = 0;
                for (int k = 0; k < rowB; k++) {
                    result[i][j] += matrixA[i][k] * matrixB[k][j];
                }
            }
        }
    }


}
