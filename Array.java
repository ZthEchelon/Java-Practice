import java.util.Arrays;
public class Array{
    public static void main(String args []){
        // array = a collection of values of the same data type
                    // a var that can store more than one value
        //arrays are a reference data type
        //each value in an array is an element to access an element indicate index #
        //array gives memory address 

        int[] tel = {6,943,1077};
        tel[0] = 1647;

        for (int i =0; i < tel.length;i++){

            System.out.print(tel[i] + " " );
        }
        
        //enhanced for loop also known as for each loop

        // sorts the array
        Arrays.sort(tel);

        for (int element: tel){
            System.out.println(element);
        }

        //changes all elements in the array to what is chosen.
        Arrays.fill(tel, 0);


        for (int element: tel){
            System.out.println(element);
        }
    }
}