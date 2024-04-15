package bkukuczka.algorithmsedu.leetcode;

import bkukuczka.algorithmsedu.commons.BinaryTreeNode;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class BinaryTreePruningTest {
    @Test
    void pruneTree() {
        //given
        var node7 = new BinaryTreeNode<>(1, null, null);  //right-right
        var node6 = new BinaryTreeNode<>(0, null, null); //right-left
        var node5 = new BinaryTreeNode<>(0, null, null);  //left-right
        var node4 = new BinaryTreeNode<>(0, null, null); //left-left
        var node3 = new BinaryTreeNode<>(1, node6, node7); //right
        var node2 = new BinaryTreeNode<>(0, node4, node5); //left
        var node1 = new BinaryTreeNode<>(1, node2, node3); //root

        //when
        var result = new BinaryTreePruning().pruneTree(node1);

        //then
        assertThat(result.left).isNull();
        assertThat(result.right).isNotNull();
        assertThat(result.right.left).isNull();
        assertThat(result.right.right).isNotNull();
    }
}