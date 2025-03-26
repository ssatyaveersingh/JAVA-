import java.util.*;

public class ToggleChallenge {
    // Seven-segment representations for digits 0-9
    static final int[][] DIGITS = {
        {1, 1, 1, 1, 1, 1, 0}, // 0
        {0, 1, 1, 0, 0, 0, 0}, // 1
        {1, 1, 0, 1, 1, 0, 1}, // 2
        {1, 1, 1, 1, 0, 0, 1}, // 3
        {0, 1, 1, 0, 0, 1, 1}, // 4
        {1, 0, 1, 1, 0, 1, 1}, // 5
        {1, 0, 1, 1, 1, 1, 1}, // 6
        {1, 1, 1, 0, 0, 0, 0}, // 7
        {1, 1, 1, 1, 1, 1, 1}, // 8
        {1, 1, 1, 1, 0, 1, 1}  // 9
    };

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the faulty number in 7-segment display
        System.out.println("Enter the faulty 7-segment representation of the number:");
        String[] faultyInput = scanner.nextLine().split(" ");
        int[][] faultyDigits = new int[faultyInput.length][7];

        for (int i = 0; i < faultyInput.length; i++) {
            for (int j = 0; j < 7; j++) {
                faultyDigits[i][j] = faultyInput[i].charAt(j) - '0';
            }
        }

        // Generate all valid numbers
        List<String> validNumbers = generateValidNumbers(faultyDigits);

        // Print valid numbers
        System.out.println("Valid numbers that can be formed:");
        for (String number : validNumbers) {
            System.out.println(number);
        }

        scanner.close();
    }

    private static List<String> generateValidNumbers(int[][] faultyDigits) {
        List<String> validNumbers = new ArrayList<>();
        generateHelper(faultyDigits, 0, "", validNumbers);
        return validNumbers;
    }

    private static void generateHelper(int[][] faultyDigits, int index, String current, List<String> validNumbers) {
        if (index == faultyDigits.length) {
            validNumbers.add(current);
            return;
        }

        for (int digit = 0; digit < 10; digit++) {
            if (isValid(faultyDigits[index], DIGITS[digit])) {
                generateHelper(faultyDigits, index + 1, current + digit, validNumbers);
            }
        }
    }

    private static boolean isValid(int[] faulty, int[] original) {
        for (int i = 0; i < 7; i++) {
            if (faulty[i] == 1 && original[i] == 0) {
                return false; // Faulty segment is on but original is off
            }
        }
        return true;
    }
}
