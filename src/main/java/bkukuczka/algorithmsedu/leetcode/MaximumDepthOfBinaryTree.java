package bkukuczka.algorithmsedu.leetcode;

import bkukuczka.algorithmsedu.commons.BinaryTreeNode;

class MaximumDepthOfBinaryTree {
    int maxDepth(BinaryTreeNode<Integer> node) {
        if (node == null) {
            return 0;
        }

        var maxDepthLeft = maximumDepth(node.left, 1);
        var maxDepthRight = maximumDepth(node.right, 1);

        return Math.max(maxDepthLeft, maxDepthRight);
    }

    private int maximumDepth(BinaryTreeNode<Integer> node, int depth) {
        if (node == null) {
            return depth;
        }

        var maxDepthLeft = maximumDepth(node.left, depth + 1);
        var maxDepthRight = maximumDepth(node.right, depth + 1);

        return Math.max(maxDepthLeft, maxDepthRight);
    }
}
