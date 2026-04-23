import java.util.*;
public class MapDemo {
    public static void main(String[] args) {
        // HashMap: The standard lookup tool
        Map<String, Integer> scores = new HashMap<>();
        scores.put("Alice", 90);
        scores.put("Bob", 85);
        
        // TreeMap: Keys are sorted alphabetically
        Map<String, Integer> sortedScores = new TreeMap<>();
        sortedScores.put("Zebra", 1);
        sortedScores.put("Apple", 10);

        System.out.println("Alice's Score: " + scores.get("Alice"));
        System.out.println("Sorted Map Keys: " + sortedScores.keySet());
    }
}