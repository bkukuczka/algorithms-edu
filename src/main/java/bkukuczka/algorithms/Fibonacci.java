package bkukuczka.algorithms;

class Fibonacci {
    long fib(int n) {

        if (n <= 2) {
            return n;
        }

        return fib(n - 1) + fib(n - 2);
    }

    long fibNoRec(int n) {
        long[] arr = new long[n];
        arr[0] = 1L;
        arr[1] = 2L;

        for (int i = 2; i < n; i++) {
            arr[i] = arr[i - 1] + arr[i - 2];
        }

        return arr[n-1];
    }
}
