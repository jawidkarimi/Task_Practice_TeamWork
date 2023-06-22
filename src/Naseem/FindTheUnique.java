package src.Naseem;

public class FindTheUnique {

    public static String UniqueCharacters(String str) {


        String unique = "";

        for (int i = 0; i < str.length(); i++) {
            char each = str.charAt(i);

            if (str.indexOf(each) == str.lastIndexOf(each)) {
                unique += each;
            }

        }
        return unique;
    }

    public static void main(String[] args) {
        System.out.println(UniqueCharacters("AAABBBCCCDEF"));
    }

}

/*
Find the unique character AAABBBCCCDEF
 */





