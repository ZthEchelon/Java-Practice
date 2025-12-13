import java.util.Scanner;


public class substring{

    public static void main (String [] args){

        Scanner scanner = new Scanner (System.in);


        // .substring() = A method used to extra a portion of a String
        //                  .subtring (start, end)


        System.out.println("Enter your email: ");

        String email = scanner.nextLine();

        while (!email.contains("@")){

            System.out.println("Email must contain @");

            System.out.println("Please Re-enter your email: ");

            email = scanner.nextLine();
        }
        
        String username = email.substring(0, email.indexOf("@"));

        String domain = email.substring(email.indexOf("@") + 1 );


        System.out.println(username);
            
        System.out.println(domain);


        scanner.close();

        }
    }
