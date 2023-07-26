package src.Ono.week6;

import java.util.ArrayList;
import java.util.Arrays;

public class FindMax {
    public static void main(String[] args) {
        int[] numbers = {3,45,6,8,100};

        int maxNum = findMax(numbers);
        System.out.println(maxNum);
    }

    public static int findMax(int[] numbers){

        int max = numbers[0];
        for (int i = 1; i <numbers.length ; i++) {
            if(numbers[i]> max){
                max = numbers[i];
            }
        }

        return max;
    }
}
/*
Write a method that can find the maximum number from an int Array
 Ex:  int[] arr = {99, 12, 23, 32, 44, 57, 6} ==> 99
 */