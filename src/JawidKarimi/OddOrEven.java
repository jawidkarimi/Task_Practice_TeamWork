package JawidKarimi;
import java.util.Scanner;

public class OddOrEven {

    public static void main(String[] args) {

        findOddOrEven(4);
    }

    public static void findOddOrEven(int number){
        if (number%2 == 0){
            System.out.println(number + " is even");
        }else{
            System.out.println(number + " is odd");
        }
    }
}
