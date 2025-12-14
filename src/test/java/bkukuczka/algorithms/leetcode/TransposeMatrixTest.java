package bkukuczka.algorithms.leetcode;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class TransposeMatrixTest {
    @Test
    void transposeMatrix() {
        //given
        int[][] input = new int[][]{
                new int[]{1, 2, 3},
                new int[]{4, 5, 6},
                new int[]{7, 8, 9}
        };

        int[][] expectedResult = new int[][]{
                new int[]{1, 4, 7,},
                new int[]{2, 5, 8,},
                new int[]{3, 6, 9}
        };

        //when
        int[][] result = new TransposeMatrix().transpose(input);

        //then
        assertThat(result).isEqualTo(expectedResult);
    }
}