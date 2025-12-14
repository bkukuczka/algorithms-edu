package bkukuczka.algorithms.leetcode;

import bkukuczka.algorithms.commons.BinaryTreeNode;

import java.util.Stack;

/**
 * determine if there is a tree branch that sums to a given amount
 */
class PathSum {
    boolean hasPathSum(BinaryTreeNode<Integer> node, int sum) {
        if (node == null) {
            return false;
        }

        Stack<BinaryTreeNode<Integer>> stack = new Stack<>();
        Stack<Integer> sumStack = new Stack<>();

        stack.push(node);
        sumStack.push(sum - node.value);

        while (!stack.isEmpty()) {
            var current = stack.pop();

            var currentSum = sumStack.pop();

            if (current.left == null && current.right == null && currentSum == 0) {
                return true;
            }

            if (current.left != null) {
                stack.push(current.left);
                sumStack.push(currentSum - current.left.value);
            }

            if (current.right != null) {
                stack.push(current.right);
                sumStack.push(currentSum - current.right.value);
            }
        }
        return false;
    }
}
