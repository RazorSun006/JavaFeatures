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

    public int[][] multiply() {
        long startTime = System.nanoTime();
        if (columnA != rowB) {
            System.out.println("  wrong input ! ");
            return new int[1][1];
        }
        int[][] result = new int[rowA][columnB];
        computingMatrix.compute(matrixA, matrixB, rowA, rowB, columnB, result);
        long endTime = System.nanoTime();
        System.out.println(endTime - startTime + " ns ");
        System.out.println((endTime - startTime) / 1000000 + " ms ");
        System.out.println();
        return result;
    }
}
