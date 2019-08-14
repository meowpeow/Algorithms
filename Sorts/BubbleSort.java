package algorithms.sorting;

/**
 * Bubble Sort is a simple sorting algorithm based on:
 * 1.   repeated iteration through list,
 * 2.   compares adjactent pairs
 * 3.   swaps them if they are in the wrong order.
 */

public class BubbleSort {

    static int[] bubbleSort(int[] arr) {

        for (
                int i = 0;
                i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {      // A) iterating through list

                if (arr[i] > arr[j]) {                      // B) comparing pairs (i and i + 1)
                    int swap = arr[j];                      // C) swapping them if they are in the wrong order.
                    arr[j] = arr[i];
                    arr[i] = swap;
                }
            }
        }
        return arr;
    }

    public static void main(String[] args) {

        int[] array = {1, 6, 8, 4, 2, 9, 1,};

        bubbleSort(array);
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
