package bkukuczka.algorithms.numerical;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

class PrimeFactorizationTest {

    public static Stream<Arguments> testData() {
        return Stream.of(
                Arguments.of(204, List.of(2, 2, 3, 17)),
                Arguments.of(336, List.of(2, 2, 2, 2, 3, 7)),
                Arguments.of(120, List.of(2, 2, 2, 3, 5))
        );
    }

    @ParameterizedTest
    @MethodSource("testData")
    void shouldFindPrimeFactorsForNumber(int number, List<Integer> expectedFactors) {
        //when
        var result = new PrimeFactorization().findFactorsFor(number);

        //then
        Assertions.assertThat(result).isEqualTo(expectedFactors);
    }
}