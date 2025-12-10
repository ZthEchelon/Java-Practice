import java.util.Random;

public class randomclass{
    public static void main(String [] args){

        Random random = new Random(); // when calling a class to be used to initialize call the class
        //set a variable name and set = new (said class)


        int number;
        double number2;
        int number3;

        number = random.nextInt(1,6); // numbers are exclusive 
        number2 = random.nextDouble(1,6); // numbers are exclusive 
        number3 = random.nextInt(1,6); // numbers are exclusive 
       System.out.println(number + "\n" + number2 + "\n" + number3);



    }
}