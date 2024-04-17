package bkukuczka.algorithmsedu.leetcode;

import bkukuczka.algorithmsedu.commons.BinaryTreeNode;

import java.util.*;

class BinaryTreeRightSideView {
    Map<Integer, Integer> map = new HashMap<>();

    List<Integer> result = new ArrayList<>();
    Queue<BinaryTreeNode<Integer>> queue = new LinkedList<>();

    List<Integer> rightSideView(BinaryTreeNode<Integer> root) {
        if (root == null) {
            return result;
        }

        queue.offer(root);

        while (!queue.isEmpty()) {
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                var current = queue.poll();
                if (i == 0) {
                    result.add(current.value);
                }
                if (current.right != null) {
                    queue.offer(current.right);
                }

                if (current.left != null) {
                    queue.offer(current.left);
                }
            }
        }

        return result;

//        dfs(root, 0);
//        return map.values().stream().toList();
    }

    private void dfs(BinaryTreeNode<Integer> node, int level) {
        if (node == null) {
            return;
        }
        map.put(level, node.value);
        dfs(node.left, level + 1);
        dfs(node.right, level + 1);
    }
}
