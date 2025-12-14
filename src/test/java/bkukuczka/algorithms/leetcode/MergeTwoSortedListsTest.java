package bkukuczka.algorithms.leetcode;

import bkukuczka.algorithms.commons.ListNode;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class MergeTwoSortedListsTest {
    @Test
    void shouldMergeSortedLists() {
        //given
        var node10 = new ListNode<>(10, null);
        var node9 = new ListNode<>(9, node10);
        var node8 = new ListNode<>(8, node9);
        var node7 = new ListNode<>(6, node8);
        var node6 = new ListNode<>(4, node7);
        var node5 = new ListNode<>(2, node6);

        var node4 = new ListNode<>(7, null);
        var node3 = new ListNode<>(5, node4);
        var node2 = new ListNode<>(3, node3);
        var node1 = new ListNode<>(1, node2);

        //when
        var resultNode = new MergeTwoSortedLists().merge(node1, node5);

        //then
        assertThat(resultNode.value).isEqualTo(1);
        assertThat(resultNode.next.value).isEqualTo(2);
        assertThat(resultNode.next.next.value).isEqualTo(3);
        assertThat(resultNode.next.next.next.value).isEqualTo(4);
        assertThat(resultNode.next.next.next.next.value).isEqualTo(5);
        assertThat(resultNode.next.next.next.next.next.value).isEqualTo(6);
        assertThat(resultNode.next.next.next.next.next.next.value).isEqualTo(7);
        assertThat(resultNode.next.next.next.next.next.next.next.value).isEqualTo(8);
        assertThat(resultNode.next.next.next.next.next.next.next.next.value).isEqualTo(9);
        assertThat(resultNode.next.next.next.next.next.next.next.next.next.value).isEqualTo(10);
    }

}