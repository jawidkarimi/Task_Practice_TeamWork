package src.milgin46.week8;

import java.util.Arrays;

public class NSumZero {

    public static void main(String[] args) {
        int n = 4;
        int[] arr = generateNSumZeroArray(n);
        System.out.println("Output: " + Arrays.toString(arr));
    }


        public static int[] generateNSumZeroArray(int n) {
            int[] arr = new int[n];

            for (int i = 0; i < n - 1; i++) {
                arr[i] = i + 1;
                arr[n - 1] -= i + 1;
            }

            return arr;
        }


}

//Write a function that given an integer N (1 < N < 100), returns an array containing N unique integers that sum up to 0. The function can return any such array.
//  Example 1:
//    N = 4 => the function could return [1, 0, -3, 2] or [-2, 1, -4, 5].
//
//    The answer [1, -1, 1, 3] would be incorrect (because value 1 occurs twice).
//
//  Example 2:
//    N = 3 => one of the possible answers is [-1, 0, 1] (but there are many more correct answers).


