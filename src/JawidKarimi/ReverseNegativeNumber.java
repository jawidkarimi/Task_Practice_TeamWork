package JawidKarimi;

public class ReverseNegativeNumber {

    public static void main(String[] args) {
        int num = -35;
        int reversedNum = reverseNegativeNumber(num);
        System.out.println(reversedNum);

    }

    public static int reverseNegativeNumber(int negativeNumber) {

            int positiveNum = -1 * negativeNumber;
            int reversedNum = 0;
            while (positiveNum > 0) {
                reversedNum = reversedNum * 10 + positiveNum % 10;
                positiveNum /= 10;
            }
            reversedNum = -1 * reversedNum;
            return reversedNum;
        }
    }
/*
Numbers -- Reverse Negative Number
Write a return method that can reverse digits of a negative number and return it as int
input: -35  output: -53
 */