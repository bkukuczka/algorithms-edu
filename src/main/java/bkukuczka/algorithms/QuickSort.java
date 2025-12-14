package bkukuczka.algorithms;

class QuickSort {
    int[] sort(int[] arr) {
        quicksort(arr, 0, arr.length - 1);
        return arr;
    }

    private void quicksort(int[] arr, int lowIndex, int highIndex) {
        if (lowIndex >= highIndex) {
            return;
        }

        int pivot = arr[highIndex];

        int leftPointer = lowIndex;
        int rightPointer = highIndex;

        while (leftPointer < rightPointer) {

            while (arr[leftPointer] <= pivot && leftPointer < rightPointer) {
                leftPointer++;
            }

            while (arr[rightPointer] >= pivot && leftPointer < rightPointer) {
                rightPointer--;
            }

            swap(arr, leftPointer, rightPointer);
        }

        swap(arr, leftPointer, highIndex);

        quicksort(arr, lowIndex, leftPointer - 1);
        quicksort(arr, leftPointer + 1, highIndex);
    }

    private void swap(int[] arr, int one, int two) {
        int temp = arr[one];
        arr[one] = arr[two];
        arr[two] = temp;
    }
}
