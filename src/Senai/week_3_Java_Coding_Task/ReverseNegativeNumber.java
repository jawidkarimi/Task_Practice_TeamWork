package src.Senai.week_3_Java_Coding_Task;

public class ReverseNegativeNumber {

    public static void main(String[] args) {

        String num = "-35";
        String reverse = "";

        for (int i = num.length()-1; i >= 1; i--) {

            char ch = num.charAt(i);


            reverse+= ""+ch ;
        }
        System.out.println("-"+reverse);

    }

}
/*
 Numbers -- Reverse Negative Number
Write a return method that can reverse digits of a negative number and return it as int
input: -35  output: -53

 */