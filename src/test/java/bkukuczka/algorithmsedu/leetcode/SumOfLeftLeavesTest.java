package bkukuczka.algorithmsedu.leetcode;

import bkukuczka.algorithmsedu.commons.BinaryTreeNode;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SumOfLeftLeavesTest {
    @Test
    void shouldReturnSumOfOnlyLeftLeaves() {
        //given
        var node5 = new BinaryTreeNode<>(7, null, null);
        var node4 = new BinaryTreeNode<>(15, null, null);
        var node3 = new BinaryTreeNode<>(20, node4, node5);
        var node2 = new BinaryTreeNode<>(9, null, null);
        var node1 = new BinaryTreeNode<>(3, node2, node3);

        //when
        int result = new SumOfLeftLeaves().sumLeftLeaves(node1);

        //then
        assertThat(result).isEqualTo(24);
    }

}