package Concurrency.MatrixMultiply;

public class MatrixMultiply implements Runnable {
    int[][] matrixA;
    int[][] matrixB;
    int rowA;
    int columnA;
    int rowB;
    int columnB;


    public MatrixMultiply(int[][] matrixA, int[][] matrixB) {
        this.matrixA = matrixA;
        this.matrixB = matrixB;
        this.rowA = matrixA.length;
        this.columnA = matrixA[0].length;
        this.rowB = matrixB.length;
        this.columnB = matrixB[0].length;
    }

    public void multiply() {
        display(matrixA);
        System.out.println();
        display(matrixB);
        System.out.println();
        long startTime = System.nanoTime();
        if (columnA != rowB) {
            return;
        }
        int[][] result = new int[rowA][columnB];
        for (int i = 0; i < rowA; i++) {
            for (int j = 0; j < columnB; j++) {
                for (int k = 0; k < rowB; k++) {
                    result[i][j] += matrixA[i][k] * matrixB[k][j];
                }
            }
        }
        long endTime = System.nanoTime();
        System.out.println(" the execution time of serial version ");
        System.out.println(endTime - startTime + " ns ");
        System.out.println((endTime - startTime) / (1000 * 1000) + " s ");
        System.out.println();
          display(result);
    }

    private void display(int[][] result) {
        for (int[] ints : result) {
            for (int j = 0; j < result[0].length; j++) {
                System.out.printf("%8d", ints[j]);
            }
            System.out.println();
        }
    }

    @Override
    public void run() {

    }
}
