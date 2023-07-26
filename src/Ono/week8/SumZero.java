package src.Ono.week8;


import java.util.Arrays;

public class SumZero {

    public static int[] generateSumZeroArray(int N) {
        int[] arr = new int[N];

        if (N % 2 == 1) {
            arr[0] = 0;
        }

        int counter = 1;
        for (int i = (N % 2 == 1 ? 1 : 0); i < N; i += 2) {
            arr[i] = counter;
            arr[i + 1] = -counter;
            counter++;
        }

        return arr;
    }

    public static void main(String[] args) {
        int N = 4;
        int[] arr = generateSumZeroArray(N);

        System.out.println("Generated array: " + Arrays.toString(arr));
    }

}
/*
The function starts by initializing an array arr of size N. If N is odd, it sets the first element of the array to 0. Then, it uses a counter variable to generate the remaining unique integers. We iterate over the array, starting from index 1 (if N is odd) or index 0 (if N is even), and assign counter and its negative counterpart to consecutive indices. We increment the counter by 1 in each iteration.
 */