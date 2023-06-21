package src.Senai.week_3_Java_Coding_Task;

public class PrimeNumbers {

    public static void main(String[] args) {

        primeNum(35);

    }

     public static void primeNum(int num) {
         for (int i = 1; i <= num; i++) {
           int  count = 0;
             for (int j = 2; j <= i / 2; j++) {
                 if (i % j == 0) {
                     count++;
                     break;
                 }
             }

             if (count == 0) {
                 System.out.println(i);
             }
         }
     }
    }


/*
Numbers -- PrimeNumber
Write a method that can check if a number is prime or not
 */