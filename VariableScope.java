public class VariableScope {

    // Java will use local scope over class scope if they have the same name.

    static int x =3; // CLASS VAR
    public static void main (String args []){

        //variable declared within a method is local var
        
        int x = 1; //LOCAL 

        System.out.println(x);

        doSomething();


    }
    static void doSomething () {//no usages

        int x = 2; //LOCAL 

        System.out.println(x);
    }

}