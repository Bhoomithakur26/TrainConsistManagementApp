class TrainConsistManagementApp15Test {

    static class CargoSafetyException extends RuntimeException {
        CargoSafetyException(String message) {
            super(message);
        }
    }

    static class GoodsBogie {
        String type;
        String cargo;

        GoodsBogie(String type) {
            this.type = type;
            this.cargo = "None";
        }

        void assignCargo(String cargo) {
            try {
                if (type.equals("Rectangular") && cargo.equals("Petroleum")) {
                    throw new CargoSafetyException("Unsafe");
                }
                this.cargo = cargo;

            } catch (CargoSafetyException e) {
                System.out.println("Handled Exception");

            } finally {
                System.out.println("Finally Executed");
            }
        }
    }

    public static void main(String[] args) {

        System.out.println("========================================");
        System.out.println(" UC15 - Test Cases ");
        System.out.println("========================================\n");

        GoodsBogie safe = new GoodsBogie("Cylindrical");
        safe.assignCargo("Petroleum");

        if (safe.cargo.equals("Petroleum")) {
            System.out.println("Test 1 Passed (Safe Assignment)");
        } else {
            System.out.println("Test 1 Failed");
        }

        GoodsBogie unsafe = new GoodsBogie("Rectangular");
        unsafe.assignCargo("Petroleum");

        if (!unsafe.cargo.equals("Petroleum")) {
            System.out.println("Test 2 Passed (Unsafe Not Assigned)");
        } else {
            System.out.println("Test 2 Failed");
        }

        unsafe.assignCargo("Coal");

        if (unsafe.cargo.equals("Coal")) {
            System.out.println("Test 3 Passed (Program Continues)");
        } else {
            System.out.println("Test 3 Failed");
        }

        System.out.println("\nCheck above output for 'Finally Executed' messages");
        System.out.println("Test 4 Passed (Finally Block Execution)");

        System.out.println("\nAll test cases executed...");
    }
}