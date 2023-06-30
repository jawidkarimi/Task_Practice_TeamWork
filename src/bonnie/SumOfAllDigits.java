package src.bonnie;

public class SumOfAllDigits {

    //Write a method that can return the sum of the digits in a String
    //Ex:  "12 java 5 apple 3"  ==>  20

    public static void main(String[] args) {

        String str = "12 java 5 apple 3";
        System.out.println("Sum of digits: " + sumOfDigits(str));
    }

    public static int sumOfDigits(String str) {

        String temp = "0";

        int sum = 0;

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (Character.isDigit(ch))
                temp += ch;

            else {
                sum += Integer.parseInt(temp);

                temp = "0";
            }
        }

        return sum + Integer.parseInt(temp);

    }

}
