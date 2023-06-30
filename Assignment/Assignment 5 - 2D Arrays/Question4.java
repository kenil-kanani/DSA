import java.util.*;

public class Question4 {
    public static ArrayList<ArrayList> DistinctIntegers(int[] nums1, int[] nums2) {
        Set<Integer> s1 = new HashSet<Integer>();
        Set<Integer> s2 = new HashSet<Integer>();

        for (int n : nums1)
            s1.add(n);
        for (int n : nums2)
            s2.add(n);

        ArrayList<Integer> al1 = new ArrayList<Integer>(s1);
        ArrayList<Integer> al2 = new ArrayList<Integer>(s2);

        ArrayList<Integer> newAl1 = new ArrayList<Integer>();
        ArrayList<Integer> newAl2 = new ArrayList<Integer>();

        for (int i = 0; i < al1.size(); i++) {
            if (!al2.contains(al1.get(i)))
                newAl1.add(al1.get(i));
        }
        for (int i = 0; i < al2.size(); i++) {
            if (!al1.contains(al2.get(i)))
                newAl2.add(al2.get(i));
        }
        ArrayList<ArrayList> answer = new ArrayList<ArrayList>();
        answer.add(newAl1);
        answer.add(newAl2);
        return answer;
    }

    public static void main(String[] args) {
        int[] nums1 = { 1, 2, 3 };
        int[] nums2 = { 2, 4, 6 };

        System.out.println(DistinctIntegers(nums1, nums2));
    }
}
