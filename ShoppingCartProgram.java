import java.util.Scanner;

public class ShoppingCartProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String item;
        double price;
        int quantity;
        char currency = '$';
        double total;

        System.out.print("What item would you like to buy?: ");
        item = scanner.nextLine();

        System.out.print("Enter the price of " + item + ": ");
        price = scanner.nextDouble();

        System.out.print("Enter the quantity: ");
        quantity = scanner.nextInt();

        total = price * quantity;
        

        System.out.println("You bought " + quantity + " " + item + "(s) for " + currency + total);

        

        scanner.close();
    }
}
