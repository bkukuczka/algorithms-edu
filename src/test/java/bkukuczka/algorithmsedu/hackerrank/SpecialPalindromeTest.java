package bkukuczka.algorithmsedu.hackerrank;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

class SpecialPalindromeTest {

    public static Stream<Arguments> specialPalindromeTestData() {
        return Stream.of(
                Arguments.of("abcbaba", 10),
                Arguments.of("aaaa", 10)
        );
    }

    @ParameterizedTest
    @MethodSource("specialPalindromeTestData")
    void isSpecialPalindrome(String input, int expectedResult) {
        //when
        long result = SpecialPalindrome.substrCount(input.length(), input);

        //then
        assertThat(result).isEqualTo(expectedResult);
    }

}