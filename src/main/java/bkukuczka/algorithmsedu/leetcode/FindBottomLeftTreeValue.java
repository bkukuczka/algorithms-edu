package bkukuczka.algorithmsedu.leetcode;

import bkukuczka.algorithmsedu.commons.BinaryTreeNode;

import java.util.LinkedList;
import java.util.Queue;

class FindBottomLeftTreeValue {
    int findBottomLeftTreeNode(BinaryTreeNode<Integer> root) {
        Queue<BinaryTreeNode<Integer>> queue = new LinkedList<>();
        queue.offer(root);

        while (!queue.isEmpty()) {
            root = queue.poll();

            if (root.right != null) {
                queue.offer(root.right);
            }

            if (root.left != null) {
                queue.offer(root.left);
            }
        }

        return root.value;
    }
}
