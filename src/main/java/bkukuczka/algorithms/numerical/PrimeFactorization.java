package bkukuczka.algorithms.numerical;

import java.util.ArrayList;
import java.util.List;

class PrimeFactorization {

    List<Integer> findFactorsFor(int number) {
        List<Integer> result = new ArrayList<>();

        while (number % 2 == 0) {
            result.add(2);
            number = number / 2;
        }

        int factor = 3;
        double stopAt = Math.sqrt(number);

        while (factor <= stopAt) {
            while (number % factor == 0) {
                result.add(factor);

                number = number / factor;

                stopAt = Math.sqrt(number);
            }

            factor += 2;
        }

        if (number != 1) {
            result.add(number);
        }

        return result;
    }
}
