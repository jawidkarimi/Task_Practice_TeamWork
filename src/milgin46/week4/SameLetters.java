package src.milgin46.week4;

import java.util.Arrays;

public class SameLetters {

    public static void main(String[] args) {

        System.out.println(sameLetters("abc", "cba"));
    }

    public static boolean sameLetters(String str1, String str2) {

        char[] chars1 = str1.toCharArray();
        char[] chars2 = str2.toCharArray();

        // Sort the character arrays
        Arrays.sort(chars1);
        Arrays.sort(chars2);

        // Compare the sorted arrays
        return Arrays.equals(chars1, chars2);
    }

}
/*
Write a return method that checks if a string is built out of the same letters as another string.
  Ex: same("abc", "cab"); ==> true
      same("abc", "abb"); ==> false
 */