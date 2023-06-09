package JawidKarimi;

public class PrimeNumberChecker {
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
    
    public static void main(String[] args) {
        int number = 25;
        boolean isPrime = isPrime(number);
        System.out.println(isPrime);  // Output: true
    }
}