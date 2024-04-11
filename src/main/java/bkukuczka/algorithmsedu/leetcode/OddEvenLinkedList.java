package bkukuczka.algorithmsedu.leetcode;

import bkukuczka.algorithmsedu.commons.ListNode;

class OddEvenLinkedList {
    ListNode<Integer> oddEvenList(ListNode<Integer> head) {
        var odd = head;
        var even = head.next;
        var evenHead = even;

        while (odd.next != null) {
            odd.next = odd.next.next;
            odd = odd.next;
            even.next = even.next.next;
            even = even.next;
        }

        odd.next = evenHead;

        return head;
    }
}
