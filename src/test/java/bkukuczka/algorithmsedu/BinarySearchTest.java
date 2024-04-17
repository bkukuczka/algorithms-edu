package bkukuczka.algorithmsedu;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

class BinarySearchTest {
    public static Stream<Arguments> testData() {
        return Stream.of(
                Arguments.of(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9}, 5, 4),
                Arguments.of(new int[]{1, 2}, 2, 1)
        );
    }

    @ParameterizedTest
    @MethodSource("testData")
    void shouldFindIndexOfValue(int[] arr, int searchedValue, int expectedIndex) {
        //when
        int index = new BinarySearch().findValueIndex(arr, searchedValue);

        //then
        assertThat(index).isEqualTo(expectedIndex);
    }
}