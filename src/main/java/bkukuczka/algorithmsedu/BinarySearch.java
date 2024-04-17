package bkukuczka.algorithmsedu;

class BinarySearch {
    int findValueIndex(int[] arr, int value) {
        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            int midpoint = left + (right - left) / 2;

            if (arr[midpoint] < value) {
                left = midpoint + 1;
            } else {
                right = midpoint;
            }
        }

        return left;
    }
}
