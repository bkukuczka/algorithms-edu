package bkukuczka.algorithmsedu.leetcode;

import bkukuczka.algorithmsedu.commons.BinaryTreeNode;

class BinaryTreePruning {
    BinaryTreeNode<Integer> pruneTree(BinaryTreeNode<Integer> root) {
        if (root == null) {
            return null;
        }

        root.left = pruneTree(root.left);
        root.right = pruneTree(root.right);

        if (root.left == null && root.right == null && root.value == 0) {
            return null;
        }

        return root;
    }
}
