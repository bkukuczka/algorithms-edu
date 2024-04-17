package bkukuczka.algorithmsedu.leetcode;

import bkukuczka.algorithmsedu.commons.ListNode;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SortLinkedListTest {
    @Test
    void shouldSortLinkedList() {
        //given
        var node7 = new ListNode<>(3, null);
        var node6 = new ListNode<>(9, node7);
        var node5 = new ListNode<>(1, node6);
        var node4 = new ListNode<>(10, node5);
        var node3 = new ListNode<>(4, node4);
        var node2 = new ListNode<>(5, node3);
        var node1 = new ListNode<>(2, node2);

        //when
        var result = new SortLinkedList().sort(node1);

        //then
        assertThat(result.value).isEqualTo(1);
        assertThat(result.next.value).isEqualTo(2);
        assertThat(result.next.next.value).isEqualTo(3);
        assertThat(result.next.next.next.value).isEqualTo(4);
        assertThat(result.next.next.next.next.value).isEqualTo(5);
        assertThat(result.next.next.next.next.next.value).isEqualTo(9);
        assertThat(result.next.next.next.next.next.next.value).isEqualTo(10);
    }

}