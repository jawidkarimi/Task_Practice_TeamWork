package JawidKarimi;

public class UniqueCharacters {

    public static void main(String[] args) {

        System.out.println(uniqueChars("aabcd"));

    }

    public static String uniqueChars(String str) {

        String unique = ""; //example aabcd

        for (int i = 0; i < str.length(); i++) {
            char each = str.charAt(i); //

            if (str.indexOf(each) == str.lastIndexOf(each)) {
                unique += each;
            }

        }

        return unique;
    }

    public static String findUniqueChars(String str) {
        String uniqueChars = "";

        for (int i = 0; i < str.length(); i++) {
            char currentChar = str.charAt(i);
            boolean isUnique = true;

            for (int j = 0; j < str.length(); j++) {
                if (i != j && currentChar == str.charAt(j)) {
                    isUnique = false;
                    break;
                }
            }

            if (isUnique) {
                uniqueChars += currentChar;
            }
        }

        return uniqueChars;
    }

}


