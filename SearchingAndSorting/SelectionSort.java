public class SelectionSort {
    public static void selectionSort(int[] arr){
        for(int i = 0 ; i < arr.length ; i++){
            int min_idx = i;
            for(int j = i+1 ; j < arr.length ; j++){
                if(arr[j] < arr[min_idx])
                    min_idx = j;
            }
            if(min_idx!=i){
                int temp = arr[i];
                arr[i] = arr[min_idx];
                arr[min_idx] = temp;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {23,3,23,16,122,46,1};
        selectionSort(arr);

        System.out.println();
        for (int j : arr) System.out.print(j + " ");
    }
}
