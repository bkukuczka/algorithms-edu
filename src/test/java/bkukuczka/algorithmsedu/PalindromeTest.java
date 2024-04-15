package bkukuczka.algorithmsedu;

import bkukuczka.algorithmsedu.commons.ListNode;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

class PalindromeTest {

    public static Stream<Arguments> stringPalindromeTestData() {
        return Stream.of(
                Arguments.of("aabaa", true),
                Arguments.of("a", true),
                Arguments.of("aa", true),
                Arguments.of("abc", false)
        );
    }

    @ParameterizedTest
    @MethodSource("stringPalindromeTestData")
    void isStringPalindrome(String input, boolean expectedResult) {
        //given
        Palindrome algo = new Palindrome();

        //when
        boolean result = algo.isStringPalindrome(input);

        //then
        assertThat(result).isEqualTo(expectedResult);
    }

    @Test
    void testIsPalindrome() {
        //given
        ListNode<Integer> node5 = new ListNode<>(1, null);
        ListNode<Integer> node4 = new ListNode<>(2, node5);
        ListNode<Integer> node3 = new ListNode<>(3, node4);
        ListNode<Integer> node2 = new ListNode<>(3, node3);
        ListNode<Integer> node1 = new ListNode<>(2, node2);
        ListNode<Integer> head = new ListNode<>(1, node1);

        Palindrome algo = new Palindrome();

        //when
        boolean result = algo.isPalindrome(head);

        //then
        assertThat(result).isTrue();
    }

    @Test
    void testIsPalindromeOddNumber() {
        //given
        ListNode<Integer> node4 = new ListNode<>(1, null);
        ListNode<Integer> node3 = new ListNode<>(2, node4);
        ListNode<Integer> node2 = new ListNode<>(3, node3);
        ListNode<Integer> node1 = new ListNode<>(2, node2);
        ListNode<Integer> head = new ListNode<>(1, node1);

        Palindrome algo = new Palindrome();

        //when
        boolean result = algo.isPalindrome(head);

        //then
        assertThat(result).isTrue();
    }

    @Test
    void testIsNotPalindrome() {
        //given
        ListNode<Integer> node5 = new ListNode<>(1, null);
        ListNode<Integer> node4 = new ListNode<>(2, node5);
        ListNode<Integer> node3 = new ListNode<>(3, node4);
        ListNode<Integer> node2 = new ListNode<>(2, node3);
        ListNode<Integer> node1 = new ListNode<>(3, node2);
        ListNode<Integer> head = new ListNode<>(1, node1);

        Palindrome algo = new Palindrome();

        //when
        boolean result = algo.isPalindrome(head);

        //then
        assertThat(result).isFalse();
    }
}