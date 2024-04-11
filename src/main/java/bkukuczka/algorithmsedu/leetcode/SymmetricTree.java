package bkukuczka.algorithmsedu.leetcode;

import bkukuczka.algorithmsedu.commons.BinaryTreeNode;

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

        if (one.value != two.value) {
            return false;
        }

        return isMirror(one.left, two.right) && isMirror(one.right, two.left);
    }
}
