package src.Naizhati;

public class PrintNumber {

    public static void main(String[] args) {

        // Write a method that can check if a number is prime or not

       int number = 1;

       if (isPrime(number)){
           System.out.println(number + " is a prime number");
       }else {
           System.err.println(number + " is not a prime number");
       }

    }

    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }

        for (int i = 2; i <= number / 2; i++) {
            if (number % i == 0) {
                return false;
            }
        }

        return true;
    }

}
