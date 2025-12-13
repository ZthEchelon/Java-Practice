import java.util.Scanner;

public class TernaryOperatorProject_TempCalculator{

    public static void main (String [] args){

        //variable Introductions

        Scanner scanner = new Scanner (System.in);

        double temp, newTemp;

        String unit;

        //Ask for User Input

        System.out.println("Enter the temp: ");

        temp = scanner.nextDouble();

        System.out.println(("Conver to C or F"));

        unit = scanner.next().toUpperCase(); //method chaining


        // (condition ) ? true : fasle

        newTemp = (unit.equals ("C")) ? (temp - 32) * 5 / 9 : (temp * 5 / 9) + 32;

        System.out.printf("%.1f degrees %s %n", newTemp, unit);

        scanner.close();
    }
}
