class TrainConsistManagementApp16Test {

    static void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    static boolean isSorted(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {

        System.out.println("========================================");
        System.out.println(" UC16 - Test Cases ");
        System.out.println("========================================\n");

        int[] a1 = {72, 56, 24, 70, 60};
        bubbleSort(a1);
        if (isSorted(a1)) {
            System.out.println("Test 1 Passed (Basic Sorting)");
        } else {
            System.out.println("Test 1 Failed");
        }

        int[] a2 = {24, 56, 60, 70, 72};
        bubbleSort(a2);
        if (isSorted(a2)) {
            System.out.println("Test 2 Passed (Already Sorted)");
        } else {
            System.out.println("Test 2 Failed");
        }

        int[] a3 = {72, 56, 56, 24};
        bubbleSort(a3);
        if (isSorted(a3)) {
            System.out.println("Test 3 Passed (Duplicates)");
        } else {
            System.out.println("Test 3 Failed");
        }

        int[] a4 = {50};
        bubbleSort(a4);
        if (isSorted(a4)) {
            System.out.println("Test 4 Passed (Single Element)");
        } else {
            System.out.println("Test 4 Failed");
        }

        int[] a5 = {40, 40, 40};
        bubbleSort(a5);
        if (isSorted(a5)) {
            System.out.println("Test 5 Passed (All Equal)");
        } else {
            System.out.println("Test 5 Failed");
        }

        System.out.println("\nAll test cases executed...");
    }
}