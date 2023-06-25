public class InsertionSort {
    public static void insertionSort(int[] arr){
        for(int i = 1; i < arr.length; i++){
            int j = i;
            while(j>0 && arr[j] < arr[j-1]){
                int temp = arr[j];
                arr[j] = arr[j-1];
                arr[j-1] = temp;
                j--;
            }
        }
    }

    public static void main(String[] args){
        int[] arr = {23,3,23,16,122,46,1};
        insertionSort(arr);

        System.out.println();
        for (int j : arr) System.out.print(j + " ");
    }
}
