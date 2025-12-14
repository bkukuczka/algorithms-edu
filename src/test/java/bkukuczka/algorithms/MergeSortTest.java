package bkukuczka.algorithms;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class MergeSortTest {
    @Test
    void mergeSortArray() {
        //given
        var input = new int[]{5, 1, 7, 3, 6, 2, 8, 4};

        //when
        int[] result = new MergeSort().sort(input);

        //then
        assertThat(result).isEqualTo(new int[]{1, 2, 3, 4, 5, 6, 7, 8});
    }
}