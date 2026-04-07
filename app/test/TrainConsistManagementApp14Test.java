class TrainConsistManagementApp14Test {

    static class InvalidCapacityException extends Exception {
        InvalidCapacityException(String message) {
            super(message);
        }
    }

    static class PassengerBogie {
        String name;
        int capacity;

        PassengerBogie(String name, int capacity) throws InvalidCapacityException {
            if (capacity <= 0) {
                throw new InvalidCapacityException("Capacity must be greater than zero");
            }
            this.name = name;
            this.capacity = capacity;
        }
    }

    public static void main(String[] args) {

        System.out.println("========================================");
        System.out.println(" UC14 - Test Cases ");
        System.out.println("========================================\n");

        try {
            PassengerBogie b = new PassengerBogie("Sleeper", 72);
            System.out.println("Test 1 Passed (Valid Capacity)");
        } catch (Exception e) {
            System.out.println("Test 1 Failed");
        }

        try {
            new PassengerBogie("AC Chair", -10);
            System.out.println("Test 2 Failed");
        } catch (InvalidCapacityException e) {
            System.out.println("Test 2 Passed (Negative Capacity)");
        }

        try {
            new PassengerBogie("First Class", 0);
            System.out.println("Test 3 Failed");
        } catch (InvalidCapacityException e) {
            System.out.println("Test 3 Passed (Zero Capacity)");
        }

        try {
            new PassengerBogie("General", -5);
        } catch (InvalidCapacityException e) {
            if (e.getMessage().equals("Capacity must be greater than zero")) {
                System.out.println("Test 4 Passed (Exception Message)");
            } else {
                System.out.println("Test 4 Failed");
            }
        }

        try {
            PassengerBogie b = new PassengerBogie("Sleeper", 72);
            if (b.name.equals("Sleeper") && b.capacity == 72) {
                System.out.println("Test 5 Passed (Object Integrity)");
            } else {
                System.out.println("Test 5 Failed");
            }
        } catch (Exception e) {
            System.out.println("Test 5 Failed");
        }

        try {
            PassengerBogie b1 = new PassengerBogie("Sleeper", 72);
            PassengerBogie b2 = new PassengerBogie("AC Chair", 56);
            System.out.println("Test 6 Passed (Multiple Valid Bogies)");
        } catch (Exception e) {
            System.out.println("Test 6 Failed");
        }

        System.out.println("\nAll test cases executed...");
    }
}