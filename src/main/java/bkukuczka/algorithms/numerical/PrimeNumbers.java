package bkukuczka.algorithms.numerical;

import java.util.ArrayList;
import java.util.List;

class PrimeNumbers {
    List<Integer> findPrimesUpTo(int maxNumber) {
        //boolean array by default initializes with fals
        //+1 to account for 0 index (optionally add +1 to i everywhere)
        boolean[] numbers = new boolean[maxNumber + 1];

        //setting to true means crossing out
        numbers[0] = true;
        numbers[1] = true;

        int currentPrime = 2;

        while (currentPrime < Math.sqrt(maxNumber)) {
            crossOut(numbers, currentPrime * currentPrime, currentPrime, maxNumber);
            currentPrime = findNextPrime(numbers, currentPrime);
        }

        return collectPrimes(numbers);
    }

    private void crossOut(boolean[] array, int start, int stepSize, int end) {
        for (int i = start; i <= end; i += stepSize) {
            array[i] = true;
        }
    }

    private int findNextPrime(boolean[] numbers, int currentPrime) {
        for (int i = currentPrime + 1; i < numbers.length; i++) {
            if (!numbers[i]) {
                return i;
            }
        }
        return -1;
    }

    private List<Integer> collectPrimes(boolean[] numbers) {
        List<Integer> primes = new ArrayList<>();

        for (int i = 2; i < numbers.length; i++) {
            if (!numbers[i]) {
                primes.addLast(i);
            }
        }

        return primes;
    }
}
