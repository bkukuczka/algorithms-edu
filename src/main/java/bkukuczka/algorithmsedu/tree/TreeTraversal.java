package bkukuczka.algorithmsedu.tree;

import bkukuczka.algorithmsedu.commons.BinaryTreeNode;
import bkukuczka.algorithmsedu.commons.TreeNode;

import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class TreeTraversal {

    public List<Integer> postorder(TreeNode<Integer> root) {
        LinkedList<Integer> result = new LinkedList<>();
        Stack<TreeNode<Integer>> stack = new Stack<>();

        if (root == null) {
            return result;
        }

        stack.push(root);

        while (!stack.isEmpty()) {
            TreeNode<Integer> node = stack.pop();
            result.addFirst(node.value);

            stack.addAll(node.children);
        }

        return result;
    }

    public List<Integer> inorder(BinaryTreeNode<Integer> root) {
        LinkedList<Integer> result = new LinkedList<>();
        Stack<BinaryTreeNode<Integer>> stack = new Stack<>();

        if (root == null) {
            return result;
        }

        BinaryTreeNode<Integer> current = root;

        while (current != null || !stack.isEmpty()) {
            while (current != null) {
                stack.push(current);
                current = current.left;
            }

            var pop = stack.pop();
            result.add(pop.value);
            current = pop.right;
        }


        return result;
    }

    public List<Integer> preorder(TreeNode<Integer> root) {
        LinkedList<Integer> result = new LinkedList<>();
        Stack<TreeNode<Integer>> stack = new Stack<>();

        if (root == null) {
            return result;
        }

        stack.push(root);

        while (!stack.isEmpty()) {
            TreeNode<Integer> node = stack.pop();
            result.add(node.value);

            for (int i = node.children.size() - 1; i >= 0; i--) {
                stack.push(node.children.get(i));
            }
        }

        return result;
    }
}
