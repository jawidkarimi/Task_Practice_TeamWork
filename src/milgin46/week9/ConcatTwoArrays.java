package src.milgin46.week9;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ConcatTwoArrays {



        public static <T> T[] concatenateArrays(T[] arr1, T[] arr2) {
            T[] result = Arrays.copyOf(arr1, arr1.length + arr2.length);
            System.arraycopy(arr2, 0, result, arr1.length, arr2.length);
            return result;
        }

        public static void main(String[] args) {
            Integer[] arr1 = {1, 2, 3};
            Integer[] arr2 = {4, 5, 6};

            Integer[] concatenatedArray = concatenateArrays(arr1, arr2);

            // Print the concatenated array
            for (Integer num : concatenatedArray) {
                System.out.print(num + " ");
            }

            System.out.println();

            String[] words1 = {"Hello", "World"};
            String[] words2 = {"Java", "Programming"};

            String[] concatenatedWords = concatenateArrays(words1, words2);

            // Print the concatenated array
            for (String word : concatenatedWords) {
                System.out.print(word + " ");
            }
        }
    }

//1) Array - Concat two arrays
//  Write a return method that can concate two arrays.
//
