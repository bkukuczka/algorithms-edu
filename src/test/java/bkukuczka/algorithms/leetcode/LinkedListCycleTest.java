package bkukuczka.algorithms.leetcode;

import bkukuczka.algorithms.commons.ListNode;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class LinkedListCycleTest {

    @Test
    void hasCycle() {
        //given
        var node5 = new ListNode<>(1, null);
        var node4 = new ListNode<>(1, node5);
        var node3 = new ListNode<>(1, node4);
        var node2 = new ListNode<>(1, node3);
        var node1 = new ListNode<>(1, node2);
        node5.next = node2; //cycle

        //when
        var result = new LinkedListCycle().hasCycle(node1);

        //then
        assertThat(result).isTrue();
    }

    @Test
    void doesNotHaveCycle() {
        //given
        var node5 = new ListNode<>(1, null);
        var node4 = new ListNode<>(1, node5);
        var node3 = new ListNode<>(1, node4);
        var node2 = new ListNode<>(1, node3);
        var node1 = new ListNode<>(1, node2);

        //when
        var result = new LinkedListCycle().hasCycle(node1);

        //then
        assertThat(result).isFalse();
    }
}