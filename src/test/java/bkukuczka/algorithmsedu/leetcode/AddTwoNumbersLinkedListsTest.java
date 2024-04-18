package bkukuczka.algorithmsedu.leetcode;

import bkukuczka.algorithmsedu.commons.ListNode;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class AddTwoNumbersLinkedListsTest {
    @Test
    void shouldAddTwoNumbersStoredInLinkedLists() {
        //given
        var node2 = new ListNode<>(8, null);
        var node1 = new ListNode<>(4, node2);
        ListNode<Integer> headOne = new ListNode<>(3, node1);

        var node4 = new ListNode<>(7, null);
        var node3 = new ListNode<>(6, node4);
        ListNode<Integer> headTwo = new ListNode<>(4, node3);

        //when
        var resultHead = new AddTwoNumbersLinkedLists().add(headOne, headTwo);

        //then
        assertThat(resultHead.value).isEqualTo(7);
        assertThat(resultHead.next.value).isEqualTo(0);
        assertThat(resultHead.next.next.value).isEqualTo(6);
        assertThat(resultHead.next.next.next.value).isEqualTo(1);
    }
}