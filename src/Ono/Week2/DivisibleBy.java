package src.Ono.Week2;

public class DivisibleBy {
        public static void main(String[] args) {

            String DivisibleBy15= "";
            String DivisibleBy5 = "";
            String DivisibleBy3 = "";

            int [] array= new int[100];
            for (int i = 0; i < array.length; i++)
                array[i] = i+1;

            for (int each:array) {
                if (each %15 ==0)
                    DivisibleBy15 += each+" ";
                if (each% 5== 0 && each%15 !=0)
                    DivisibleBy5 += each+" ";
                if (each %3==0 && each %15 !=0)
                    DivisibleBy3 += each + " ";
            }
            System.out.println("DivisibleBy15 = " + DivisibleBy15);
            System.out.println("DivisibleBy5 = " + DivisibleBy5);
            System.out.println("DivisibleBy3 = " + DivisibleBy3);
        }

}
  /*
Numbers -- Divisible by 3, 5, 15
Write a program that can print the numbers between 1 ~ 100 that can be divisible by 3, 5, and 15.
-if the number can be divisible by 3, 5 and 15, then it should only be displayed in DivisibelBy15 section
-if the number can be divisible by 3 but cannot be divisible by 15, then it should only be displayed in DivisibelBy3 section
-if the number can be divisible by 5 but cannot be divisible by 15, then it should only be displayed in DivisibelBy5 section
ex:
OutPut:
Divisible By 15 15 30 45 60 75 90
Divisible By 5 5 10 20 25 35 40 50 55 65 70 80 85 95 100
Divisible By 3 3 6 9 12 18 21 24 27 33 36 39 42 48 51 54 57 63 66 69 72 78 81 84 87 93 96 99
 */