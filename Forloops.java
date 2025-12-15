import java.util.Scanner;
public class Forloops{

        //throws interruptedexception is for the sleep thread
        public static void main (String args []) throws InterruptedException{

        //Examples and how to use for loops
        //for loop - executes some code a certain amount of times

        //within the condition of the for loop
        //there are 3 statements
        // first statement is for initializattion - declaration and assigning
        // it is a counter for how many times the loop has been interated
        // i is also known as loop control var
        // 2nd statement is where you want the loop control var to stop at
        // it is a conditional statement
        // 3rd statement is how you want to increment/decrement the loop control
        //  variable after each iteration

        // i++ or i+=2 or i*=3.. i/=4 etc
        for(int i = 1; i < 100 ; i*=2){
            System.out.println("pizza " + i);

        }

        // ex 2 is to see how many times someone wants a loop to play

        Scanner scanner= new Scanner(System.in);
        System.out.print("Enter how many times you want to loop: ");
        int max = scanner.nextInt();

        for (int i = 1 ;i <= max ;i++ ){

            System.out.println(i);

        }

        // ex 3 for simulating a countdown
        // thread class lets computer sleep

        System.out.print("How many seconds to countdown from?: ");
        int start = scanner.nextInt();

        for (int i = start; i > 0; i--){

            System.out.println(i);
            //goes in units of milliseconds
            Thread.sleep(1000);

        }
        System.out.println("Happy New Year!");

        scanner.close();


    }

    

}