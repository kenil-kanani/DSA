import java.util.*;

public class Question1 {

    public static int[][] convert2D(int[] arr, int m, int n) {
        int[][] twoDArr = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                twoDArr[i][j] = arr[(i * n) + j];
            }
        }
        return twoDArr;
    }

    public static void main(String[] args) {
        int m = 2, n = 2;
        int[] arr = { 1, 2, 3, 4 };
        int[][] twoDArr = convert2D(arr, m, n);
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(twoDArr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
