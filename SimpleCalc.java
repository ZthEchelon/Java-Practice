import java.util.Scanner;

public class SimpleCalc{

    public static void main (String [] args){

        //Local Var Creation

        Scanner scanner = new Scanner(System.in);

        double num1, num2;

        char operator;

        double result;

        //

        //User Prompts

        System.out.print("Enter the first number: ");

        while (!scanner.hasNextDouble()){

            System.out.println("Invalid this isnt a number");
            scanner.next();
            System.out.print("Enter the first number: ");
        }

        num1 = scanner.nextDouble();

        System.out.print("Enter an Operator (+, -, *, ^, /): ");

        operator = scanner.next().charAt(0);

        // accounts for invalid user input

        while (operator != '+' && operator != '-' && operator != '*' && operator != '/' && operator != '^'){
            System.out.println("Invalid input please use one of the given operators");
            System.out.print("Enter an Operator (+, -, *, ^, /): ");
            operator = scanner.next().charAt(0);
        }

        System.out.print("Enter the Second Number: ");

        while (!scanner.hasNextDouble()){

            System.out.println("Invalid this isnt a number");
            scanner.next();
            System.out.print("Enter the Second number: ");
        }

        num2 = scanner.nextDouble();

        switch (operator){
            case '+' -> result = num1 + num2;
            case '-' -> result = num1 - num2;
            case '*' -> result = num1 * num2;
            case '/' ->{ if (num2==0){
                System.out.println("Cannot divide by 0");
                result = 0;
            }
            else{
                result = num1 / num2;
            }
            }
            case '^' -> result = Math.pow(num1, num2);
            default -> result =0; //assigns result a value
        }

        System.out.println(result);



    scanner.close();
    }
}