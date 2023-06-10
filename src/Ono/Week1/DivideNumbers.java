package src.Ono.Week1;

public class DivideNumbers {

    public static void main(String[] args) {

        divideTwoNums(20,6);

    }

    public static void divideTwoNums(int num1, int num2){

        int count = 0;
        while (num1 > num2){
            num1 -= num2;
            count++;
        }
        System.out.println(count);
    }
}
/*
Write a method that can divide two numbers without division operator
 */