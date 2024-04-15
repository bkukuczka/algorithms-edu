package bkukuczka.algorithmsedu.leetcode;

import bkukuczka.algorithmsedu.commons.BinaryTreeNode;

class DistributeCoinsInBT {
    int numMoves;

    int distributeCoins(BinaryTreeNode<Integer> root) {
        giveCoins(root);
        return numMoves;
    }

    private int giveCoins(BinaryTreeNode<Integer> node) {
        if (node == null) {
            return 0;
        }

        int left = giveCoins(node.left);
        int right = giveCoins(node.right);

        numMoves += Math.abs(left) + Math.abs(right);

        return node.value + left + right - 1;
    }
}
