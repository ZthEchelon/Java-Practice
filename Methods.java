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

        System.out.println(squarer(age));

        if (ageCheck(age)){
            System.out.println("Come on in and get alchohol");
        }
        else{ System.out.println("get outta here yn");}


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

    
    
    // 2nd method created
    // if method is not returning anything list data type as void
    // if it will return something change data type
    static double squarer(int a){


        return a*a;
    }

    static String nameAppender (String FirstName, String LastName){
        return FirstName + " " + LastName;
    }

    static boolean ageCheck (int age){ //method to check legal age

        return age >= 18; // this will return true or false.
    }

    //

}

