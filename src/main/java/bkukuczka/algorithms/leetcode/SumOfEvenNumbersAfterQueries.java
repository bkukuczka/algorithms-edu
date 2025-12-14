package bkukuczka.algorithms.leetcode;

class SumOfEvenNumbersAfterQueries {
    int[] sumEvenNumbersAfterQueries(int[] A, int[][] queries) {
        int[] result = new int[queries.length];
        int counter = 0;

        for (int[] query : queries) {
            A[query[1]] += query[0];

            int sumOfEven = 0;

            for (int num : A) {
                if (num % 2 == 0) {
                    sumOfEven += num;
                }
            }

            result[counter++] = sumOfEven;
        }

        return result;
    }
}
