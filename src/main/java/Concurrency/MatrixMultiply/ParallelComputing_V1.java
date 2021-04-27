package Concurrency.MatrixMultiply;

public class ParallelComputing_V1 implements ComputingMatrix{
    @Override
    public void compute(int[][] matrixA, int[][] matrixB, int rowA, int rowB, int columnB, int[][] result) {
        for (int i = 0; i < rowA; i++) {
            for (int j = 0; j < columnB; j++) {
              ForEverySingleComputing task  = new ForEverySingleComputing(rowB,result,matrixA,matrixB,i,j);
              Thread thread = new Thread(task);
              thread.start();
            }
        }
        System.out.println(" the execution time of ParallelComputing_V1 version ");
    }
}
