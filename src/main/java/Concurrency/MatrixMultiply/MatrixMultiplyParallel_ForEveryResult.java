package Concurrency.MatrixMultiply;

/** in this implementation we extract logic of the serial program
 *  so in this case we extract the for loop
 *  and how to use it ? for the nexted loop we can extract the inner loop
 *  for the runnable . and if we use the runnable interface we need the
 *  thread and start it . so we put the logic into the runnbale method
 *  and how we transfer the parameter ?
 *
 *  the solution is to use the constructor to set the parameter */
public class MatrixMultiplyParallel_ForEveryResult implements Runnable {






    @Override
    public void run() {

    }
}
