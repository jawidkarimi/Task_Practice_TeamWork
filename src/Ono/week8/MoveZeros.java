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
/*
The method starts by initializing a variable index to keep track of the current position where non-zero elements should be placed. We iterate over the array, and for each non-zero element, we assign it to the current index position and increment index. This step effectively moves all non-zero elements to the beginning of the array.

After moving all non-zero elements, we fill the remaining elements of the array from the index position onwards with zeros, ensuring that all zeros are moved to the last indexes of the array.
 */