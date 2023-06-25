public class BubbleSort {
        public static void bubbleSort(int[] arr){
        for(int i = 0; i < arr.length - 1; i++){
            boolean check = false;
            for(int j = 0 ; j < arr.length - 1 - i ; j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    check = true;
                }
            }
            if(!check) break;
        }
    }

    public static void main(String[] args){
        int[] arr = {23,3,23,16,122,46,1};
        bubbleSort(arr);

        System.out.println();
        for (int j : arr) System.out.print(j + " ");
    }
}
