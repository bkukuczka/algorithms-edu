package bkukuczka.algorithms.leetcode;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

class BackspaceCompareTest {
    public static Stream<Arguments> compareBackspaceStrings() {
        return Stream.of(
                Arguments.of("ab#c", "ad#c", true),
                Arguments.of("ab##", "c#d#", true),
                Arguments.of("a##c", "#a#c", true),
                Arguments.of("a#c", "b", false)
        );
    }

    @ParameterizedTest
    @MethodSource
    void compareBackspaceStrings(String s1, String s2, boolean expectedResult) {
        //when
        var result = new BackspaceCompare().backspaceCompare(s1, s2);

        //then
        assertThat(result).isEqualTo(expectedResult);
    }

}