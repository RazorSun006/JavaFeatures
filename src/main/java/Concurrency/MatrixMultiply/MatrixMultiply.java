package Concurrency.MatrixMultiply;

public class MatrixMultiply {
    int[][] matrixA;
    int[][] matrixB;
    int rowA;
    int columnA;
    int rowB;
    int columnB;
    ComputingMatrix computingMatrix;


    public MatrixMultiply(int[][] matrixA, int[][] matrixB, ComputingMatrix computingMatrix) {
        this.matrixA = matrixA;
        this.matrixB = matrixB;
        this.rowA = matrixA.length;
        this.columnA = matrixA[0].length;
        this.rowB = matrixB.length;
        this.columnB = matrixB[0].length;
        this.computingMatrix = computingMatrix;
    }

    public void multiply() {
      /*  display(matrixA);
        System.out.println();
        display(matrixB);
        System.out.println();*/
        long startTime = System.nanoTime();
        if (columnA != rowB) {
            return;
        }
        int[][] result = new int[rowA][columnB];
        computingMatrix.compute(matrixA, matrixB, rowA, rowB, columnB,result);
        long endTime = System.nanoTime();
        System.out.println(endTime - startTime + " ns ");
        System.out.println((endTime - startTime) / 1000000 + " ms ");
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
}
