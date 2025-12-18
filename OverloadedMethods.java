public class OverloadedMethods{
    public static void main (String args []){

        // overloaded methods = methods that share the same name
        //                      but different parameters
        //                      signature = name + parameters
        // parameters = the variables in the method definition
        // arguments = the values passed into the method when called

        // notice method was called but only 2 args were given even though
        //the method exists with 3 parameters
        //overloaded methods since it shares the same name has diff paraementers.
        System.out.println(adder(1, 2));

    }

    static double adder (double a, double b){
        return a + b;
    }

    static double adder(double a, double b, double c){ //OVERLOADED METHOD

        return a + b + c;
    }

    String pizza = bakePizza("Flatbread");

    static String bakePizza (String bread){

        return bread + " Pizza";

    }

    static String bakePizza (String bread, String cheese){

        return bread + " " + cheese +" Pizza";

    }
    //



}
