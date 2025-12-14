package bkukuczka.algorithms.leetcode;

import bkukuczka.algorithms.commons.BinaryTreeNode;

import java.util.LinkedList;
import java.util.Queue;

class UnivaluedTree {
    boolean isUnivalTree(BinaryTreeNode<Integer> root) {
        int value = root.value;

        Queue<BinaryTreeNode<Integer>> queue = new LinkedList<>();
        queue.offer(root);

        while (!queue.isEmpty()) {
            var node = queue.poll();
            if (node.value != value) {
                return false;
            }

            if (node.left != null) {
                queue.offer(node.left);
            }

            if (node.right != null) {
                queue.offer(node.right);
            }
        }

        return true;
    }
}
