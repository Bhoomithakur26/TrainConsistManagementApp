import java.util.*;
import java.util.stream.*;

class TrainConsistManagementApp9Test {

    static class Bogie {
        String name;
        int capacity;

        Bogie(String name, int capacity) {
            this.name = name;
            this.capacity = capacity;
        }
    }

    static Map<String, List<Bogie>> groupBogies(List<Bogie> bogies) {
        return bogies.stream()
                .collect(Collectors.groupingBy(b -> b.name));
    }

    public static void main(String[] args) {

        System.out.println("========================================");
        System.out.println(" UC9 - Test Cases ");
        System.out.println("========================================\n");

        List<Bogie> bogies = new ArrayList<>();

        bogies.add(new Bogie("Sleeper", 72));
        bogies.add(new Bogie("AC Chair", 56));
        bogies.add(new Bogie("Sleeper", 70));
        bogies.add(new Bogie("First Class", 24));
        bogies.add(new Bogie("AC Chair", 60));

        Map<String, List<Bogie>> groupedBogies = groupBogies(bogies);

        if (groupedBogies.containsKey("Sleeper")) {
            System.out.println("Test 1 Passed");
        } else {
            System.out.println("Test 1 Failed");
        }

        if (groupedBogies.get("Sleeper").size() == 2) {
            System.out.println("Test 2 Passed");
        } else {
            System.out.println("Test 2 Failed");
        }

        if (groupedBogies.size() == 3) {
            System.out.println("Test 3 Passed");
        } else {
            System.out.println("Test 3 Failed");
        }

        List<Bogie> emptyList = new ArrayList<>();
        Map<String, List<Bogie>> emptyResult = groupBogies(emptyList);

        if (emptyResult.isEmpty()) {
            System.out.println("Test 4 Passed");
        } else {
            System.out.println("Test 4 Failed");
        }

        if (bogies.size() == 5) {
            System.out.println("Test 5 Passed (Original List Unchanged)");
        } else {
            System.out.println("Test 5 Failed");
        }

        System.out.println("\nAll test cases executed...");
    }
}