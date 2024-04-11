package bkukuczka.algorithmsedu.leetcode;

import bkukuczka.algorithmsedu.commons.BinaryTreeNode;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class InvertBinaryTreeTest {


    @Test
    void shouldInvertBinaryTree() {
        //given
        var node7 = new BinaryTreeNode<>(9, null, null);
        var node6 = new BinaryTreeNode<>(6, null, null);
        var node5 = new BinaryTreeNode<>(3, null, null);
        var node4 = new BinaryTreeNode<>(1, null, null);
        var node3 = new BinaryTreeNode<>(7, node6, node7);
        var node2 = new BinaryTreeNode<>(2, node4, node5);
        var node1 = new BinaryTreeNode<>(4, node2, node3);

        //when
        var resultRoot = new InvertBinaryTree().invertTree(node1);

        //then
        assertThat(resultRoot.value).isEqualTo(4);
        assertThat(resultRoot.left.value).isEqualTo(7);
        assertThat(resultRoot.right.value).isEqualTo(2);
        assertThat(resultRoot.left.left.value).isEqualTo(9);
        assertThat(resultRoot.left.right.value).isEqualTo(6);
        assertThat(resultRoot.right.left.value).isEqualTo(3);
        assertThat(resultRoot.right.right.value).isEqualTo(1);
    }
}