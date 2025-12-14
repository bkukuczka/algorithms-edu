package bkukuczka.algorithms.leetcode;

import java.util.LinkedList;
import java.util.Queue;

class MinimumSizeSubarraySum {
    int minSubArrLen(int s, int[] nums) {
        Queue<Integer> window = new LinkedList<>();
        int currentSum = 0;
        int minSize = Integer.MAX_VALUE;

        for (int i = 0; i < nums.length; i++) {
            window.offer(i);
            currentSum += i;

            if (currentSum >= s) {
                minSize = Math.min(minSize, window.size());
                currentSum = currentSum - window.poll();

                while (currentSum >= s && !window.isEmpty()) {
                    minSize = Math.min(minSize, window.size());
                    currentSum = currentSum - window.poll();
                }
            }
        }

        return minSize;
    }
}
