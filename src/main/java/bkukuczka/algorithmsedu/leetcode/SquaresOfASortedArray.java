package bkukuczka.algorithmsedu.leetcode;

class SquaresOfASortedArray {
    int[] sortedSquares(int[] A) {

        var positivePointer = 0;

        while (positivePointer < A.length && A[positivePointer] < 0) {
            positivePointer++;
        }

        int negativePointer = positivePointer - 1;

        var sortedSquares = new int[A.length];
        var sortedSquaresIndex = 0;

        while (negativePointer >= 0 && positivePointer < A.length) {
            if (A[negativePointer] * A[negativePointer] < A[positivePointer] * A[positivePointer]) {
                sortedSquares[sortedSquaresIndex] = A[negativePointer] * A[negativePointer];
                negativePointer--;
            } else {
                sortedSquares[sortedSquaresIndex] = A[positivePointer] * A[positivePointer];
                positivePointer++;
            }

            sortedSquaresIndex++;
        }

        while (negativePointer >= 0) {
            sortedSquares[sortedSquaresIndex] = A[negativePointer] * A[negativePointer];
            negativePointer--;
        }

        while (positivePointer < A.length) {
            sortedSquares[sortedSquaresIndex] = A[positivePointer] * A[positivePointer];
            positivePointer++;
        }

        return sortedSquares;
    }

}
