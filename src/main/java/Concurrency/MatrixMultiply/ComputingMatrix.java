package Concurrency.MatrixMultiply;

public interface ComputingMatrix {
    void compute(int[][] matrixA, int[][] matrixB, int rowA, int rowB, int columnB, int[][] result);
}
