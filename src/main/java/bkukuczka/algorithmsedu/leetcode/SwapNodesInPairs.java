package bkukuczka.algorithmsedu.leetcode;

import bkukuczka.algorithmsedu.commons.ListNode;

class SwapNodesInPairs {
    ListNode<Integer> swapPairs(ListNode<Integer> head) {
        var preHead = new ListNode<>(-1, head.next);
        var previous = new ListNode<>(-1, head);

        while (previous.next != null && previous.next.next != null) {
            var swapOne = previous.next;
            var swapTwo = swapOne.next;

            swapOne.next = swapTwo.next;
            previous.next = swapTwo;
            swapTwo.next = swapOne;

            previous = swapOne;
        }

        return preHead.next;
    }
}
