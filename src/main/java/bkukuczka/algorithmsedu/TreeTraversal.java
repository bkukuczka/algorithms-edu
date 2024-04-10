package bkukuczka.algorithmsedu;

import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

class TreeTraversal {

    List<Integer> postorder(TreehNode<Integer> root) {
        LinkedList<Integer> result = new LinkedList<>();
        Stack<TreehNode<Integer>> stack = new Stack<>();

        if (root == null) {
            return result;
        }

        stack.push(root);

        while (!stack.isEmpty()) {
            TreehNode<Integer> node = stack.pop();
            result.addFirst(node.value);

            stack.addAll(node.children);
        }

        return result;
    }

    List<Integer> inorder(TreehNode<Integer> root) {
        LinkedList<Integer> result = new LinkedList<>();


        return result;
    }
}
