import java.util.*;

class TrainConsistManagementApp19Test {

    static boolean binarySearch(String[] arr, String key) {

        if (arr.length == 0) return false;

        Arrays.sort(arr);

        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {

            int mid = (low + high) / 2;

            int cmp = key.compareTo(arr[mid]);

            if (cmp == 0) return true;
            else if (cmp < 0) high = mid - 1;
            else low = mid + 1;
        }

        return false;
    }

    public static void main(String[] args) {

        System.out.println("========================================");
        System.out.println(" UC19 - Test Cases ");
        System.out.println("========================================\n");

        String[] arr = {"BG101","BG205","BG309","BG412","BG550"};

        if (binarySearch(arr, "BG309")) {
            System.out.println("Test 1 Passed (Found)");
        } else {
            System.out.println("Test 1 Failed");
        }

        if (!binarySearch(arr, "BG999")) {
            System.out.println("Test 2 Passed (Not Found)");
        } else {
            System.out.println("Test 2 Failed");
        }

        if (binarySearch(arr, "BG101")) {
            System.out.println("Test 3 Passed (First Element)");
        } else {
            System.out.println("Test 3 Failed");
        }

        if (binarySearch(arr, "BG550")) {
            System.out.println("Test 4 Passed (Last Element)");
        } else {
            System.out.println("Test 4 Failed");
        }

        String[] single = {"BG101"};
        if (binarySearch(single, "BG101")) {
            System.out.println("Test 5 Passed (Single Element)");
        } else {
            System.out.println("Test 5 Failed");
        }

        String[] empty = {};
        if (!binarySearch(empty, "BG101")) {
            System.out.println("Test 6 Passed (Empty Array)");
        } else {
            System.out.println("Test 6 Failed");
        }

        String[] unsorted = {"BG309","BG101","BG550","BG205","BG412"};
        if (binarySearch(unsorted, "BG205")) {
            System.out.println("Test 7 Passed (Unsorted Input Handled)");
        } else {
            System.out.println("Test 7 Failed");
        }

        System.out.println("\nAll test cases executed...");
    }
}