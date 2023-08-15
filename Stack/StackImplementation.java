package Stack;

import java.util.Stack;

public class StackImplementation {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<Integer>();

        stack.push(10);
        stack.push(20);
        stack.push(0);
        stack.push(30);

        System.out.println("Stack is look like : " + stack);

        System.out.println("Pop element from stack : " + stack.pop());

        System.out.println("Stack is look like : " + stack);

        System.out.println("Peek element from stack : " + stack.peek());

        System.out.println("Stack is look like : " + stack);

        System.out.println("Search 10 from stack : " + stack.search(10));

        System.out.println("Stack is look like : " + stack);

        System.out.println("Search 100 from stack : " + stack.search(100));

        System.out.println("Stack is look like : " + stack);

        System.out.println("Search 0 from stack : " + stack.search(0));

        System.out.println("Stack is look like : " + stack);

        System.out.println("Is stack empty : " + stack.empty());

        System.out.println();

        System.out.println("Search Operation : If element is present in stack then it will return position of element from top of stack otherwise it will return -1.");
        System.out.println("Top element of stack is consider as 1st position.");

        System.out.println();

        System.out.println("Peek Operation : It will return top element of stack without removing it from stack.");

        System.out.println();

        System.out.println("Pop Operation : It will return top element of stack and remove it from stack.");

        System.out.println();

        System.out.println("Push Operation : It will add element at top of stack.");

        System.out.println();

        System.out.println("Empty Operation : It will return true if stack is empty otherwise it will return false.");
    }
}