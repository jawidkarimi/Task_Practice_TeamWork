package src.bonnie;

import java.util.Arrays;

public class SameLetters {

    //Write a return method that checks if a string is built out of the same letters as another string.
    //  Ex: same("abc", "cab"); ==> true
    //      same("abc", "abb"); ==> false

    public static void main(String[] args) {

        System.out.println(sameLetters("abc", "cab"));

    }

    public static boolean sameLetters(String str1, String str2){

        char[] firstStr = str1.toCharArray();
        char[] secondStr = str2.toCharArray();

        Arrays.sort(firstStr);
        Arrays.sort(secondStr);

        return Arrays.equals(firstStr, secondStr);
    }



}
