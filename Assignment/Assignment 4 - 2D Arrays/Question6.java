import java.util.*;

public class Question6 {

    public static int[] squareAndSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i]*arr[i];
        }
        Arrays.sort(arr);
        return arr;
    }

    public static void main(String[] args) {
        int arr[] = {-4,-1,0,3,10};
        arr = squareAndSort(arr);
        for (int i : arr) System.out.print(i+" ");
    }
}