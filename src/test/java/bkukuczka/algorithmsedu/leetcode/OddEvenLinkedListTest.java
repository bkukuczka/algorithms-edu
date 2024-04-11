package bkukuczka.algorithmsedu.leetcode;

import bkukuczka.algorithmsedu.commons.ListNode;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class OddEvenLinkedListTest {

    @Test
    void shouldReturnOdd() {
        //given
        var node7 = new ListNode<>(13, null);
        var node6 = new ListNode<>(11, node7);
        var node5 = new ListNode<>(9, node6);
        var node4 = new ListNode<>(7, node5);
        var node3 = new ListNode<>(5, node4);
        var node2 = new ListNode<>(3, node3);
        var node1 = new ListNode<>(1, node2);

        //when
        var result = new OddEvenLinkedList().oddEvenList(node1);

        //then
        assertThat(result.value).isEqualTo(1);
        assertThat(result.next.value).isEqualTo(5);
        assertThat(result.next.next.value).isEqualTo(9);
        assertThat(result.next.next.next.value).isEqualTo(13);
        assertThat(result.next.next.next.next.value).isEqualTo(3);
        assertThat(result.next.next.next.next.next.value).isEqualTo(7);
        assertThat(result.next.next.next.next.next.next.value).isEqualTo(11);
    }
}