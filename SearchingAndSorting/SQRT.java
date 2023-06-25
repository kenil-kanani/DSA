import java.util.Scanner;

public class SQRT {
    public static int sqrt(int num){
        int start = 0 ;
        int end = num;
        int result = -1;

        while(start <= end){
            int mid = (start+end)/2;
            if(mid*mid == num)
                return mid;
            else if(mid*mid <= num){
                result = mid;  // store the value of flore
                start = mid+1;
            }
            else if(mid*mid > num){
                end = mid-1;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value : ");
        int num = Integer.parseInt(sc.next());

        int result = sqrt(num);

        System.out.println("Ans : " + result);
    }
}
