package bkukuczka.algorithmsedu.leetcode;

import bkukuczka.algorithmsedu.commons.BinaryTreeNode;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class MergeTwoBinaryTreesTest {

    @Test
    void shouldMergeTwoBinaryTrees() {
        //given
        //t1:
        var node4 = new BinaryTreeNode<>(5, null, null);
        var node3 = new BinaryTreeNode<>(3, node4, null);
        var node2 = new BinaryTreeNode<>(2, null, null);
        var node1 = new BinaryTreeNode<>(1, node3, node2);

        //t2:
        var node9 = new BinaryTreeNode<>(4, null, null);
        var node8 = new BinaryTreeNode<>(7, null, null);
        var node7 = new BinaryTreeNode<>(1, null, node9);
        var node6 = new BinaryTreeNode<>(3, null, node8);
        var node5 = new BinaryTreeNode<>(2, node7, node6);

        //when
        var resultRoot = new MergeTwoBinaryTrees().mergeTrees(node1, node5);

        //then
        assertThat(resultRoot.value).isEqualTo(3);
        assertThat(resultRoot.left.value).isEqualTo(4);
        assertThat(resultRoot.right.value).isEqualTo(5);
        assertThat(resultRoot.left.left.value).isEqualTo(5);
        assertThat(resultRoot.left.right.value).isEqualTo(4);
        assertThat(resultRoot.right.right.value).isEqualTo(7);
    }
}