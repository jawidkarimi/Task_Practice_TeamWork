package src.Ono.week7;

import java.util.Arrays;

public class Array_SortAscending {

    public static void main(String[] args) {
        int[] arr = {10, 9, 8, 7};
        int[] sortedArray = sortArray(arr);
        System.out.println(Arrays.toString(sortedArray));

    }

    public static int[] sortArray(int[] array) {

        int temp;

        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    // Swap array[j] and array[j+1]
                    temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }

        return array;

    }
}
