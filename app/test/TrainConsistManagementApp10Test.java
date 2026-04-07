import java.util.*;
import java.util.stream.*;

class TrainConsistManagementApp10Test {

    static class Bogie {
        String name;
        int capacity;

        Bogie(String name, int capacity) {
            this.name = name;
            this.capacity = capacity;
        }
    }

    static int calculateTotalSeats(List<Bogie> bogies) {
        return bogies.stream()
                .map(b -> b.capacity)
                .reduce(0, Integer::sum);
    }

    public static void main(String[] args) {

        System.out.println("========================================");
        System.out.println(" UC10 - Test Cases ");
        System.out.println("========================================\n");

        List<Bogie> bogies = new ArrayList<>();

        bogies.add(new Bogie("Sleeper", 72));
        bogies.add(new Bogie("AC Chair", 56));
        bogies.add(new Bogie("First Class", 24));

        int total = calculateTotalSeats(bogies);

        if (total == 152) {
            System.out.println("Test 1 Passed (Total Calculation)");
        } else {
            System.out.println("Test 1 Failed");
        }

        List<Bogie> single = new ArrayList<>();
        single.add(new Bogie("Sleeper", 72));

        if (calculateTotalSeats(single) == 72) {
            System.out.println("Test 2 Passed (Single Bogie)");
        } else {
            System.out.println("Test 2 Failed");
        }

        List<Bogie> empty = new ArrayList<>();

        if (calculateTotalSeats(empty) == 0) {
            System.out.println("Test 3 Passed (Empty List)");
        } else {
            System.out.println("Test 3 Failed");
        }

        if (bogies.size() == 3) {
            System.out.println("Test 4 Passed (Original List Unchanged)");
        } else {
            System.out.println("Test 4 Failed");
        }

        System.out.println("\nAll test cases executed...");
    }
}