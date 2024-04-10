package bkukuczka.algorithmsedu;

import java.util.List;

class TreehNode<T> {
    T value;
    List<TreehNode<T>> children;

    TreehNode(T value, List<TreehNode<T>> children) {
        this.value = value;
        this.children = children;
    }
}
