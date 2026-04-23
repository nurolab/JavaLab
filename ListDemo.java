import java.util.*;

public class ListDemo {
    public static void main(String[] args) {
        List<String> arrayLs = new ArrayList<>();
        arrayLs.add("Java");
        arrayLs.add("Python");
        arrayLs.add(1, "C++");

        List<String> linkedList = new LinkedList<>();
        linkedList.add("Fast");
        linkedList.add("Flexible");
        
        System.out.println("ArrayList: " + arrayLs);
        System.out.println("Get element at 1: " + arrayLs.get(1));
    }
}

