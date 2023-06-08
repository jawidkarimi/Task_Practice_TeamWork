package JawidKarimi;

public class SwapWithTemVariable {
    public static void main(String[] args) {

        int x = 10;
        int y = 15;
        // swap with temp variable

        int temp = x;
        x= y;
        y= temp;

        System.out.println("x = " + x);
        System.out.println("y = " + y);
    }
}