package src.milgin46.week6;

public class SumOfDigits {


    public static void main(String[] args) {
        String str = "12 java 5 apple 3";
        int sum = sumOfDigits(str);
        System.out.println("Sum of digits: " + sum);
    }

    public static int sumOfDigits(String str) {
        int sum = 0;
        String[] numbers = str.split("\\D+");

        for (String number : numbers) {
            if (!number.isEmpty()) {
                sum += Integer.parseInt(number);
            }
        }
        return sum;
    }



}
//Write a method that can return the sum of the digits in a String
//Ex:  "12 java 5 apple 3"  ==>  20
