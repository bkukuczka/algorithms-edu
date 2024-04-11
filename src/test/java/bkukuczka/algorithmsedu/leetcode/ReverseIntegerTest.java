package bkukuczka.algorithmsedu.leetcode;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

class ReverseIntegerTest {
    public static Stream<Arguments> reverseIntTestData() {
        return Stream.of(
                Arguments.of(0, 0),
                Arguments.of(123, 321),
                Arguments.of(-123, -321),
                Arguments.of(190, 91),
                Arguments.of(2147483647, 0),
                Arguments.of(-2147483648, 0)
        );
    }

    @ParameterizedTest
    @MethodSource("reverseIntTestData")
    void shouldReverseInt(int input, int expectedResult) {
        //when
        int result = new ReverseInteger().reverse(input);

        //then
        assertThat(result).isEqualTo(expectedResult);
    }

}