package bkukuczka.algorithmsedu.leetcode;

import bkukuczka.algorithmsedu.commons.ListNode;

class SortLinkedList {
    ListNode<Integer> sort(ListNode<Integer> head) {
        if (head == null || head.next == null) {
            return head;
        }

        var fast = head;
        var slow = head;
        var temp = head;

        while (fast != null && fast.next != null) {
            temp = slow;
            fast = fast.next.next;
            slow = slow.next;
        }

        temp.next = null;   //avoid loop - null out the end of left sublist

        var leftSide = sort(head);
        var rightSide = sort(slow);

        return merge(leftSide, rightSide);
    }

    private ListNode<Integer> merge(ListNode<Integer> leftSide, ListNode<Integer> rightSide) {
        var temp = new ListNode<>(0, null);
        var current = temp;

        while (leftSide != null && rightSide != null) {
            if (leftSide.value > rightSide.value) {
                current.next = rightSide;
                rightSide = rightSide.next;
            } else {
                current.next = leftSide;
                leftSide = leftSide.next;
            }

            current = current.next;
        }

        if (leftSide != null) {
            current.next = leftSide;
        }

        if (rightSide != null) {
            current.next = rightSide;
        }

        return temp.next;
    }
}
