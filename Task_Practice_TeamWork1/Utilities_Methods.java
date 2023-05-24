package Task_Practice_TeamWork1;

public class Utilities_Methods {
    public static void main(String[] args) {
        int dividend = 20;
        int divisor = 5;

        Divider divider = new Divider();
        int quotient = divider.divide(dividend, divisor);
        System.out.println("Quotient: " + quotient);

        int number = 7;
        if (isEven(number)) {
            System.out.println(number + " is an even number.");
        } else {
            System.out.println(number + " is an odd number.");
        }

        printFINRA(30);
    }

    public static boolean isEven(int number) {
        return number % 2 == 0;
    }

    public static void printFINRA(int n) {
        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FINRA");
            } else if (i % 3 == 0) {
                System.out.println("FIN");
            } else if (i % 5 == 0) {
                System.out.println("RA");
            } else {
                System.out.println(i);
            }
        }
    }

    public static class Divider {
        public int divide(int dividend, int divisor) {
            // Check for division by zero
            if (divisor == 0) {
                throw new ArithmeticException("Cannot divide by zero");
            }

            // Check if dividend is zero
            if (dividend == 0) {
                return 0;
            }

            // Determine the sign of the result
            boolean isNegative = (dividend < 0 && divisor >= 0) || (dividend >= 0 && divisor < 0);


            // Convert dividend and divisor to positive
            dividend = Math.abs(dividend);
            divisor = Math.abs(divisor);

            // Perform the division
            int quotient = 0;
            while (dividend >= divisor) {
                dividend -= divisor;
                quotient++;
            }

            // Apply the sign to the result
            return isNegative ? -quotient : quotient;
        }
    }
}

