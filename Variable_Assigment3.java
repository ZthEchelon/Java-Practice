public class Variable_Assigment3 {
    public static void main(String[] args) {
        
        /* switching variables using temp var*/
        String x = "cool ";
        String y = "is me? ";

        System.out.println("this is x: "+x+"This is y:"+y);
        
        //basic swap
        String temp = x;
        x=y;
        y=temp;
        


        System.out.println("this is x: "+x+"This is y:"+y);
    }
    
}
