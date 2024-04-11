package bkukuczka.algorithmsedu.leetcode;

import bkukuczka.algorithmsedu.commons.BinaryTreeNode;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SymmetricTreeTest {

    @Test
    void isSymmetric() {
        //given
        var node9 = new BinaryTreeNode<>(5, null, null);
        var node8 = new BinaryTreeNode<>(5, null, null);

        var node7 = new BinaryTreeNode<>(3, null, node9);
        var node6 = new BinaryTreeNode<>(4, null, null);

        var node5 = new BinaryTreeNode<>(4, null, null);
        var node4 = new BinaryTreeNode<>(3, node8, null);

        var node3 = new BinaryTreeNode<>(2, node6, node7);
        var node2 = new BinaryTreeNode<>(2, node4, node5);

        var node1 = new BinaryTreeNode<>(1, node2, node3);

        //when
        var result = new SymmetricTree().isTreeSymmetric(node1);

        //then
        assertThat(result).isTrue();
    }

    @Test
    void isNotSymmetric() {
        //given
        var node8 = new BinaryTreeNode<>(5, null, null);

        var node7 = new BinaryTreeNode<>(3, null, null);
        var node6 = new BinaryTreeNode<>(4, null, null);

        var node5 = new BinaryTreeNode<>(4, null, null);
        var node4 = new BinaryTreeNode<>(3, node8, null);

        var node3 = new BinaryTreeNode<>(2, node6, node7);
        var node2 = new BinaryTreeNode<>(2, node4, node5);

        var node1 = new BinaryTreeNode<>(1, node2, node3);

        //when
        var result = new SymmetricTree().isTreeSymmetric(node1);

        //then
        assertThat(result).isFalse();
    }
}