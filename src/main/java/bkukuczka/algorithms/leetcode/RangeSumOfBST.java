package bkukuczka.algorithms.leetcode;

import bkukuczka.algorithms.commons.BinaryTreeNode;

import java.util.Stack;

class RangeSumOfBST {
    int rangeSum(BinaryTreeNode<Integer> root, int L, int R) {
        int sum = 0;
        Stack<BinaryTreeNode<Integer>> stack = new Stack<>();
        stack.push(root);

        while (!stack.isEmpty()) {
            var node = stack.pop();

            if (node != null) {
                if (node.value >= L && node.value <= R) {
                    sum += node.value;
                }

                if (node.value > L) {
                    stack.push(node.left);
                }

                if (node.value < R) {
                    stack.push(node.right);
                }
            }
        }

        return sum;

//        if (root == null) {
//            return 0;
//        }
//
//        int sum = 0;
//
//        if (root.value >= L && root.value <= R) {
//            sum = root.value;
//        }
//
//        return sum + rangeSum(root.left, L, R) + rangeSum(root.right, L, R);
    }
}
