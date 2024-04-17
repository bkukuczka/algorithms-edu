package bkukuczka.algorithmsedu.leetcode;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SumOfEvenNumbersAfterQueriesTest {
    @Test
    void sum() {
        //given
        int[] numbers = new int[]{1, 2, 3, 4};
        int[][] queries = new int[][]{new int[]{1, 0}, new int[]{-3, 1}, new int[]{-4, 0}, new int[]{2, 3}};

        //when
        int[] result = new SumOfEvenNumbersAfterQueries().sumEvenNumbersAfterQueries(numbers, queries);

        //then
        assertThat(result).isEqualTo(new int[]{8, 6, 2, 4});
    }

}