package bkukuczka.algorithms.leetcode;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

class BinarySearchTest {

    public static Stream<Arguments> binarySearchTestData() {
        return Stream.of(
                Arguments.of(new int[]{}, 5, -1),
                Arguments.of(new int[]{1, 2, 3, 4}, 5, -1),
                Arguments.of(new int[]{1, 2, 3, 4, 5}, 3, 2),
                Arguments.of(new int[]{1, 2, 3, 4, 5, 6, 7, 8}, 8, 7),
                Arguments.of(new int[]{1, 2, 3, 4, 5, 6, 7, 8}, 1, 0)
        );
    }

    @ParameterizedTest
    @MethodSource("binarySearchTestData")
    void binarySearch(int[] numbers, int target, int expectedResult) {
        //when
        int result = new BinarySearch().search(numbers, target);

        //then
        assertThat(result).isEqualTo(expectedResult);
    }
}