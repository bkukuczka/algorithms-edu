package bkukuczka.algorithmsedu.leetcode;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

class IsIntegerAPalindromeTest {
    public static Stream<Arguments> isPalindromeTestData() {
        return Stream.of(
                Arguments.of(0, true),
                Arguments.of(123454321, true),
                Arguments.of(11, true),
                Arguments.of(121, true),
                Arguments.of(-1, false),
                Arguments.of(12, false),
                Arguments.of(1212, false)
        );
    }

    @ParameterizedTest
    @MethodSource("isPalindromeTestData")
    void isIntegerAPalindrome(int value, boolean expectedResult) {
        //when
        var result = new IsIntegerAPalindrome().isPalindrome(value);

        //then
        Assertions.assertThat(result).isEqualTo(expectedResult);
    }
}