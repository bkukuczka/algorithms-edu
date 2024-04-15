package bkukuczka.algorithmsedu.leetcode;

import bkukuczka.algorithmsedu.commons.ListNode;

class PartitionList {
    ListNode<Integer> partition(ListNode<Integer> head, int number) {
        ListNode<Integer> preLessHead = new ListNode<>(-1, null);
        var lessTemp = preLessHead;
        ListNode<Integer> preMoreOrEqualHead = new ListNode<>(-1, null);
        var moreOrEqualTemp = preMoreOrEqualHead;

        while (head != null) {
            if (head.value < number) {
                lessTemp.next = head;
                lessTemp = lessTemp.next;
            } else {
                moreOrEqualTemp.next = head;
                moreOrEqualTemp = moreOrEqualTemp.next;
            }

            head = head.next;
        }

        moreOrEqualTemp.next = null;
        lessTemp.next = preMoreOrEqualHead.next;

        return preLessHead.next;
    }
}
