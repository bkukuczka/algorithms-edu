package bkukuczka.algorithms;

import java.util.Arrays;

class MergeSort {
    int[] sort(int[] arr) {
        if (arr.length == 0 || arr.length == 1) {
            return arr;
        }

        int leftIndex = 0;
        int rightIndex = arr.length / 2;

        int[] leftArray = sort(Arrays.copyOfRange(arr, leftIndex, rightIndex));
        int[] rightArray = sort(Arrays.copyOfRange(arr, rightIndex, arr.length));

        return merge(leftArray, rightArray);
    }

    private int[] merge(int[] leftArray, int[] rightArray) {
        int leftIndex = 0;
        int rightIndex = 0;
        int[] mergeArray = new int[leftArray.length + rightArray.length];
        int mergeIndex = 0;

        while (leftIndex < leftArray.length && rightIndex < rightArray.length) {
            if (leftArray[leftIndex] > rightArray[rightIndex]) {
                mergeArray[mergeIndex] = rightArray[rightIndex];
                rightIndex++;
            } else {
                mergeArray[mergeIndex] = leftArray[leftIndex];
                leftIndex++;
            }

            mergeIndex++;
        }

        if (leftIndex < leftArray.length) {
            mergeArray[mergeIndex] = leftArray[leftIndex];
        }

        if (rightIndex < rightArray.length) {
            mergeArray[mergeIndex] = rightArray[rightIndex];
        }

        return mergeArray;
    }
}
