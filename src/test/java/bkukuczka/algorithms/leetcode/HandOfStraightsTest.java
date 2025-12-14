package bkukuczka.algorithms.leetcode;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

class HandOfStraightsTest {
    public static Stream<Arguments> testData() {
        return Stream.of(
                Arguments.of(new int[]{1, 2, 3, 6, 2, 3, 4, 7, 8}, 3, true),
                Arguments.of(new int[]{1, 2, 3, 4, 5}, 4, false),
                Arguments.of(new int[]{1, 2, 3, 4, 5, 7}, 3, false),
                Arguments.of(new int[]{1, 1, 2, 3, 3, 2, 4, 4}, 4, true),
                Arguments.of(new int[]{2, 3, 4, 5, 6, 1}, 3, true)
        );
    }

    @ParameterizedTest
    @MethodSource("testData")
    void isNStraightHand(int[] hand, int W, boolean expectedResult) {
        //when
        var result = new HandOfStraights().isNStraightHand(hand, W);

        //then
        assertThat(result).isEqualTo(expectedResult);
    }

}