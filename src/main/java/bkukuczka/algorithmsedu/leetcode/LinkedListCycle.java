package bkukuczka.algorithmsedu.leetcode;

import bkukuczka.algorithmsedu.commons.ListNode;

class LinkedListCycle {
//    boolean hasCycle(ListNode<Integer> node) {
//        if (node == null) {
//            return false;
//        }
//
//        var nodes = new HashSet<>();
//        int nodeCount = 0;
//
//        while (node.next != null) {
//            if (nodeCount != nodes.size()) {
//                return true;
//            }
//
//            nodeCount++;
//            nodes.add(node);
//
//            node = node.next;
//        }
//
//        return false;
//    }

    //pointers
    boolean hasCycle(ListNode<Integer> node) {
        if (node == null) {
            return false;
        }

        var slow = node;
        var fast = node.next;

        while (slow != fast) {
            if (fast == null || slow == null) {
                return false;
            }

            slow = slow.next;
            fast = fast.next.next;
        }

        return true;
    }
}
