
package src.milgin46.week2;

import java.util.Scanner;

public class SwapNumbers {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a: ");
        int a = scan.nextInt();
        System.out.println("Enter b: ");
        int b = scan.nextInt();
        System.out.println("Before swap a is:" + a + " - b is: " + b);

        a = a + b;
        b = a - b; //  a + b - b
        a = a - b; // a + b - a


        System.out.println(a);
        System.out.println(b);

        System.out.println("After swap a is: " + a + " - b is: " + b);

    }
}
/*
1️⃣ Numbers -- Swap Numbers
Swap two variable values without using a third variable
 */