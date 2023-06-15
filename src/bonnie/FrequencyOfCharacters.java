package src.bonnie;

public class FrequencyOfCharacters {

    //Write a return method that can find the frequency of characters
    //  Ex: frequencyOfChars("AAABBCDD") ==> A3B2C1D2

    public static void main(String[] args) {

        frequencyOfCharacters("AAABBCDD");

    }

    public static void frequencyOfCharacters(String str) {

        String result = "";

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            int count = 0;

            for (int k = 0; k < str.length(); k++) {
                if (str.charAt(k) == ch) {
                    count++;
                }
            }
            if (result.contains("" + ch)) {
                continue;
            }
            result += ch + "" + count;
        }

        System.out.println(result);


    }
}
