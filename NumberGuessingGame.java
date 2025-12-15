import java.util.Random;
import java.util.Scanner;


public class NumberGuessingGame{
    public static void main (String args []){

        //Number Guessing Game


        //Variable Declaration
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        int min = 1, max = 100;
        int guess, attempts = 0, randomNumber = random.nextInt(min, max+1);
    

        //User Prompts

        System.out.println("Welcome to the Number Guessing Game!");
        System.out.printf("Guess a number between %d - %d: ",min, max);

        //Loop through use of Do While

        do{
            System.out.print("Enter your guess: ");
            guess = scanner.nextInt();
            attempts++;

            if (guess < randomNumber){
                System.out.println("Here's a hint! The number is above!");
            }
            else{
                System.out.println("Here's a hint! The number is below!");

            }


        }while(guess != randomNumber);
    
        System.out.printf("Correct! The number was %d. You have won after %d attempts!",randomNumber, attempts);
        scanner.close();
    }
    
}