package bkukuczka.algorithms.leetcode;

import java.util.ArrayList;
import java.util.List;

class SelfDividingNumbers {
    List<Integer> findNumbers(int left, int right) {
        List<Integer> result = new ArrayList<>();
        outer:
        for (int i = left; i <= right; i++) {

            for (int j = i; j > 0; j /= 10) {
                if (j % 10 == 0 || i % (j % 10) != 0) {
                    continue outer;
                }
            }
            result.add(i);
        }

        return result;
    }
}
