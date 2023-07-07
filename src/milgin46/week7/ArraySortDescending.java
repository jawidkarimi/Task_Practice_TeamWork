package src.milgin46.week7;

import java.util.Arrays;

public class ArraySortDescending {
    public static void main(String[] args) {
        int[] arr = {10, 9, 8, 7};

        System.out.println("arrayAscending(arr) = " + Arrays.toString(arrayDescending(arr)));

    }

    public static int[] arrayDescending(int[] arr){

        Arrays.sort(arr);

        int[] arrReversed = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            arrReversed[i] = arr[arr.length - 1 - i];
        }

        return arrReversed;

    }


}

//3️⃣ Array_SortDescending
//Write a return method that can sort an int array in descending order without using the sort method of the Arrays class
//Ex: int[] arr = {10,20,7, 8, 90};
//arr = Sort(arr); ==> {90, 20, 10, 8, 7};

