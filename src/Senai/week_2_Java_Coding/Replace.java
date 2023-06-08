package src.Senai.week_2_Java_Coding;

public class Replace {
    public static void main(String[] args) {
        String str = "adootroo65go";
        int count = 0;

        for (int i = 0; i < str.length()-1; i++) {
            char word = str.charAt(i);

            if(word=='o'){
              count++;
            }
        }
        System.out.println(count);
    }

}
