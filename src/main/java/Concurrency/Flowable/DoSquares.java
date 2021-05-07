package Concurrency.Flowable;

import io.reactivex.Flowable;
import io.reactivex.schedulers.Schedulers;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class DoSquares {
    @Test
    public void doSquares() {
        List squares = new ArrayList();
        Flowable.range(1, 64) //1
                .observeOn(Schedulers.computation()) //2
                .map(v -> v * v) //3
                .blockingSubscribe(squares::add); //4

    }
}
