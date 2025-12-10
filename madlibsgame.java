import java.util.Scanner;

public class madlibsgame {
    public static void main (String[] args){

        //mad libs is a game where the user fills in the words
        //point is to practice accepting user input

        Scanner scanner = new Scanner(System.in);

        String adjective1;
        String noun1;
        String adjective2;
        String verb1;
        String adjective3;

        System.out.print("Enter an adjective (descrip): ");
        adjective1 = scanner.nextLine();
        System.out.print("Enter an noun (person or animal): ");
        noun1 = scanner.nextLine();
        System.out.print("Enter an adjective (descrip): ");
        adjective2 = scanner.nextLine();
        System.out.print("Enter an verb (ending in ing): ");
        verb1 = scanner.nextLine();
        System.out.print("Enter an adjective (descrip): ");
        adjective3 = scanner.nextLine();
        scanner.close();



        System.out.println("Today I went to a " + adjective1);
        System.out.println("In an exhibit, I saw a " + noun1 +".");
        System.out.println(noun1 + " was " + adjective2 + " and " + verb1);
        System.out.println("I was " + adjective3 + "!");






    }}