package bkukuczka.algorithmsedu;

import java.util.List;
import java.util.Set;

class GraphNode<T> {
    T value;
    List<GraphNode<T>> children;

    GraphNode(T value, List<GraphNode<T>> children) {
        this.value = value;
        this.children = children;
    }
}
