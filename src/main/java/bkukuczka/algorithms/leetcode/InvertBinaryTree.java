package bkukuczka.algorithms.leetcode;

import bkukuczka.algorithms.commons.BinaryTreeNode;

import java.util.Objects;

class InvertBinaryTree {
    BinaryTreeNode<Integer> invertTree(BinaryTreeNode<Integer> root) {

        if (Objects.isNull(root)) {
            return root;
        }

        var left = invertTree(root.left);
        var right = invertTree(root.right);

        root.right = left;
        root.left = right;

        return root;
    }
}
