package Recurtion;

public class Fibonaci {

    public static int fib(int n) {
        if (n <= 1)
            return n;
        else
            return fib(n - 1) + fib(n - 2);
    }

    public static void main(String[] args) {
        System.out.println(fib(10));
    }
}

// 0 1 1 2 3 5 8 13 21 34