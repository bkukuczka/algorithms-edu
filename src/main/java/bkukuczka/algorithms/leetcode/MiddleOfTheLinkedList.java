package bkukuczka.algorithms.leetcode;

import bkukuczka.algorithms.commons.ListNode;

class MiddleOfTheLinkedList {
    ListNode<Integer> middleNode(ListNode<Integer> head) {
        var slow = head;
        var fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }
}
