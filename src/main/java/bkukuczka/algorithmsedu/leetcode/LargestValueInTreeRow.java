package bkukuczka.algorithmsedu.leetcode;

import bkukuczka.algorithmsedu.commons.BinaryTreeNode;

import java.util.ArrayList;
import java.util.List;

class LargestValueInTreeRow {
    List<Integer> largestValues(BinaryTreeNode<Integer> node) {
        List<Integer> result = new ArrayList<>();
        dfs(node, result, 0);
        return result;
    }

    private void dfs(BinaryTreeNode<Integer> node, List<Integer> result, int level) {
        if (node == null) {
            return;
        }

        if (result.size() <= level) {
            result.add(node.value);
        } else {
            result.set(level, Math.max(result.get(level), node.value));
        }

        dfs(node.left, result, level + 1);
        dfs(node.right, result, level + 1);
    }
}
