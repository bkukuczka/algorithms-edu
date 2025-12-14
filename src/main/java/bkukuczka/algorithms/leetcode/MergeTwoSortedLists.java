package bkukuczka.algorithms.leetcode;

import bkukuczka.algorithms.commons.ListNode;

class MergeTwoSortedLists {
    ListNode<Integer> merge(ListNode<Integer> headOne, ListNode<Integer> headTwo) {
        var resultHead = new ListNode<>(-1, null);
        var current = resultHead;

        while (headOne != null || headTwo != null) {

            if (headOne != null && headTwo == null) {
                current.next = headOne;
                break;
            }

            if (headTwo != null && headOne == null) {
                current.next = headTwo;
                break;
            }

            if (headOne.value <= headTwo.value) {
                current.next = headOne;
                current = current.next;
                headOne = headOne.next;
            } else {
                current.next = headTwo;
                current = current.next;
                headTwo = headTwo.next;
            }
        }

        return resultHead.next;
    }
}
