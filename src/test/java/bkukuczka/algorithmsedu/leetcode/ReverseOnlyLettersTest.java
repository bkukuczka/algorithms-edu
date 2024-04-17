package bkukuczka.algorithmsedu.leetcode;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

class ReverseOnlyLettersTest {
    public static Stream<Arguments> testData() {
        return Stream.of(
                Arguments.of("ab-cd", "dc-ba"),
                Arguments.of("a-bC-dEf-ghIj", "j-Ih-gfE-dCba")
        );
    }

    @ParameterizedTest
    @MethodSource("testData")
    void shouldReverseOnlyLetters(String input, String expectedOutput) {
        //when
        var result = new ReverseOnlyLetters().reverseOnlyLetters(input);

        //then
        assertThat(result).isEqualTo(expectedOutput);
    }

}