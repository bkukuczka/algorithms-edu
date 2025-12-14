package bkukuczka.algorithms.leetcode;

import bkukuczka.algorithms.commons.BinaryTreeNode;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class MaximumDepthOfBinaryTreeTest {

    @Test
    void shouldReturnMaxDepthOfBinaryTree() {
        //given
        //fifth level
        var node9 = new BinaryTreeNode<>(9, null, null);

        //fourth level
        var node8 = new BinaryTreeNode<>(8, node9, null);
        var node7 = new BinaryTreeNode<>(7, null, null);

        //third level
        var node6 = new BinaryTreeNode<>(6, null, null);
        var node5 = new BinaryTreeNode<>(5, node7, null);
        var node4 = new BinaryTreeNode<>(4, null, node8);

        //second level
        var node3 = new BinaryTreeNode<>(3, node6, null);
        var node2 = new BinaryTreeNode<>(2, node4, node5);

        //root - first level
        var node1 = new BinaryTreeNode<>(1, node2, node3);


        //when
        int result = new MaximumDepthOfBinaryTree().maxDepth(node1);

        //then
        assertThat(result).isEqualTo(5);
    }
}