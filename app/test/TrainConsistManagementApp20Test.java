import static org.junit.jupiter.api.Assertions.*;

class TrainConsistManagementApp20Test  {

    static boolean searchBogie(String[] bogies, String key) {
        if (bogies.length == 0) {
            throw new IllegalStateException("No bogies available for search");
        }

        for (String b : bogies) {
            if (b.equals(key)) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {

        // Test 1: Exception when empty
        try {
            searchBogie(new String[]{}, "BG101");
            System.out.println("FAIL");
        } catch (IllegalStateException e) {
            System.out.println("PASS");
        }

        // Test 2: Search allowed
        try {
            boolean result = searchBogie(new String[]{"BG101","BG205"}, "BG101");
            System.out.println(result ? "PASS" : "FAIL");
        } catch (Exception e) {
            System.out.println("FAIL");
        }

        // Test 3: Found
        System.out.println(
                searchBogie(new String[]{"BG101","BG205","BG309"}, "BG205")
                        ? "PASS" : "FAIL"
        );

        // Test 4: Not Found
        System.out.println(
                !searchBogie(new String[]{"BG101","BG205","BG309"}, "BG999")
                        ? "PASS" : "FAIL"
        );

        // Test 5: Single element
        System.out.println(
                searchBogie(new String[]{"BG101"}, "BG101")
                        ? "PASS" : "FAIL"
        );
    }
}

