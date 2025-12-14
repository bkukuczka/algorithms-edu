package bkukuczka.algorithms.sort;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

class QuickSortTest {
    public static Stream<Arguments> testData() {
        return Stream.of(
                Arguments.of(new int[]{}, new int[]{}),
                Arguments.of(new int[]{6, 3, 9, 7, 2, 8, 1, 4, 5,}, new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9})
        );
    }

    @ParameterizedTest
    @MethodSource("testData")
    void shouldSort(int[] arr, int[] expectedArr) {
        //when
        int[] result = new QuickSort().sort(arr);

        //then
        assertThat(result).isEqualTo(expectedArr);
    }

}