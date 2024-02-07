package ClassRoomIT916;
import java.util.LinkedList;
import java.util.Queue;

public class QueueSimulator {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();
// Add elements to the queue
        queue.add("ABC");
        queue.add("EFG");
        queue.add("HIJ");
        queue.add("LMN");
// Display the contents of the queue
        System.out.println("Queue contents: " + queue);
// Remove the head of the queue
        String head = queue.remove();
        System.out.println("Removed from queue: " + head);
// Display the new head of the queue
        System.out.println("New head of queue: " + queue.peek());
// Add another element to the queue
        queue.add("Emily");
// Display the contents of the queue again
        System.out.println("Queue contents: " + queue);
    }
}

