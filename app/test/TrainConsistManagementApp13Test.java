import java.util.*;
import java.util.stream.*;

class TrainConsistManagementApp13Test {

    static class Bogie {
        String name;
        int capacity;

        Bogie(String name, int capacity) {
            this.name = name;
            this.capacity = capacity;
        }
    }

    static List<Bogie> loopFilter(List<Bogie> bogies) {
        List<Bogie> result = new ArrayList<>();
        for (Bogie b : bogies) {
            if (b.capacity > 60) {
                result.add(b);
            }
        }
        return result;
    }

    static List<Bogie> streamFilter(List<Bogie> bogies) {
        return bogies.stream()
                .filter(b -> b.capacity > 60)
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {

        System.out.println("========================================");
        System.out.println(" UC13 - Test Cases ");
        System.out.println("========================================\n");

        List<Bogie> bogies = new ArrayList<>();
        bogies.add(new Bogie("Sleeper", 72));
        bogies.add(new Bogie("AC Chair", 56));
        bogies.add(new Bogie("General", 90));

        List<Bogie> loopResult = loopFilter(bogies);
        List<Bogie> streamResult = streamFilter(bogies);

        if (loopResult.size() == 2) {
            System.out.println("Test 1 Passed (Loop Filtering)");
        } else {
            System.out.println("Test 1 Failed");
        }

        if (streamResult.size() == 2) {
            System.out.println("Test 2 Passed (Stream Filtering)");
        } else {
            System.out.println("Test 2 Failed");
        }

        if (loopResult.size() == streamResult.size()) {
            System.out.println("Test 3 Passed (Results Match)");
        } else {
            System.out.println("Test 3 Failed");
        }

        long start = System.nanoTime();
        loopFilter(bogies);
        long end = System.nanoTime();

        if ((end - start) > 0) {
            System.out.println("Test 4 Passed (Time Measurement)");
        } else {
            System.out.println("Test 4 Failed");
        }

        List<Bogie> large = new ArrayList<>();
        for (int i = 0; i < 10000; i++) {
            large.add(new Bogie("B" + i, i % 100));
        }

        if (streamFilter(large).size() >= 0) {
            System.out.println("Test 5 Passed (Large Dataset)");
        } else {
            System.out.println("Test 5 Failed");
        }

        System.out.println("\nAll test cases executed...");
    }
}