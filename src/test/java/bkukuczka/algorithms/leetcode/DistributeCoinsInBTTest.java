package bkukuczka.algorithms.leetcode;

import bkukuczka.algorithms.commons.BinaryTreeNode;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class DistributeCoinsInBTTest {

    @Test
    void shouldCountMovesToDistributeCoins() {
        //given
        var node7 = new BinaryTreeNode<>(0, null, null);  //right-right
        var node6 = new BinaryTreeNode<>(3, null, null); //right-left
        var node5 = new BinaryTreeNode<>(0, null, null);  //left-right
        var node4 = new BinaryTreeNode<>(4, null, null); //left-left
        var node3 = new BinaryTreeNode<>(0, node6, node7); //right
        var node2 = new BinaryTreeNode<>(0, node4, node5); //left
        var node1 = new BinaryTreeNode<>(0, node2, node3); //root


        //when
        int result = new DistributeCoinsInBT().distributeCoins(node1);

        //then
        assertThat(result).isEqualTo(8);
    }
}