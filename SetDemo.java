import java.util.*;
public class SetDemo {
    public static void main(String[] args) {
        // HashSet: No order, O(1) performance
        Set<Integer> hashSet = new HashSet<>();
        
        hashSet.add(5);
        hashSet.add(15);
        hashSet.add(15); // Duplicate ignored

        // TreeSet: Elements sorted automatically (5, 10, 20)
        Set<Integer> treeSet = new TreeSet<>();
        treeSet.add(20);
        treeSet.add(5);
        treeSet.add(10);

        System.out.println("HashSet (Random order): " + hashSet);
        System.out.println("TreeSet (Sorted order): " + treeSet);
    }
}