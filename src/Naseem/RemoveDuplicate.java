package src.Naseem;

public class RemoveDuplicate {


    public static void removeDuplicated() {

        String str = "AAABBBCCC";

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
        removeDuplicated();
    }

//...
}


















