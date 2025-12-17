import java.util.Scanner;
public class MatrixNestedLoop{
    public static void main (String [] args){

    Scanner scanner = new Scanner(System.in);

    //project goal is ask for user input to create a matrix

    //var declaration

    int rows, columns;
    char symbol;


    //User prompts and input capture

    System.out.print("Enter the Number of Rows: ");
    rows = scanner.nextInt();

    System.out.printf("Enter the Number of Columns: ");
    columns = scanner.nextInt();

    System.out.print("Enter the Symbol to Use: ");
    symbol = scanner.next().charAt(0);

    for (int i = 0; i < rows; i++){
        for (int j = 0; j < columns; j++){
            System.out.print(symbol);
        }
        System.out.println();
    }



    scanner.close();
    }
}