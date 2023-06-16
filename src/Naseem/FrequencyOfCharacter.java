package src.Naseem;

import java.util.Arrays;
import java.util.Collections;

public class FrequencyOfCharacter {

    public static void frequencyOfCharacter(String str){

        String result = "";

        for(String each: str.split( "")){
            int frequency =  Collections.frequency( Arrays.asList(str.split( "")),each);

            if (!result.contains(each)){
                result+= each +frequency;
            }
        }

        System.out.println(result);

    }

    public static void main(String[] args) {
        frequencyOfCharacter("AAABBCDD");
    }


}







