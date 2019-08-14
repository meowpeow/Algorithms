package algorithms.searches;

/**
 * Binary search is more effective way of search in comparison to linear search, where program just iterate through ALL elements.
 * Instead, binary search can find element in sorted array in less amount of cycles, by using MIDDLE of the list.
 * 1.      So to get it to work you need to assign to variables BEGIN of the list and END of it.
 * 2.      Program now will find a middle of that list, and compare that MID variable to element we are searching for.
 * 3.1.    If MID is BIGGER THAN X, than X is between BEGIN and MID
 * 3.2.    Else if MID is LESS THAN X, than X is between MID and LAST
 * 3.3     Repeat till mid == X
 */
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
