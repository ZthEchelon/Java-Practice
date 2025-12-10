import java.util.Scanner;

public class UserInput4 {
    public static void main(String[] args) {
        
        //methods used for obtaining user input

        Scanner scanner=new Scanner(System.in);


        System.out.println("Who are you");

        String name = scanner.nextLine();

        System.out.println("how old u r?");

        //NextInt allows for only numbers
        int age = scanner.nextInt();

        /* need to reset scanner as inside scanner method 
        there is a \n
        */

        scanner.nextLine();
        System.out.println("what food u like");

        String food = scanner.nextLine();


        System.out.println("You are \n"+name+" age is \n" +age
        + " years old and you like to eat\n" + food);

        scanner.close();
    }
}
