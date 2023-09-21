package BitManipulation;

import java.util.Scanner;

public class KernighanAlgorithm {
    public static void main(String[] args) {
        int n = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        n = sc.nextInt();
        int count = 0;
        while (n != 0) {
            int rmsb = n & -n;
            n = n - rmsb;
            count++;
        }
        System.out.println(count);
    
    }
}