package JawidKarimi;

public class removeDuplicates {

    public static void main(String[] args) {

        System.out.println(removeDup("aabcdd"));

    }

    /**
     * remove duplicates
     * @param str
     * @return
     */
    public static String removeDup(String str){
        String result = "";

        for (int i = 0; i < str.length(); i++) {
            char each = str.charAt(i);

            if(!result.contains(""+each)) {
                result += each;
            }
        }
        return result;
    }
}
