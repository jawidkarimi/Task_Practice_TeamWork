package src.Senai.week_3_Java_Coding_Task;

public class FrequencyOfChars {
    public static void main(String[] args) {

        String str = "AAABBCDD";
        String result = "";

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            int count =0;

            for (int j = 0; j < str.length(); j++) {
                char ch1 = str.charAt(j);

                if(ch==ch1){
                    count++;
                }

           }
            if(result.contains(ch + "")){
                continue;

            }
            result+=ch;
            result+=count;
        }
        System.out.println(result);

    }

}
/*
3) String - Frequency of Characters
Write a return method that can find the frequency of characters
Ex:  FrequencyOfChars("AAABBCDD") ==> A3B2C1D2**
 */