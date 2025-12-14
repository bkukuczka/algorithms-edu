package bkukuczka.algorithms.leetcode;

import bkukuczka.algorithms.commons.BinaryTreeNode;

class SymmetricTree {
    boolean isTreeSymmetric(BinaryTreeNode<Integer> node) {
        return isMirror(node, node);
    }

    private boolean isMirror(BinaryTreeNode<Integer> one, BinaryTreeNode<Integer> two) {
        if (one == null && two == null) {
            return true;
        }

        if (one == null ^ two == null) {
            return false;
        }

        return one.value == two.value && isMirror(one.left, two.right) && isMirror(one.right, two.left);
    }
}
