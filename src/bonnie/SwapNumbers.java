package src.bonnie;

public class SwapNumbers {

    public static void main(String[] args) {

        SwapNumbers(20, 10);


    }

    public static void SwapNumbers(int x, int y) {

        x = x + y;
        y = x - y;
        x = x - y;

        System.out.println("x = " + x);
        System.out.println("y = " + y);


    }


}
