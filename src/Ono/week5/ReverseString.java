package src.Ono.week5;

public class ReverseString {

    public static void main(String[] args) {
        reverseString("ABCD");
    }
    public static void reverseString(String str){

        String result = "";

        for (int i = str.length()-1; i >=0 ; i--) {

            result+= str.charAt(i);
        }
        System.out.println(result);
    }
}
/*
Write a function that can reverse a String
 Ex: Reverse("ABCD"); ==> DCBA
 */