package bkukuczka.algorithmsedu.leetcode;

import bkukuczka.algorithmsedu.commons.BinaryTreeNode;
import org.junit.jupiter.api.Test;

import java.util.List;

import static java.util.Arrays.asList;
import static org.assertj.core.api.Assertions.assertThat;

class BinaryTreeRightSideViewTest {
    @Test
    void shouldShowRightSide() {
        //given
        var node10 = new BinaryTreeNode<>(10, null, null);
        var node9 = new BinaryTreeNode<>(9, null, node10);
        var node8 = new BinaryTreeNode<>(8, null, null);
        var node7 = new BinaryTreeNode<>(7, null, node9);
        var node6 = new BinaryTreeNode<>(6, node8, null);
        var node5 = new BinaryTreeNode<>(5, null, null);
        var node4 = new BinaryTreeNode<>(4, null, node7);
        var node3 = new BinaryTreeNode<>(3, null, node6);
        var node2 = new BinaryTreeNode<>(2, node4, node5);
        var node1 = new BinaryTreeNode<>(1, node2, node3);

        //when
        List<Integer> result = new BinaryTreeRightSideView().rightSideView(node1);

        //then
        assertThat(result).isEqualTo(asList(1, 3, 6, 8, 9, 10));
    }

}