package bkukuczka.algorithmsedu;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class PalindromeTest {

    @Test
    void testIsPalindrome() {
        //given
        ListNode<Integer> node5 = new ListNode<>(null, 1);
        ListNode<Integer> node4 = new ListNode<>(node5, 2);
        ListNode<Integer> node3 = new ListNode<>(node4, 3);
        ListNode<Integer> node2 = new ListNode<>(node3, 3);
        ListNode<Integer> node1 = new ListNode<>(node2, 2);
        ListNode<Integer> head = new ListNode<>(node1, 1);

        Palindrome algo = new Palindrome();

        //when
        boolean result = algo.isPalindrome(head);

        //then
        assertThat(result).isTrue();
    }

    @Test
    void testIsPalindromeOddNumber() {
        //given
        ListNode<Integer> node4 = new ListNode<>(null, 1);
        ListNode<Integer> node3 = new ListNode<>(node4, 2);
        ListNode<Integer> node2 = new ListNode<>(node3, 3);
        ListNode<Integer> node1 = new ListNode<>(node2, 2);
        ListNode<Integer> head = new ListNode<>(node1, 1);

        Palindrome algo = new Palindrome();

        //when
        boolean result = algo.isPalindrome(head);

        //then
        assertThat(result).isTrue();
    }

    @Test
    void testIsNotPalindrome() {
        //given
        ListNode<Integer> node5 = new ListNode<>(null, 1);
        ListNode<Integer> node4 = new ListNode<>(node5, 2);
        ListNode<Integer> node3 = new ListNode<>(node4, 3);
        ListNode<Integer> node2 = new ListNode<>(node3, 2);
        ListNode<Integer> node1 = new ListNode<>(node2, 3);
        ListNode<Integer> head = new ListNode<>(node1, 1);

        Palindrome algo = new Palindrome();

        //when
        boolean result = algo.isPalindrome(head);

        //then
        assertThat(result).isFalse();
    }
}