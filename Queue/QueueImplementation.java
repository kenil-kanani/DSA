package Queue;

import java.util.LinkedList;
import java.util.Queue;

public class QueueImplementation {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();

        // Adding elements to the queue
        for(int i = 0 ; i < 10 ; i++) {
            queue.add(i);
        }

        // Displaying the elements of the queue
        System.out.println("Elements of the queue are: " + queue);

        // Removing elements from the queue
        int removedElement = queue.remove();
        System.out.println("Removed element is: " + removedElement);

        // Displaying the elements of the queue
        System.out.println("Elements of the queue are: " + queue);

        // Displaying the head of the queue
        int head = queue.peek();
        System.out.println("Head of the queue is: " + head);

        // Displaying the size of the queue
        int size = queue.size();
        System.out.println("Size of the queue is: " + size);

        // Checking if the queue is empty
        boolean isEmpty = queue.isEmpty();
        System.out.println("Is the queue empty? " + isEmpty);

        // Checking if the queue contains a particular element
        boolean isPresent = queue.contains(5);
        System.out.println("Is 5 present in the queue? " + isPresent);

    }

}
