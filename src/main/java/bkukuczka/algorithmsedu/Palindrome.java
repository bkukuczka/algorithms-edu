package bkukuczka.algorithmsedu;

class Palindrome {

    boolean isStringPalindrome(String s) {
        return new StringBuilder(s).reverse().toString().equals(s);
    }

    boolean isPalindrome(ListNode<Integer> head) {
        ListNode<Integer> slow = head;
        ListNode<Integer> fast = head;

        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }

        slow = reversed(slow);
        fast = head;

        while (slow != null) {
            if (slow.value != fast.value) {
                return false;
            }
            slow = slow.next;
            fast = fast.next;
        }

        return true;
    }

    private ListNode<Integer> reversed(ListNode<Integer> head) {
        ListNode<Integer> prev = null;

        while (head != null) {
            ListNode<Integer> next = head.next;
            head.next = prev;
            prev = head;
            head = next;
        }

        return prev;
    }
}
