import java.util.Scanner;

public class LowerBound {
    public static int lowerBound(int arr[] , int target){
        int start = 0;
        int end = arr.length - 1;
        int result = -1;
        while(start <= end){
            int mid = (start+end)/2;
            if(arr[mid] == target){
                result = mid;
                end = mid - 1;
            }
            else if (arr[mid] > target) {
                end = mid - 1;
            }
            else{
                start = mid + 1;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of element in the array : ");
        int size = Integer.parseInt(sc.next());
        int arr[] = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.print("Enter Element " + (i+1) + " : ");
            arr[i] = Integer.parseInt(sc.next());
        }
        System.out.print("Enter the target value : ");
        int target = Integer.parseInt(sc.next());

        int result = lowerBound(arr , target);

        if(result == -1)
            System.out.println("Element is not found!!!");
        else
            System.out.println("Element's first occurance is found at location : " + result);
    }
}
