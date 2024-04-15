package bkukuczka.algorithmsedu.leetcode;

import bkukuczka.algorithmsedu.commons.BinaryTreeNode;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class UnivaluedTreeTest {
    @Test
    void shouldReturnTrueForUnivalTree() {
        //given
        var node6 = new BinaryTreeNode<>(1, null, null); //right-left
        var node5 = new BinaryTreeNode<>(1, null, null);  //left-right
        var node4 = new BinaryTreeNode<>(1, null, null); //left-left
        var node3 = new BinaryTreeNode<>(1, node6, null); //right
        var node2 = new BinaryTreeNode<>(1, node4, node5); //left
        var node1 = new BinaryTreeNode<>(1, node2, node3); //root

        //when
        var result = new UnivaluedTree().isUnivalTree(node1);

        //then
        assertThat(result).isTrue();
    }

    @Test
    void shouldReturnFalseForNonUnivalTree() {
        //given
        var node6 = new BinaryTreeNode<>(0, null, null); //right-left
        var node5 = new BinaryTreeNode<>(1, null, null);  //left-right
        var node4 = new BinaryTreeNode<>(1, null, null); //left-left
        var node3 = new BinaryTreeNode<>(1, node6, null); //right
        var node2 = new BinaryTreeNode<>(1, node4, node5); //left
        var node1 = new BinaryTreeNode<>(1, node2, node3); //root

        //when
        var result = new UnivaluedTree().isUnivalTree(node1);

        //then
        assertThat(result).isFalse();
    }
}