public class Ternary{

    public static void main (String [] args){

        // ternary operation ?  Return 1 of 2 vals if a condition is true

        // variable = (condtion) ? ifTrue : ifFalse;

        int score =50;

        String passOrFail = (score >= 60) ? "PASS" : "Fail";

        System.out.println(passOrFail);


        int num = 3;

        

        String evenOrOdd = (num % 2 == 0) ? "Even" : "Odd";

        System.out.println(evenOrOdd);

        int hours = 12;

        String timeOfDay = (hours < 12) ? "AM" : "PM";

        System.out.println(timeOfDay);


        int income = 60000;

        double taxRate = (income >= 40000) ? 0.25 : 15;

        System.out.println(taxRate);


    }
}