package bkukuczka.algorithms.leetcode;

import static java.lang.Integer.MAX_VALUE;
import static java.lang.Integer.MIN_VALUE;

class ReverseInteger {
    int reverse(int x) {
        int reversedInt = 0;

        while (x != 0) {
            int pop = x % 10;
            x /= 10;
            reversedInt = reversedInt * 10 + pop;

            if(reversedInt > MAX_VALUE/10 || reversedInt == MAX_VALUE/10 && pop > 7) {
                return 0;
            }
            if(reversedInt < MIN_VALUE/10 || reversedInt == MIN_VALUE/10 && pop < -8) {
                return 0;
            }
        }

        return reversedInt;
    }
}
