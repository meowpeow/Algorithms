package algorithms.search;

public class BinarySearch {

    static void binarySearch(int arr[], int x) {

        int begin = arr[0];
        int last = arr[arr.length - 1];
        int mid = 0;

        while (x != mid) {
            mid = begin + (last - begin) / 2;
            if (x < mid) {
                last = mid - 1;
            } else if (x > mid) {
                begin = mid + 1;
            } else if (x == mid) {
                System.out.println("Element " + x + " is present in array. An array length: " + arr.length);

            }
        }
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        binarySearch(arr1, 6);
    }
}
