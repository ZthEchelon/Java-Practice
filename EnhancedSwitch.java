import java.util.Scanner;

public class EnhancedSwitch{
    public static void main (String [] args ){

        // Enhanced switch

        // A switch is a replacement to using many else if statements
    /* 
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter the day of the week: ");
    String day = scanner.nextLine().toLowerCase(); // convert to lowercase for easier comparison

    if (day.equals("monday")) {
        System.out.println("Weekday");
    } else if (day.equals("tuesday")) {
        System.out.println("Weekday");
    } else if (day.equals("wednesday")) {
        System.out.println("Weekday");
    } else if (day.equals("thursday")) {
        System.out.println("Weekday");
    } else if (day.equals("friday")) {
        System.out.println("Weekday");
    } else if (day.equals("saturday") || day.equals("sunday")) {
        System.out.println("Weekend");
    } else {
        System.out.println("Invalid day");
    }
    */


    Scanner scanner2 = new Scanner (System.in);
    String day2;

    boolean valid = false;


    //accounting for edge cases for user input
    //converts string to lower case to prevent errors with cases not finding exact day
    //trims any empty space user inputs

    while (!valid){

        System.out.println("What is today?: ");

        day2 = scanner2.nextLine().trim().toLowerCase();

        switch (day2){

        // note instead of doing multiple cases can CS (comma seperate) the values
            case "monday", "tuesday", "wednesday" -> {
                System.out.println("It is a weekday");
                valid =true;
            }   
            case "thursday" -> System.out.println("It is a weekday");
            case "friday" -> System.out.println("It is a weekday");
            case "saturday", "sunday" -> System.out.println("It is a weekend");
            default -> System.out.println(day2 + " is not a day");
        }

    
        


        }
        scanner2.close();
    }
}