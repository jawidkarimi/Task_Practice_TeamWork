package JawidKarimi;

import java.util.Arrays;

public class SameLettersChecker {
    public static void main(String[] args) {

        System.out.println(sameLetters("abc", "cba")); // Output: true
        System.out.println(sameLetters("cda", "cdb")); // Output: false

        System.out.println("---------------- second Method -----------------");

        System.out.println(sameLetters2("abc", "cba"));
        System.out.println(sameLetters2("cda", "cdb"));
    }


    /**
     * Same letters Method
     * @param str1
     * @param str2
     * @return
     */
    public static boolean sameLetters(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }

        char[] arr1 = str1.toCharArray();
        char[] arr2 = str2.toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        return Arrays.equals(arr1, arr2);
    }

    /**
     * next solution for the sameLetters Method
     * @param str1
     * @param str2
     * @return
     */
    public static boolean sameLetters2(String str1, String str2) {
        String newChars = "";
        if(str1.length()!=str2.length()){
            return false;
        }
        for (int i = 0; i < str1.length(); i++) {
            char ch = str1.charAt(i);
            for (int j = 0; j < str2.length(); j++) {
                if (ch == str2.charAt(j)) {
                    newChars += ch;
                    break;
                }
            }
        }

        return newChars.equals(str1);
    }

}