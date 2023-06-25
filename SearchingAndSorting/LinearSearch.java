import java.util.Scanner;

public class LinearSearch {
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
        int idex = -1;
        for (int i = 0; i < size; i++) {
            if(arr[i] == target){
                idex = i;
                break;
            }
        }
        if(idex != -1)
            System.out.println("Element found at location : " + idex);
        else
            System.out.println("Element does not found!!!");
    }
}
