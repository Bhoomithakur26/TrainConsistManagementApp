import java.util.regex.*;

class TrainConsistManagementApp11Test {

    static boolean validateTrainId(String trainId) {
        Pattern pattern = Pattern.compile("TRN-\\d{4}");
        Matcher matcher = pattern.matcher(trainId);
        return matcher.matches();
    }

    static boolean validateCargoCode(String cargoCode) {
        Pattern pattern = Pattern.compile("PET-[A-Z]{2}");
        Matcher matcher = pattern.matcher(cargoCode);
        return matcher.matches();
    }

    public static void main(String[] args) {

        System.out.println("========================================");
        System.out.println(" UC11 - Test Cases ");
        System.out.println("========================================\n");

        if (validateTrainId("TRN-1234")) {
            System.out.println("Test 1 Passed (Valid Train ID)");
        } else {
            System.out.println("Test 1 Failed");
        }

        if (!validateTrainId("TRAIN12")) {
            System.out.println("Test 2 Passed (Invalid Train ID)");
        } else {
            System.out.println("Test 2 Failed");
        }

        if (validateCargoCode("PET-AB")) {
            System.out.println("Test 3 Passed (Valid Cargo Code)");
        } else {
            System.out.println("Test 3 Failed");
        }

        if (!validateCargoCode("PET-ab")) {
            System.out.println("Test 4 Passed (Invalid Cargo Code)");
        } else {
            System.out.println("Test 4 Failed");
        }

        if (!validateTrainId("TRN-123")) {
            System.out.println("Test 5 Passed (Digit Length Check)");
        } else {
            System.out.println("Test 5 Failed");
        }

        if (!validateCargoCode("PET123")) {
            System.out.println("Test 6 Passed (Format Check)");
        } else {
            System.out.println("Test 6 Failed");
        }

        if (!validateTrainId("")) {
            System.out.println("Test 7 Passed (Empty Input)");
        } else {
            System.out.println("Test 7 Failed");
        }

        if (!validateCargoCode("PET-ABC")) {
            System.out.println("Test 8 Passed (Exact Match Check)");
        } else {
            System.out.println("Test 8 Failed");
        }

        System.out.println("\nAll test cases executed...");
    }
}