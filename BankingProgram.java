import java.util.Scanner;

public class BankingProgram{

    static Scanner scanner = new Scanner(System.in); // declare scanner on class scope

    public static void main (String args []){


        // What you want to do?
        //Make a banking program

        
        //DECLARE VARIABLES

        double balance = 85000;
        boolean isRunning = true;
        int choice;

        while (isRunning){
            //DISPLAY MENU

            System.out.println("*********************");
            System.out.println("BANKING PROGRAM");
            System.out.println("*********************");
            System.out.println("1.  Show Balance");
            System.out.println("2.  Deposit");
            System.out.println("3.  Withdraw");
            System.out.println("4.  Exit");
            System.out.println("*********************");

        
            //GET AND PROCESS USER CHOICES

            System.out.print("Enter your choice (1-4): ");
            choice = scanner.nextInt();

            // good choice to use switch b/c no complex conditions needed
            // good choice to use if - if the condition involved logic
            switch (choice){

                case 1 -> showBalance(balance);
                case 2 -> balance += deposit();
                case 3 -> balance -= withdraw(balance);
                case 4 -> isRunning = false;
                default -> System.out.println("INVALID CHOICE");
            }
        }
        System.out.println("*********************");

        
        System.out.println("Thanks! Have a good day");
    scanner.close();
    }

    //METHODS NEEDED 

        //showBalance()    1

        //deposit() 2

        //withdraw()    3

        // EXIT MESSAGE 4

        
    static void showBalance(double balance){
        System.out.printf("\nYour Balance is: $%,.2f \n\n", balance);

    }
    static double deposit(){
        double amount;

        System.out.printf("Enter an amount to be deposited: ");
        
        amount = scanner.nextDouble();

        if (amount <= 0){
            System.out.println("Amount cannot be 0 or negative.");
            return 0;
        }
        else { return amount;}
    }
    
    
    static double withdraw(double balance){
        double amount;

        System.out.printf("Enter an amount to be withdrawn: ");
        
        amount = scanner.nextDouble();

        if (amount <= 0 || amount >= balance){
            System.out.println("Amount cannot be 0 or negative or be more than current balance.");
            return 0;
        }
        else { return amount;}        

    }
}