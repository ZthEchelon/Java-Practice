public class Methods{
    public static void main (String args []){ //main method

        //method = write code once and reuse it whenever you call itt.
        // block of reusable code


        // In programming follow dry principle dont - repeat - yourself

        //methods are unfamiliar with variables declared in other vars
        //therefore vars within methods are local/ 


        // if calling method from an static method then the method called
        // must also be static

        String name = "Zubby";
        int age = 25;

        // method call must have a matching set of parameters to the args
        // you are recieving
        happyBirthday(name, age);
        happyBirthday(name, age);


    }
    //method creation

    // to receive values in method created must have the data type (ex int, char) set
    // within the paramenter meaning within the ( )
    static void happyBirthday(String n, int a){ //new method created

        System.out.println("Happy Birthday to YOU! " + n);
        System.out.println("Happy Birthday Dear...Person?");
        System.out.println("You are as Old (or Young) as you want to be :) " + a);
        System.out.println("HAPPY BIRTHDAYYY");


    }

}