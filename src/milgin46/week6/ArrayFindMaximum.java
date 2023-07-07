package src.milgin46.week6;

import java.util.Arrays;

public class ArrayFindMaximum {

    public static void main(String[] args) {
        int[] arr = {99, 12, 23, 32, 44, 57, 6};
        int max = findMax(arr);
        int max2 = findMax2(arr);
        System.out.println("Maximum number: " + max);
        System.out.println("max2 = " + max2);
    }

    public static int findMax(int[] arr) {
        if (arr.length == 0) {
            throw new IllegalArgumentException("Array is empty");
        }
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    public static int findMax2(int[] arr) {
        Arrays.sort(arr);
        return arr[arr.length - 1];
    }


 }
//Write a method that can find the maximum number from an int Array
//Ex:  int[] arr = {99, 12, 23, 32, 44, 57, 6} ==> 99