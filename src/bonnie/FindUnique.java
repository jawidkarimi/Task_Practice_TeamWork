package src.bonnie;

public class FindUnique {


    public static void main(String[] args) {

        findUniqueCharacters("AAABBBCCCDEF");

    }

    public static void findUniqueCharacters(String str) {

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            int count = 0;

            for (int j = 0; j < str.length(); j++) {

                if (str.charAt(j) == ch) {
                    count++;
                }

            }

            String result = "";

            if (count == 1) {
                result += ch;

                System.out.print(result);
            }


        }
    }
}
