package bkukuczka.algorithmsedu;

import org.apache.commons.lang3.time.StopWatch;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class FibonacciTests {

    @Test
    void fibo() {
        //given
        int count = 7;
        long expected =  21L;

        Fibonacci algo = new Fibonacci();

        StopWatch watch = new StopWatch();

        //when
        watch.start();
        long result = algo.fib(count);
        watch.stop();

        //then
        Assertions.assertThat(result).isEqualTo(expected);
        System.out.println(watch);
    }

    @Test
    void fiboNoRec() {
        //given
        int count = 50;
        long expected =  20365011074L;

        Fibonacci algo = new Fibonacci();

        StopWatch watch = new StopWatch();

        //when
        watch.start();
        long result = algo.fibNoRec(count);
        watch.stop();

        //then
        Assertions.assertThat(result).isEqualTo(expected);
        System.out.println(watch);
    }
}
