package Concurrency.MatrixMultiply;

import java.util.ArrayList;
import java.util.List;

public class ParallelComputing_CoreNum implements ComputingMatrix {
    @Override
    public void compute(int[][] matrixA, int[][] matrixB, int rowA, int rowB, int columnB, int[][] result) {
        /*  int numThreads = Runtime.getRuntime().availableProcessors();*/
        int numThreads = 12;
        System.out.println("numThreads = " + numThreads);
        List<Thread> threads = new ArrayList<>();
        for (int i = 0; i < numThreads; i++) {
            CoreNums task = new CoreNums(result, matrixA, matrixB, numThreads, i);
            Thread thread = new Thread(task);
            thread.start();
            threads.add(thread);
        }
        for (Thread thread: threads) {
            try {
                thread.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println(" the execution time of ParallelComputing_CoreNum version ");
    }
}
