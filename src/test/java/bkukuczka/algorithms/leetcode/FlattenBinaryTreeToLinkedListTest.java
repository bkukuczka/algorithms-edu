package bkukuczka.algorithms.leetcode;

import bkukuczka.algorithms.commons.BinaryTreeNode;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class FlattenBinaryTreeToLinkedListTest {
    @Test
    void flattenBT() {
        //given
        var node7 = new BinaryTreeNode<>(6, null, null);
        var node5 = new BinaryTreeNode<>(4, null, null);
        var node4 = new BinaryTreeNode<>(3, null, null);
        var node3 = new BinaryTreeNode<>(5, null, node7);
        var node2 = new BinaryTreeNode<>(2, node4, node5);
        var node1 = new BinaryTreeNode<>(1, node2, node3);

        //when
        new FlattenBinaryTreeToLinkedList().flatten(node1);

        //then
        assertThat(node1.value).isEqualTo(1);
        assertThat(node1.right.value).isEqualTo(2);
        assertThat(node1.right.right.value).isEqualTo(3);
        assertThat(node1.right.right.right.value).isEqualTo(4);
        assertThat(node1.right.right.right.right.value).isEqualTo(5);
        assertThat(node1.right.right.right.right.right.value).isEqualTo(6);
    }
}