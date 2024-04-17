package bkukuczka.algorithmsedu.leetcode;

import bkukuczka.algorithmsedu.commons.BinaryTreeNode;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

class BinaryTreeRightSideView {
    Map<Integer, Integer> map = new HashMap<>();

    List<Integer> rightSideView(BinaryTreeNode<Integer> root) {
        dfs(root, 0);
        return map.values().stream().toList();
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
