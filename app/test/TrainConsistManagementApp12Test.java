import java.util.*;
import java.util.stream.*;

class TrainConsistManagementApp12Test {

    static class GoodsBogie {
        String type;
        String cargo;

        GoodsBogie(String type, String cargo) {
            this.type = type;
            this.cargo = cargo;
        }
    }

    static boolean checkSafety(List<GoodsBogie> bogies) {
        return bogies.stream()
                .allMatch(b ->
                        !b.type.equals("Cylindrical") || b.cargo.equals("Petroleum")
                );
    }

    public static void main(String[] args) {

        System.out.println("========================================");
        System.out.println(" UC12 - Test Cases ");
        System.out.println("========================================\n");

        List<GoodsBogie> valid = new ArrayList<>();
        valid.add(new GoodsBogie("Cylindrical", "Petroleum"));
        valid.add(new GoodsBogie("Open", "Coal"));

        if (checkSafety(valid)) {
            System.out.println("Test 1 Passed (All Valid)");
        } else {
            System.out.println("Test 1 Failed");
        }

        List<GoodsBogie> invalid = new ArrayList<>();
        invalid.add(new GoodsBogie("Cylindrical", "Coal"));

        if (!checkSafety(invalid)) {
            System.out.println("Test 2 Passed (Invalid Cylindrical Cargo)");
        } else {
            System.out.println("Test 2 Failed");
        }

        List<GoodsBogie> mixed = new ArrayList<>();
        mixed.add(new GoodsBogie("Box", "Grain"));
        mixed.add(new GoodsBogie("Cylindrical", "Petroleum"));

        if (checkSafety(mixed)) {
            System.out.println("Test 3 Passed (Non-Cylindrical Allowed)");
        } else {
            System.out.println("Test 3 Failed");
        }

        List<GoodsBogie> violation = new ArrayList<>();
        violation.add(new GoodsBogie("Open", "Coal"));
        violation.add(new GoodsBogie("Cylindrical", "Coal"));

        if (!checkSafety(violation)) {
            System.out.println("Test 4 Passed (Mixed Violation)");
        } else {
            System.out.println("Test 4 Failed");
        }

        List<GoodsBogie> empty = new ArrayList<>();

        if (checkSafety(empty)) {
            System.out.println("Test 5 Passed (Empty List Safe)");
        } else {
            System.out.println("Test 5 Failed");
        }

        System.out.println("\nAll test cases executed...");
    }
}