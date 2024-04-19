package bkukuczka.algorithmsedu.leetcode;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

class MinimumSizeSubarraySumTest {
    public static Stream<Arguments> testData() {
        return Stream.of(
                Arguments.of(7, new int[]{2, 3, 1, 2, 4, 3}, 2)
        );
    }

    @ParameterizedTest
    @MethodSource("testData")
    void findMinSubArrLen(int sum, int[] arr, int expectedResult) {
        //when
        int result = new MinimumSizeSubarraySum().minSubArrLen(sum, arr);

        //then
        assertThat(result).isEqualTo(expectedResult);
    }

}