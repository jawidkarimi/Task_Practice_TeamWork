package src.milgin46.week7;

import java.util.Arrays;

public class ArraySortAscending {

    public static void main(String[] args) {
        int[] arr = {10, 9, 8, 7};

        System.out.println("arrayAscending(arr) = " + Arrays.toString(arrayAscending(arr)));

    }

    public static int[] arrayAscending(int[] arr){

        Arrays.sort(arr);
        return arr;

    }


}


//2️⃣  Array_SortAscending
//Write a return method that can sort an int array in Ascending order without using the sort method of the Arrays class
//Ex: int[] arr = {10, 9, 8, 7};
//arr = Sort(arr); ==>{ 7, 8, 9, 10};