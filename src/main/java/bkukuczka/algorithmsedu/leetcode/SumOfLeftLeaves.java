package bkukuczka.algorithmsedu.leetcode;

import bkukuczka.algorithmsedu.commons.BinaryTreeNode;

import java.util.LinkedList;
import java.util.Queue;

class SumOfLeftLeaves {
    int sumLeftLeaves(BinaryTreeNode<Integer> root) {
        Queue<BinaryTreeNode<Integer>> queue = new LinkedList<>();
        queue.offer(root);
        int sum = 0;

        while (!queue.isEmpty()) {
            var current = queue.poll();

            if (current.left != null) {
                queue.offer(current.left);
                sum += current.left.value;
            }

            if (current.right != null) {
                queue.offer(current.right);
            }
        }

        return sum;
    }
}
