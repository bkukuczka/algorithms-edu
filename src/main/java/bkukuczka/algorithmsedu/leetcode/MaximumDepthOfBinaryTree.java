package bkukuczka.algorithmsedu.leetcode;

import bkukuczka.algorithmsedu.commons.BinaryTreeNode;

class MaximumDepthOfBinaryTree {
    int maxDepth(BinaryTreeNode<Integer> node) {
        if (node == null) {
            return 0;
        }

        var maxDepthLeft = maxDepth(node.left);
        var maxDepthRight = maxDepth(node.right);

        return Math.max(maxDepthLeft, maxDepthRight) + 1;
    }
}
