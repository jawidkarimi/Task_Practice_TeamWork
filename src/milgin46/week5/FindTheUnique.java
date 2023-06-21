package src.milgin46.week5;

public class FindTheUnique {

    public static void main(String[] args) {

        String str = "AAABBBCCCDEF";
        System.out.println(findUnique(str));
        //  String - Find the unique
        //Write a return method that can find the unique characters from the String
        // Ex: unique("AAABBBCCCDEF") ==> "DEF";
        //
    }

    public static String findUnique(String str) {
        String result = "";

        for (int i = 0; i < str.length(); i++) {
            char currentChar = str.charAt(i);
            if (str.indexOf(currentChar) == str.lastIndexOf(currentChar)) {
                result += currentChar;
            }



        }
        return result;
    }
}
//update