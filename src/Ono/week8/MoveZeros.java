package src.Ono.week8;

import java.util.Arrays;

public class MoveZeros {
    public static void moveZerosToEnd(int[] arr) {
        int n = arr.length;
        int index = 0;

        // Move all non-zero elements to the beginning of the array
        for (int i = 0; i < n; i++) {
            if (arr[i] != 0) {
                arr[index] = arr[i];
                index++;
            }
        }

        // Fill the remaining elements with zeros
        while (index < n) {
            arr[index] = 0;
            index++;
        }
    }

    public static void main(String[] args) {
        int[] arr = { 1, 0, 2, 0, 3, 0, 4, 0};
        System.out.println("Original array: " + Arrays.toString(arr));

        moveZerosToEnd(arr);

        System.out.println("Array with zeros moved to the end: " + Arrays.toString(arr));
    }


}
