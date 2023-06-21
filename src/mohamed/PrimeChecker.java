package phonix_java;

public class PrimeChecker {

    public static boolean isPrime(int number) {
        if (number <= 1) {

            return false;
        } else if (number <= 3) {
            return true;
        } else if (number % 2 == 0 || number % 3 == 0) {
            return false;
        }

        return true;
    }

    public static void main(String[] args) {
        int number = 2; // The number to check for primality

        if (isPrime(number)) {
            System.out.println(number + " is prime.");
        } else {
            System.out.println(number + " is not prime.");
        }
    }
}

