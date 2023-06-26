/**
 * BinarySearchUsingRecurtion
 */
public class BinarySearchUsingRecurtion {

    public static int binarySearch(int[] arr, int low, int high, int target) {
        if (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] == target)
                return mid;
            else if (target < arr[mid])
               return binarySearch(arr, low, mid - 1, target);
            else
               return binarySearch(arr, mid + 1, high, target);
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6 };

        int result = binarySearch(arr, 0, arr.length - 1, 40);

        if (result == -1)
            System.out.println("Element is not found!!!");
        else
            System.out.println("Element is found at location : " + result);
    }
}