package bkukuczka.algorithms.leetcode;

import bkukuczka.algorithms.commons.ListNode;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class MiddleOfTheLinkedListTest {
    @Test
    void shouldReturnMiddleNode() {
        //given
        var node7 = new ListNode<>(7, null);
        var node6 = new ListNode<>(6, node7);
        var node5 = new ListNode<>(5, node6);
        var node4 = new ListNode<>(4, node5);
        var node3 = new ListNode<>(3, node4);
        var node2 = new ListNode<>(2, node3);
        var node1 = new ListNode<>(1, node2);

        //when
        var resultNode = new MiddleOfTheLinkedList().middleNode(node1);

        //then
        assertThat(resultNode.value).isEqualTo(4);
    }
}