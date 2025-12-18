import java.util.Scanner;
import java.util.Random;

public class DiceRollProgram{
    public static void main (String args[]){

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();


        //JAVA DICE ROLLER PROGRAM


        //DECLARE VARS

        int numOfDice = 1;
        int total = 0;

        // GET # OF DICE FROM USER
         System.out.print("Enter the # of dice to roll: ");
         numOfDice = scanner.nextInt();

        // - CHECK IT IS > 0
        while (numOfDice <= 0){
        System.out.println("\n# of Dice must be > 0");
        System.out.print("\nEnter the # of dice to roll: ");
        numOfDice = scanner.nextInt();
        }
        System.out.printf("Now Rolling %d Dice(s)\n",numOfDice);

        // ROLL ALL THE DICE
        for (int i=0; i < numOfDice; i++){
            // first number is inclusive last number is exclusive
            int roll = random.nextInt(1,7);
            System.out.printf("You rolled a %d\n",roll);
            printDie(roll);
            
            // GET THE TOTAL
            total+=roll;
        }
        System.out.println("The total is: " + total);
    scanner.close();
    }

    // DISPLAY ASCII OF DICE
    static void printDie(int roll){

        String dice1 ="""
+-------+
|       |
|   o   |
|       |
+-------+
   1           
                
                """;

    
        String dice2 ="""
+-------+
| o     |
|       |
|     o |
+-------+     
                
                """;
        String dice3 ="""
+-------+
| o     |
|   o   |
|     o |
+-------+    
                
                """;
        String dice4 ="""
+-------+
| o   o |
|       |
| o   o |
+-------+   
                
                """;
        String dice5 ="""
+-------+
| o   o |
|   o   |
| o   o |
+-------+    
                
                """;
        String dice6 ="""
+-------+
| o   o |
| o   o |
| o   o |
+-------+   
                
                """;

        switch(roll){
            case 1 -> System.out.println(dice1);
            case 2 -> System.out.println(dice2);
            case 3 -> System.out.println(dice3);
            case 4 -> System.out.println(dice4);
            case 5 -> System.out.println(dice5);
            case 6 -> System.out.println(dice6);
            default -> System.out.println("Invalid Roll");
        }
    }



}