package bkukuczka.algorithms.leetcode;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

class SingleNumberTest {
    public static Stream<Arguments> testData() {
        return Stream.of(
                Arguments.of(new int[]{1, 1, 2, 2, 3, 4, 3}, 4),
                Arguments.of(new int[]{1}, 1)
        );
    }

    @ParameterizedTest
    @MethodSource("testData")
    void shouldReturnOnlySingleNumber(int[] nums, int expectedNumber) {
        //when
        var result = new SingleNumber().single(nums);

        //then
        assertThat(result).isEqualTo(expectedNumber);
    }
}