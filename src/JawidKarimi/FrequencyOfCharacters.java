package JawidKarimi;

public class FrequencyOfCharacters {

    public static void main(String[] args) {

        System.out.println(frequencyOfChar("aabcdeffd"));

    }

    /**
     * remove duplicate method
     * @param str
     * @return
     */
    public static String frequencyOfChar(String str){

        String result = "";

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i); // each character from string
            int count = 0;

            for (int j = 0; j < str.length(); j++) { //to find the frequency of each character
                char each = str.charAt(j); // each character of str
                if(ch == each){
                    count++;
                }
            }

            if(result.contains(""+ch)){
                continue;
            }

            result += ch;
            result += count;
        }


        return result;
    }

}
