package Stack;

// Auxiliary Given a pattern containing only I's and D's. I for increasing and D for decreasing.
// Devise an algorithm to print the minimum number following that pattern.
// Digits from 1-9 and digits can't repeat.
// Input: D        Output: 21
// Input: I        Output: 12
// Input: DD       Output: 321
// Input: II       Output: 123
// Input: DIDI     Output: 21435
// Input: IIDDD    Output: 126543
// Input: DDIDDIID Output: 321654798

// Solution: We will use stack to solve this problem.
// We will push all the numbers from 1 to n in the stack.

// Time Complexity: O(n)
// Space Complexity: O(n)

import java.util.Scanner;
import java.util.Stack;

public class Min_Number_From_Sequence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the sequence: ");
        String str = sc.next();
        int n = str.length();

        Stack<Integer> stack = new Stack<>();

        for(int i = 0; i <= n; i++) {
            stack.push(i + 1);

            if(i == n || str.charAt(i) == 'I') {
                while(!stack.isEmpty()) {
                    System.out.print(stack.pop());
                }
            }
        }
    }
}