package bkukuczka.algorithmsedu;

import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

class GraphTraversal {

    List<Integer> postorder(GraphNode<Integer> root) {
        LinkedList<Integer> result = new LinkedList<>();
        Stack<GraphNode<Integer>> stack = new Stack<>();

        if (root == null) {
            return result;
        }

        stack.push(root);

        while (!stack.isEmpty()) {
            GraphNode<Integer> node = stack.pop();
            result.addFirst(node.value);

            stack.addAll(node.children);
        }

        return result;
    }
}
