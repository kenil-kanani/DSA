package Recurtion;

//->     1 - 2 + 3 - 4 + 5 - 6 + ... n
public class AlternateSignSeriesSum {

    public static int sum (int n){
        if(n == 0) return 0;
        else{
            if(n%2 == 0) return sum(n-1) - n;
            else return sum(n-1) + n;
        }
    }
    public static void main(String[] args) {
        System.out.println(sum(7));
    }
}
