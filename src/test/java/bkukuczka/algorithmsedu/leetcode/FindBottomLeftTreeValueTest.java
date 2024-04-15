package bkukuczka.algorithmsedu.leetcode;

import bkukuczka.algorithmsedu.commons.BinaryTreeNode;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class FindBottomLeftTreeValueTest {
    @Test
    void shouldFindBottomLeftNode() {
        //given
        //            1
        //          /   \
        //         2     3
        //        / \   / \
        //       4   5 6   7
        //            /
        //           8
        var node8 = new BinaryTreeNode<>(8, null, null);
        var node7 = new BinaryTreeNode<>(7, null, null);
        var node6 = new BinaryTreeNode<>(6, node8, null);
        var node5 = new BinaryTreeNode<>(5, null, null);
        var node4 = new BinaryTreeNode<>(4, null, null);
        var node3 = new BinaryTreeNode<>(3, node6, node7);
        var node2 = new BinaryTreeNode<>(2, node4, node5);
        var node1 = new BinaryTreeNode<>(1, node2, node3);


        //wehn
        int result = new FindBottomLeftTreeValue().findBottomLeftTreeNode(node1);

        //then
        assertThat(result).isEqualTo(8);
    }

}