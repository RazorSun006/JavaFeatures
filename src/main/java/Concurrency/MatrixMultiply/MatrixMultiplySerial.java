package Concurrency.MatrixMultiply;

public class MatrixMultiplySerial {

    public MatrixMultiplySerial() {

    }

    public void multiply(int[][] matrixA, int[][] matrixB) {
        long startTime = System.nanoTime();
        int rowA = matrixA.length;
        int columnA = matrixA[0].length;
        int rowB = matrixB.length;
        int columnB = matrixB[0].length;
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
        System.out.println();
      /*  display(result);*/
    }

    private void display(int[][] result) {
        for (int[] ints : result) {
            for (int j = 0; j < result[0].length; j++) {
                System.out.printf("%8d", ints[j]);
            }
            System.out.println();
        }
    }
}
