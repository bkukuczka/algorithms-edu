package bkukuczka.algorithms.leetcode;

import bkukuczka.algorithms.commons.ListNode;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class PartitionListTest {
    @Test
    void shouldPartitionList() {
        //given
        var node6 = new ListNode<>(2, null);
        var node5 = new ListNode<>(5, node6);
        var node4 = new ListNode<>(2, node5);
        var node3 = new ListNode<>(3, node4);
        var node2 = new ListNode<>(4, node3);
        var node1 = new ListNode<>(1, node2);

        //when
        var resultNode = new PartitionList().partition(node1, 3);

        //then
        assertThat(resultNode.value).isEqualTo(1);
        assertThat(resultNode.next.value).isEqualTo(2);
        assertThat(resultNode.next.next.value).isEqualTo(2);
        assertThat(resultNode.next.next.next.value).isEqualTo(4);
        assertThat(resultNode.next.next.next.next.value).isEqualTo(3);
        assertThat(resultNode.next.next.next.next.next.value).isEqualTo(5);
        assertThat(resultNode.next.next.next.next.next.next).isNull();
    }
}