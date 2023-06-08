
package src.milgin46.week3;

public class PrimeNumber {

    public static void main(String[] args) {
        System.out.println(primenumber(19));

        System.out.println(primenumber(25));

        System.out.println(primenumber(125));

        System.out.println(primenumber(197));

        System.out.println(primenumber(1234));

        System.out.println(primenumber(97));

    }

    public static String primenumber(int n) {
        String pr = "";



            if (n <= 1) {
                return "not a prime";
            } // 0 & 1 are not prime numbers

            for (int i = 2; i < n ; i++) { // if any number doesnt include a number from 2 until the number itself minus 1 then it is prime
                if (n % i == 0) {
                    return "not a prime";
                }
            }

            return "a prime";
        }


    }

/*

1️⃣ Numbers -- PrimeNumber
Write a method that can check if a number is prime or not



 */