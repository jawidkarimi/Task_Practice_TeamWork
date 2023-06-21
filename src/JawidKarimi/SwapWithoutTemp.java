package JawidKarimi;

public class SwapWithoutTemp {
    public static void main(String[] args) {

        int x = 10;
        int y = 15;
        //swap without temp variable
        x = x+y; //10+15 =25        here x is 25
        y= x-y;  //25-15 = 10 here y is 10
        x=x-y;   //25-10 = 15 here x is 15

        System.out.println("x: "+x);
        System.out.println("y: "+y);
    }
}
/*
Numbers -- Swap Numbers
Swap two variable values without using a third variable
 */