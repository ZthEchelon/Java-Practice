import java.util.Scanner;

public class UserValidation {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String username;

        // Loop until a valid username is entered
        while (true) {

            System.out.print("Enter your username: ");
            username = scanner.nextLine().trim(); // remove leading/trailing spaces

            // Check length of username
            if (username.length() < 4 || username.length() > 12) {
                System.out.println("Username must be between 4 to 12 characters");

                // continue stops this iteration of the while loop from continuing
                // and jumps right back to the beginning
                continue;
            }

            // Check for invalid characters (spaces or underscores)
            if (username.contains(" ") || username.contains("_")) {
                System.out.println("Username cannot contain spaces or underscores");

                // continue stops this iteration and prompts again
                continue;
            }

            // If all checks pass, break out of the loop
            break;
        }

        // Greet the user
        System.out.printf("Hey there %s%n", username);

        // Close the scanner to prevent resource leaks
        scanner.close();
    }
}