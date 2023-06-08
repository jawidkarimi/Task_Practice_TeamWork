
package src.milgin46.week1;

import java.util.Scanner;

public class OddOrEven {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter an integer number(n) to identify whether it is an even or odd number:");
        int n = scan.nextInt();
        identify(n);
    }

    public static void identify(int n) {
        if (n % 2 == 0) {
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }
    }

}
