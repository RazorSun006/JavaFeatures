package Concurrency.MatrixMultiply;

public class SerialComputing implements ComputingMatrix {
    @Override
    public void compute(int[][] matrixA, int[][] matrixB, int rowA, int rowB, int columnB, int[][] result) {
        CoreNums.computingResultMatrix(rowA, columnB, rowB, result, matrixA, matrixB);
        System.out.println(" the execution time of serial version ");
    }

}
