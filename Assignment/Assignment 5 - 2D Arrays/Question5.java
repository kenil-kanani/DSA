
public class Question5 {

    public static int fun(int[] arr1, int[] arr2, int d) {
        int answer = 0;
        for (int i = 0; i < arr1.length; i++) {
            int a = arr1[i];
            boolean check = false;
            for (int j = 0; j < arr2.length; j++) {
                int b = arr2[j];
                if(Math.abs(a-b) <= d){
                    check = true;
                }
            }
            if(!check)
                answer++;
        }
        return answer;
    }

    public static void main(String[] args) {
        int[] arr1 = { 4, 5, 8 };
        int[] arr2 = { 10, 9, 1, 8 };
        int d = 2;
        int answer = fun(arr1, arr2, d);
        System.out.println(answer);
    }
}
