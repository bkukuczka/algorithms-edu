package bkukuczka.algorithms.leetcode;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

class RobotReturnToOriginTest {
    public static Stream<Arguments> robotMovesTestData() {
        return Stream.of(
                Arguments.of("UD", true),
                Arguments.of("UDR", false),
                Arguments.of("LLDDURUR", true)
        );
    }

    @ParameterizedTest
    @MethodSource("robotMovesTestData")
    void checkIfRobotCircledBack(String moves, boolean expectedResult) {
        //when
        var result = new RobotReturnToOrigin().judgeCircle(moves);

        //then
        assertThat(result).isEqualTo(expectedResult);
    }
}