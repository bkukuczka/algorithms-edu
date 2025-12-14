package bkukuczka.algorithms.leetcode;

import bkukuczka.algorithms.commons.BinaryTreeNode;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class RangeSumOfBSTTest {
    @Test
    void shouldReturnSumOfNodesBetweenLAndR() {
        //given
        var node7 = new BinaryTreeNode<>(18, null, null);  //right-right
        var node5 = new BinaryTreeNode<>(7, null, null);  //left-right
        var node4 = new BinaryTreeNode<>(3, null, null); //left-left
        var node3 = new BinaryTreeNode<>(15, null, node7); //right
        var node2 = new BinaryTreeNode<>(5, node4, node5); //left
        var node1 = new BinaryTreeNode<>(10, node2, node3); //root

        //when
        var result = new RangeSumOfBST().rangeSum(node1, 7, 15);

        //then
        assertThat(result).isEqualTo(32);
    }

}