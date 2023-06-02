package src.mohamed;

public class Swap2Numbers {
// Swap two numbers value without using third number.
        public static void main(String[] args) {
            int a = 5;
            int b = 10;

            System.out.println("Before swapping: a = " + a + ", b = " + b);

            a = a + b;
            b = a - b;
            a = a - b;

            System.out.println("After swapping: a = " + a + ", b = " + b);
        }
    }




