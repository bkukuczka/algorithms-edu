package bkukuczka.algorithms.leetcode;

class SingleNumber {
    int single(int[] nums) {
        int result = 0;

        for (int num : nums) {
            result ^= num;
        }

        return result;
    }
}
