package bkukuczka.algorithmsedu.hackerrank;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

import static java.util.Arrays.asList;
import static org.assertj.core.api.Assertions.assertThat;

class PoisonousPlantsTest {
    public static Stream<Arguments> testData() {
        return Stream.of(
                Arguments.of(asList(6, 5, 8, 4, 7, 10, 9), 2),
                Arguments.of(asList(3, 2, 5, 4), 2),
                Arguments.of(asList(4, 3, 7, 5, 6, 4, 2), 3)
        );
    }

    @ParameterizedTest
    @MethodSource("testData")
    void shouldReturnDaysCOunt(List<Integer> input, int expectedResult) {
        //when
        int result = new PoisonousPlants().poisonousPlants(new ArrayList<>(input));

        //then
        assertThat(result).isEqualTo(expectedResult);
    }
}