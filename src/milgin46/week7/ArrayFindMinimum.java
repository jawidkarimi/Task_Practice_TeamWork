package src.milgin46.week7;

public class ArrayFindMinimum {

    public static void main(String[] args) {
        int[] arr = {99, 12, 23, 32, 44, 57, 6};

        System.out.println("findMin(arr) = " + findMin(arr));


    }

    public static int findMin(int[] arr) {
        if (arr.length == 0) {
            throw new IllegalArgumentException("Array is empty");
        }
        int min = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
            return min;

    }
}



//1️⃣  Array_FindMinimum
//Write a method that can find the minimum number from an int Array
//Ex:  int[] arr = {99, 12, 23, 32, 44, 57, 6} ==> 6

