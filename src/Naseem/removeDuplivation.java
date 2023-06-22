package src.Naseem;

public class removeDuplivation {

    public static void removeDuplicated(String str) {



        String result = "";

        for (int i = 0; i < str.length(); i++) {

            char each = (str.charAt(i));

            if (!result.contains("" + each)) {
                result += each;
            }

        }
        System.out.println(result);
    }

    public static void main(String[] args) {
        removeDuplicated( "AAABBBCCC");
    }
}






