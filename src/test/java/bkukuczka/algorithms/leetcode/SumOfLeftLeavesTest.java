package bkukuczka.algorithms.leetcode;

import bkukuczka.algorithms.commons.BinaryTreeNode;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SumOfLeftLeavesTest {
    @Test
    void shouldReturnSumOfOnlyLeftLeaves() {
        //given
        var node6 = new BinaryTreeNode<>(7, null, null);
        var node5 = new BinaryTreeNode<>(15, null, null);
        var node4 = new BinaryTreeNode<>(12, null, null);
        var node3 = new BinaryTreeNode<>(20, node5, node6);
        var node2 = new BinaryTreeNode<>(9, node4, null);
        var node1 = new BinaryTreeNode<>(3, node2, node3);

        //when
        int result = new SumOfLeftLeaves().sumLeftLeaves(node1);

        //then
        assertThat(result).isEqualTo(27);
    }

}