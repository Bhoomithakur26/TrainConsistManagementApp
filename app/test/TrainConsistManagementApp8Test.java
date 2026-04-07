import org.junit.jupiter.api.Test;
import java.util.*;
import java.util.stream.*;
import static org.junit.jupiter.api.Assertions.*;
class TrainConsistManagementApp8Test {
    static class Bogie {
        String name;
        int capacity;

        Bogie(String name, int capacity) {
            this.name = name;
            this.capacity = capacity;
        }
    }

    static List<Bogie> filterBogies(List<Bogie> bogies, int threshold) {
        return bogies.stream()
                .filter(b -> b.capacity > threshold)
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {

        System.out.println("========================================");
        System.out.println(" UC8 - Filter Passenger Bogies Using Streams ");
        System.out.println("========================================\n");

        List<Bogie> bogies = new ArrayList<>();

        bogies.add(new Bogie("Sleeper", 72));
        bogies.add(new Bogie("AC Chair", 56));
        bogies.add(new Bogie("First Class", 24));
        bogies.add(new Bogie("General", 90));

        List<Bogie> result = filterBogies(bogies, 60);

        if (result.size() == 2) {
            System.out.println("Test 1 Passed");
        } else {
            System.out.println("Test 1 Failed");
        }

        result = filterBogies(bogies, 100);
        if (result.isEmpty()) {
            System.out.println("Test 2 Passed");
        } else {
            System.out.println("Test 2 Failed");
        }

        List<Bogie> emptyList = new ArrayList<>();
        result = filterBogies(emptyList, 60);
        if (result.isEmpty()) {
            System.out.println("Test 3 Passed");
        } else {
            System.out.println("Test 3 Failed");
        }

        if (bogies.size() == 4) {
            System.out.println("Test 4 Passed (Original List Unchanged)");
        } else {
            System.out.println("Test 4 Failed");
        }

        System.out.println("\nUC8 operations completed...");
    }
}