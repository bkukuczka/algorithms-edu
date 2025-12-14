package bkukuczka.algorithms.commons;

import java.util.List;

public class TreeNode<T> {
    public T value;
    public List<TreeNode<T>> children;

    public TreeNode(T value, List<TreeNode<T>> children) {
        this.value = value;
        this.children = children;
    }
}
