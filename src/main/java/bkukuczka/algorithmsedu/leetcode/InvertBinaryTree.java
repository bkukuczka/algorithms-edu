package bkukuczka.algorithmsedu.leetcode;

import bkukuczka.algorithmsedu.commons.BinaryTreeNode;

import java.util.Objects;

class InvertBinaryTree {
    BinaryTreeNode<Integer> invertTree(BinaryTreeNode<Integer> root) {

        if (Objects.isNull(root)) {
            return null;
        }

        var left = invertTree(root.left);
        root.left = invertTree(root.right);
        root.right = left;

        return root;
    }
}
