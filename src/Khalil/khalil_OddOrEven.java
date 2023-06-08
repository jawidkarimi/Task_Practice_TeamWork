package src.Khalil;

public class khalil_OddOrEven {

    public static void main(String[] args) {

        OddOrEven(7);
    }

    public static void OddOrEven(int number){
        if (number % 2 == 0) {
            System.out.println(number + " is even number");
        } else {
            System.out.println(number + " is odd number");
        }
    }
}
