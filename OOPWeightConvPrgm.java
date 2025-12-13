import java.util.Scanner;

// -------------------- Main Class --------------------
public class WeightConvPrgm {

    public static void main(String[] args) {

        // 1️⃣ Create Scanner for user input
        Scanner scanner = new Scanner(System.in);

        // 2️⃣ Create InputHelper for safe input
        InputHelper input = new InputHelper(scanner);

        // 3️⃣ Create WeightConverter for the math logic
        WeightConverter converter = new WeightConverter();

        // 4️⃣ Display welcome message and options
        System.out.println("Weight Conversion Program");
        System.out.println("1) Pounds → Kilograms");
        System.out.println("2) Kilograms → Pounds");

        // 5️⃣ Get validated choice (1 or 2)
        int choice = input.getValidChoice();

        // 6️⃣ Get validated weight (double)
        double weight = input.getValidWeight();

        // 7️⃣ Convert the weight using appropriate method
        double result;
        if (choice == 1) {
            result = converter.poundsToKilograms(weight);
            System.out.printf("Converted weight: %.2f kg%n", result);
        } else {
            result = converter.kilogramsToPounds(weight);
            System.out.printf("Converted weight: %.2f lbs%n", result);
        }

        // 8️⃣ Close Scanner
        scanner.close();
    }
}

// -------------------- Input Helper Class --------------------
class InputHelper {

    private Scanner scanner;

    public InputHelper(Scanner scanner) {
        this.scanner = scanner;
    }

    // Method to get valid menu choice
    public int getValidChoice() {

        int choice;

        // PSEUDOCODE:
        // Loop until user enters a valid integer that is 1 or 2
        while (true) {
            System.out.print("Choose an option (1 or 2): ");

            // Step 1: Check if input is an integer
            if (!scanner.hasNextInt()) {
                System.out.println("Invalid input. Please enter a number.");
                scanner.next(); // discard invalid input
                continue;
            }

            // Step 2: Read integer input
            choice = scanner.nextInt();

            // Step 3: Validate value
            if (choice == 1 || choice == 2) {
                break; // valid input → exit loop
            }

            System.out.println("Invalid choice. Enter 1 or 2.");
        }

        return choice;
    }

    // Method to get a valid weight
    public double getValidWeight() {

        double weight;

        // PSEUDOCODE:
        // Loop until user enters a valid number
        while (true) {
            System.out.print("Enter weight: ");

            // Step 1: Check if input is a double
            if (!scanner.hasNextDouble()) {
                System.out.println("Invalid input. Please enter a numeric value.");
                scanner.next(); // discard invalid input
                continue;
            }

            // Step 2: Read double input
            weight = scanner.nextDouble();
            break; // valid input → exit loop
        }

        return weight;
    }
}

// -------------------- Weight Converter Class --------------------
class WeightConverter {

    // Conversion constants
    private static final double LB_TO_KG = 0.453592;
    private static final double KG_TO_LB = 2.20462;

    // Convert pounds to kilograms
    public double poundsToKilograms(double pounds) {
        return pounds * LB_TO_KG;
    }

    // Convert kilograms to pounds
    public double kilogramsToPounds(double kilograms) {
        return kilograms * KG_TO_LB;
    }
}
