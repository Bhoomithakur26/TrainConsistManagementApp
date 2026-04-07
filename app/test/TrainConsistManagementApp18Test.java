class TrainConsistManagementApp18Test {

    static boolean linearSearch(String[] arr, String key) {
        for (String id : arr) {
            if (id.equals(key)) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {

        System.out.println("========================================");
        System.out.println(" UC18 - Test Cases ");
        System.out.println("========================================\n");

        String[] arr = {"BG101","BG205","BG309","BG412","BG550"};

        if (linearSearch(arr, "BG309")) {
            System.out.println("Test 1 Passed (Found)");
        } else {
            System.out.println("Test 1 Failed");
        }

        if (!linearSearch(arr, "BG999")) {
            System.out.println("Test 2 Passed (Not Found)");
        } else {
            System.out.println("Test 2 Failed");
        }

        if (linearSearch(arr, "BG101")) {
            System.out.println("Test 3 Passed (First Element)");
        } else {
            System.out.println("Test 3 Failed");
        }

        if (linearSearch(arr, "BG550")) {
            System.out.println("Test 4 Passed (Last Element)");
        } else {
            System.out.println("Test 4 Failed");
        }

        String[] single = {"BG101"};

        if (linearSearch(single, "BG101")) {
            System.out.println("Test 5 Passed (Single Element)");
        } else {
            System.out.println("Test 5 Failed");
        }

        System.out.println("\nAll test cases executed...");
    }
}