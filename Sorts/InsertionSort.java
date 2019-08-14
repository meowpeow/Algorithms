package algorithms.sorting;

/**
 * Insertion sort is a simple sorting algorithm that works the way we sort playing cards in our hands.
 * Best case runtime is O(n)
 * Worst case runtime is O(n^2)
 * A. assign 2 variables for values: arr[i] and arr[i - 1]
 * B. iterate through list till met not sorted element
 * C. while arr[i] < arr[i-1] do next:
 * - swap i with i-1
 * - swap i with i (magic)
 * D. repeat if necessary
 */
 
public class InsertionSort {

    static int[] insertionSort(int arr[], int n) {

        for (int i = 1; i < arr.length; i++) {
            int j = i - 1;

            int key = arr[i];

            while (j >= 0 && key < arr[j]) {
                arr[j + 1] = arr[j];
                j--;

            }
            arr[j + 1] = key;
        }
        return arr;
    }

    public static void main(String[] args) {

        int[] arr1 = {1, 2, 3, 4, 5, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 1, 1, 1, 1, 1};
        for (int element : arr1) {
            System.out.print(element);
        }
        InsertionSort.insertionSort(arr1, 1);
        System.out.println();
        for (int element : arr1) {
            System.out.print(element + " ");
        }
    }
}
