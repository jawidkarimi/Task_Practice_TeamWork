package src.milgin46.week1;

import java.util.Scanner;

public class Divider {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter the number a and number b to see the result a / b");
        int a = scan.nextInt();
        int b = scan.nextInt();
        int result = Divider(a, b);

        System.out.println("Result: " + result);

    }

    public static int Divider(int a, int b){
      int c = 0;

      while( a >= b){
          a -= b;
          c++;
      }
        return c;
    }


    }


