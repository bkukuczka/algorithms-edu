package bkukuczka.algorithmsedu.leetcode;

import bkukuczka.algorithmsedu.commons.ListNode;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SwapNodesInPairsTest {
    @Test
    void swapNodes() {
        //given
        var node7 = new ListNode<>(7, null);
        var node6 = new ListNode<>(6, node7);
        var node5 = new ListNode<>(5, node6);
        var node4 = new ListNode<>(4, node5);
        var node3 = new ListNode<>(3, node4);
        var node2 = new ListNode<>(2, node3);
        var node1 = new ListNode<>(1, node2);

        //when
        var head = new SwapNodesInPairs().swapPairs(node1);

        //then
        assertThat(head.value).isEqualTo(2);
        assertThat(head.next.value).isEqualTo(1);
        assertThat(head.next.next.value).isEqualTo(4);
        assertThat(head.next.next.next.value).isEqualTo(3);
        assertThat(head.next.next.next.next.value).isEqualTo(6);
        assertThat(head.next.next.next.next.next.value).isEqualTo(5);
        assertThat(head.next.next.next.next.next.next.value).isEqualTo(7);
    }

}