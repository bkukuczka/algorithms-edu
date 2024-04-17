package bkukuczka.algorithmsedu.leetcode;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThat;

class SelfDividingNumbersTest {
    @Test
    void shouldReturnSelfDividingNumbers() {
        //given
        int left = 1;
        int right = 22;

        //when
        var result = new SelfDividingNumbers().findNumbers(left, right);

        //then
        assertThat(result).isEqualTo(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 11, 12, 15, 22));
    }
}