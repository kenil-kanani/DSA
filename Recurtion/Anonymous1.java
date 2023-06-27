package Recurtion;

/**
 * Anonymous1
 */
public class Anonymous1 {

    public static void sum(int n , int k){
        if(k == 1) {System.out.println(n); return;}
        sum(n, k-1);
        System.out.println(n*k);
    }

    public static void main(String[] args) {
        sum(10,4);
    }
}