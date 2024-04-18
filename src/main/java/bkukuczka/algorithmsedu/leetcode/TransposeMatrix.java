package bkukuczka.algorithmsedu.leetcode;

class TransposeMatrix {
    int[][] transpose(int[][] arr) {
        int[][] output = new int[arr[0].length][arr.length];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                output[j][i] = arr[i][j];
            }
        }

        return output;
    }
}
