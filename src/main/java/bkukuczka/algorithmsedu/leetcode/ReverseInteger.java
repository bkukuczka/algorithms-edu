package bkukuczka.algorithmsedu.leetcode;

class ReverseInteger {
    int reverse(int x) {
        int reversedInt = 0;

        while (x != 0) {
            int pop = x % 10;
            x /= 10;
            reversedInt = reversedInt * 10 + pop;
        }

        return reversedInt;
    }
}
