package src.bonnie;

public class OddEven {

    public static void main(String[] args) {


        oddEven(20);


    }


    public static void oddEven(int num) {


        if (num <= 0) {
            throw new RuntimeException("Invalid number");
        } else if (num % 2 == 0) {
            System.out.println(num + " is even");
        } else {
            System.out.println(num + " is odd");
        }


    }
}
