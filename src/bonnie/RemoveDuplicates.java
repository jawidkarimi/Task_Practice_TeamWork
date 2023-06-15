package src.bonnie;

public class RemoveDuplicates {

    //Write a return method that can remove the duplicated values from the String
    //  Ex: removeDup("AAABBBCCC") ==> ABC

    public static void main(String[] args) {

        removeDuplicates("AAABBBCCC");
    }

    public static void removeDuplicates(String str) {

        String result = "";

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (result.contains("" + ch)) {
                continue;
            }
            result += ch;
        }

        System.out.println(result);
    }
}
