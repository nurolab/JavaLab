import java.util.*;
public class QueueDemo {
    public static void main(String[] args) {
        // PriorityQueue: Smallest number comes out first
        Queue<Integer> pq = new PriorityQueue<>();
        pq.add(50);
        pq.add(10);
        pq.add(30);

        // ArrayDeque: Faster than Stack class for LIFO operations
        Deque<String> stack = new ArrayDeque<>();
        stack.push("Bottom");
        stack.push("Top");

        System.out.println("PQ Poll (Lowest first): " + pq.poll()); // Prints 10
        System.out.println("Stack Pop (Last in): " + stack.pop());    // Prints "Top"
    }
}