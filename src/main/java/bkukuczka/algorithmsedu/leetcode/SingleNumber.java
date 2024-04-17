package bkukuczka.algorithmsedu.leetcode;

class SingleNumber {
    int single(int[] nums) {
        int result = 0;

        for (int num : nums) {
            result ^= num;
        }

        return result;
    }
}
