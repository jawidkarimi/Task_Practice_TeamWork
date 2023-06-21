package src.milgin46.week5;

import java.util.ArrayList;
import java.util.List;

public class Reverse {


    //2️⃣  String -- Reverse
    //Write a function that can reverse a String
    // Ex: Reverse("ABCD"); ==> DCBA
    public static void main(String[] args) {
        String str = "ABCD";
        System.out.println(reverse(str));
    }

    public static String reverse(String str){
        String reversed = "";

        for (int i = str.length()-1; i >=0 ; i--) {
            reversed += str.charAt(i);
        }
        return reversed;

    }



}
//updated