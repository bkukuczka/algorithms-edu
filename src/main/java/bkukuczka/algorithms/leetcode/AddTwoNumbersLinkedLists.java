package bkukuczka.algorithms.leetcode;

import bkukuczka.algorithms.commons.ListNode;

class AddTwoNumbersLinkedLists {
    ListNode<Integer> add(ListNode<Integer> headOne, ListNode<Integer> headTwo) {
        var resultHead = new ListNode<>(0, null);
        var current = resultHead;

        int decimalNumber = 0;

        while (headOne != null && headTwo != null) {
            int sum = headOne.value + headTwo.value + decimalNumber;
            decimalNumber = sum / 10;
            int remainder = sum % 10;

            current.next = new ListNode<>(remainder, null);
            current = current.next;
            headOne = headOne.next;
            headTwo = headTwo.next;
        }

        if (decimalNumber > 0) {
            current.next = new ListNode<>(decimalNumber, null);
        }

        return resultHead.next;
    }
}
