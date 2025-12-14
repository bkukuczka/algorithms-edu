package bkukuczka.algorithms.leetcode;

import bkukuczka.algorithms.commons.BinaryTreeNode;

import java.util.LinkedList;
import java.util.Queue;

class SearchInBST {
    BinaryTreeNode<Integer> search(BinaryTreeNode<Integer> root, int value) {
        Queue<BinaryTreeNode<Integer>> queue = new LinkedList<>();
        queue.offer(root);

        while (!queue.isEmpty()) {
            var current = queue.poll();

            if (current.value == value) {
                return current;
            }

            if (current.left != null) {
                queue.offer(current.left);
            }

            if (current.right != null) {
                queue.offer(current.right);
            }
        }

        return null;
    }
}
