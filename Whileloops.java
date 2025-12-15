import java.util.Scanner;

public class Whileloops{
    public static void main(String [] args){

        //var declarations

        Scanner scanner = new Scanner(System.in);

        String name = "";

        // use print so user enters answer on same line as question
        System.out.print("What's your name?: ");
        name = scanner.nextLine();

        // conditionals parameters
        while (name.isEmpty()){
            System.out.println("I didn't get a name try again smart ass ;) ");
            System.out.print("What's your name?: ");
            name = scanner.nextLine();
        }

        System.out.println(
            "Hey " + name.trim().substring(0,1).toUpperCase() + name.substring(1)
        );

        // 2nd Example
        String response = "";

        while(!response.equals("Q")){
            System.out.println("You are playing a game");
            System.out.print("Press Q to quit: ");
            response = scanner.nextLine().toUpperCase();
        }

        // 3rd Example

        int age = 0;

        // verbal = while scanner has next does not have an integer run this loop
        while (true) {

            System.out.print("Enter your age: ");

            //check if the user entered a number
            if (!scanner.hasNextInt()) {
                System.out.println("You didn't enter a number silly");
                scanner.next(); // discard invalid input
                continue;
            }

            age = scanner.nextInt();
            scanner.nextLine(); // clear newline

            if (age < 0){
                System.out.println("Age must be a positive number.");
                continue;
            }

            break;
        }

        System.out.println("You are " + age + " years old");



        //Ex 4 Do While Loop - check condition after entering the loop

        int num2 = 0;


        do{
            System.out.print("Enter a number between 1 - 10");
            num2 = scanner.nextInt();
        }while (num2 < 2 || num2 > 10);


        System.out.println("You picked " + num2);

        scanner.close();
    }
}