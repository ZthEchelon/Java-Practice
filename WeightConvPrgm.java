import java.util.Scanner;

public class  WeightConvPrgm{

    /**
     * @param args
     */
    public static void main (String [] args){

        //Intro To Psuedo Code
        // Explains what you want to do at start of program

        //Ex ... Weight Conversion Program

        // Declare variables

        Scanner scanner = new Scanner(System.in);

        double weight, newWeight;

        int choice;


        // Welcome message

        System.out.println("Weight Conversion Program");

        System.out.println("Choose an Option. Option 1 is 1lbs to kg and Opt 2 is opposite");

        choice = scanner.nextInt();

        while (choice!= 1 && choice!= 2){

            System.out.println("You aren't getting out of here if you dont choose 1 or 2 hehe\n");

            System.out.println("Choose an Option. Option 1 is 1lbs to kg and Opt 2 is opposite\n");


            choice = scanner.nextInt();   
        }

        System.out.println("Enter Weight");

        while (!scanner.hasNextDouble()) {
            System.out.println("Invalid input. Please enter a numeric weight:");
            scanner.next();
        }

        weight = scanner.nextDouble();

        if (choice == 1){

            newWeight = weight *  .453592;

            System.out.printf("The New Weight in Kgs is %.2f %n ", newWeight);

        }
        else {

            newWeight = weight * 2.20462;

            System.out.printf("The New Weight in Lbs is %.2f %n ", newWeight);
        }

        






        //prompt for user choice

        // option 1 lbs to kgs

        // option 2kgs to lbs

        //else print not valid choice


    }   
        
}