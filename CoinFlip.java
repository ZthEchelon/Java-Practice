
import java.util.Random;

public class CoinFlip{

    public static void main(String [] args){


       Random coinflipper = new Random();

       boolean isHeads = coinflipper.nextBoolean();

       if (isHeads){

        System.out.println("Heads!");
       }
       else{
        System.out.println("Tails");
       }
       // add feature for reusability
    }
}

    

