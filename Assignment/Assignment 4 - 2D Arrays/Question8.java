import java.util.ArrayList;

public class Question8 {

    public static int[] changeArray(int nums[]) {
        ArrayList<Integer> al = new ArrayList<Integer>();
        for (int i = 0, j = nums.length / 2; i < nums.length/2; i++, j++) {
            al.add(nums[i]);
            al.add(nums[j]);
        }
        for (int i = 0; i < nums.length; i++) {
            nums[i] = al.get(i);
        }
        return nums;
    }

    public static void main(String[] args) {
        int nums[] = { 2, 5, 1, 3, 4, 7 };
        changeArray(nums);
        for (int i : nums)
            System.out.print(i + " ");
    }
}
