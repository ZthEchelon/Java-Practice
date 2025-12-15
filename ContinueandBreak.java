import java.util.Scanner;

public class ContinueandBreak{
    public static void main (String args []){

        //break = break out of a loop (STOP)
        //continue = skip current iteration of a loop (SKIP)

        for (int i = 0; i < 20; i++){

            if (i == 5){
                // skips the 5th iteration
                continue;
            }
            if ( i == 10){
                //ends the loop at 10
                break;
            }
            System.out.print(i + " ");
        }
    }
}