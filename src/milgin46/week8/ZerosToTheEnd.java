package src.milgin46.week8;

import java.util.Arrays;

public class ZerosToTheEnd {


    public static void main(String[] args) {
        int[] arr = {1, 0, 2, 0, 3, 0, 4, 0};
        moveZerosToEnd(arr);
        System.out.println("Output: " + java.util.Arrays.toString(arr));
    }

    public static int[] moveZerosToEnd(int[] arr) {
        int count = 0;

        for (int num : arr) {
            if (num != 0) {
                arr[count++] = num;
            }
        }

        while (count < arr.length) {
            arr[count++] = 0;
        }

        return arr;
    }


}

//Write a method that can move all the zeros to last indexes of the array (Do Not Use Sort Method)
//  Example:
//    input; [1, 0, 2, 0, 3, 0, 4, 0]
//    output:[1, 2, 3, 4, 0, 0, 0, 0]


