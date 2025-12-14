package bkukuczka.algorithms.numerical;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

class PrimeNumbersTest {

    public static Stream<Arguments> testData() {
        return Stream.of(
                Arguments.of(1, List.of()),
                Arguments.of(2, List.of(2)),
                Arguments.of(3, List.of(2, 3)),
                Arguments.of(100, List.of(2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97))
        );
    }

    @ParameterizedTest
    @MethodSource("testData")
    void shouldFindPrimeFactorsForNumber(int max, List<Integer> expectedPrimes) {
        //when
        var result = new PrimeNumbers().findPrimesUpTo(max);

        //then
        Assertions.assertThat(result).isEqualTo(expectedPrimes);
    }
}