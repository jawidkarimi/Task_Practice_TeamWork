package src.milgin46.week4;

public class FrequencyOfCharacters {

    public static void main(String[] args) {
        String str = "AAABBCDD";
        System.out.println(frequencyOfChars(str));
    }

    public static String frequencyOfChars(String str) {
        String result = "";

        int count = 1;

        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) == str.charAt(i - 1)) {
                count++;
            } else {
                result += str.charAt(i - 1) + "" + count;
                count = 1;
            }
        }

        // Add the last character and its count to the result
        result += str.charAt(str.length() - 1) + "" + count;

        return result;
    }
}
/*
Write a return method that can find the frequency of characters
  Ex: frequencyOfChars("AAABBCDD") ==> A3B2C1D2
 */