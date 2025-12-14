package bkukuczka.algorithms.leetcode;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

class IsPalindromeTest {
    public static Stream<Arguments> isPalindromeTestData() {
        return Stream.of(
                Arguments.of("A man, a plan, a canal: Panama", true),
                Arguments.of("racecar", true),
                Arguments.of("race a car", false)
        );
    }

    @ParameterizedTest
    @MethodSource("isPalindromeTestData")
    void isStringAPalindrome(String s, boolean expectedResult) {
        //when
        var result = new IsPalindrome().isPalindrome(s);

        //then
        assertThat(result).isEqualTo(expectedResult);
    }

}