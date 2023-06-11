package src.milgin46.week4;

public class RemoveDuplicates {

    public static void main(String[] args) {
        String str = "AAABBCDD";

        System.out.println(removeDuplicate(str));
    }

    public static String removeDuplicate(String str) {
        String result = "";

            for (int i = 0; i < str.length(); i++) {
                if (i == 0 || str.charAt(i) != str.charAt(i - 1)) {
                    result += str.charAt(i);
                }
            }

        return result;

    }
}


/*
Write a return method that can remove the duplicated values from the String
  Ex: removeDup("AAABBBCCC") ==> ABC
 */