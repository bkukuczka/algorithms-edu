package bkukuczka.algorithmsedu;

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