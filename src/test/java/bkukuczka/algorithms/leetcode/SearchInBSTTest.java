package bkukuczka.algorithms.leetcode;

import bkukuczka.algorithms.commons.BinaryTreeNode;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SearchInBSTTest {
    @Test
    void shouldFindSubtreeWithRootValue() {
        //given
        BinaryTreeNode<Integer> node8 = new BinaryTreeNode<>(8, null, null);
        BinaryTreeNode<Integer> node7 = new BinaryTreeNode<>(7, null, null);
        BinaryTreeNode<Integer> node6 = new BinaryTreeNode<>(6, node7, node8);
        BinaryTreeNode<Integer> node5 = new BinaryTreeNode<>(5, node6, null);
        BinaryTreeNode<Integer> node4 = new BinaryTreeNode<>(4, null, null);
        BinaryTreeNode<Integer> node3 = new BinaryTreeNode<>(3, node5, node6);
        BinaryTreeNode<Integer> node2 = new BinaryTreeNode<>(2, node4, null);
        BinaryTreeNode<Integer> node1 = new BinaryTreeNode<>(1, node3, node2);

        //when
        var result = new SearchInBST().search(node1, 5);

        //then
        assertThat(result.value).isEqualTo(5);
        assertThat(result.left.value).isEqualTo(6);
        assertThat(result.left.left.value).isEqualTo(7);
        assertThat(result.left.right.value).isEqualTo(8);
    }
}