package Concurrency.MatrixMultiply;

public class ParallelComputing_CoreNum implements ComputingMatrix{
    @Override
    public void compute(int[][] matrixA, int[][] matrixB, int rowA, int rowB, int columnB, int[][] result) {
        int numThreads=Runtime.getRuntime().availableProcessors();
        for (int i=0; i<numThreads; i++) {
            CoreNums task = new CoreNums(rowB,rowA,columnB,result,matrixA,matrixA);
            Thread thread = new Thread(task);
            thread.start();
        }
        System.out.println(" the execution time of ParallelComputing_CoreNum version ");
    }
}
