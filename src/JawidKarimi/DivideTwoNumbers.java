package JawidKarimi;

public class DivideTwoNumbers {

    public static void main(String[] args) {

        divideWithoutOperator(46,5);

    }

    public static void divideWithoutOperator(int number1, int number2){

        int count = 0;
        while (number1 >= number2) {
            number1 -= number2;
            count++;
        }
        System.out.println(count+" with a remainder of "+number1);
    }
}

/*
Write a method that can divide two numbers without using division operator
 */