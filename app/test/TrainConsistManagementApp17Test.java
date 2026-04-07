import java.util.*;

class TrainConsistManagementApp17Test {

    static boolean isSorted(String[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i].compareTo(arr[i + 1]) > 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {

        System.out.println("========================================");
        System.out.println(" UC17 - Test Cases ");
        System.out.println("========================================\n");

        String[] t1 = {"Sleeper","AC Chair","First Class","General","Luxury"};
        Arrays.sort(t1);
        if (isSorted(t1)) {
            System.out.println("Test 1 Passed (Basic Sorting)");
        } else {
            System.out.println("Test 1 Failed");
        }

        String[] t2 = {"Luxury","General","Sleeper","AC Chair"};
        Arrays.sort(t2);
        if (isSorted(t2)) {
            System.out.println("Test 2 Passed (Unsorted Input)");
        } else {
            System.out.println("Test 2 Failed");
        }

        String[] t3 = {"AC Chair","First Class","General"};
        Arrays.sort(t3);
        if (isSorted(t3)) {
            System.out.println("Test 3 Passed (Already Sorted)");
        } else {
            System.out.println("Test 3 Failed");
        }

        String[] t4 = {"Sleeper","AC Chair","Sleeper","General"};
        Arrays.sort(t4);
        if (isSorted(t4) && t4.length == 4) {
            System.out.println("Test 4 Passed (Duplicates)");
        } else {
            System.out.println("Test 4 Failed");
        }

        String[] t5 = {"Sleeper"};
        Arrays.sort(t5);
        if (isSorted(t5)) {
            System.out.println("Test 5 Passed (Single Element)");
        } else {
            System.out.println("Test 5 Failed");
        }

        System.out.println("\nAll test cases executed...");
    }
}