package Concurrency.Thread.TwoDistinctTask;

/*despite the problems of the multiple thread share the shared data
 * and read and write  that is dangerous but if we just want to imitate
 * some simultaneously task . we can use the thread safely if these task
 * really have no dependency from each other .they are totally different !
 * so with multiple cores don't give the feeling for the task simultaneously run
 * but the threads */
public class EatingAndWatching {
    public static void main(String[] args) throws InterruptedException {
        Thread eating = new Eating();
        Thread watching = new Watching();
        eating.start();
        watching.start();
    }


}
