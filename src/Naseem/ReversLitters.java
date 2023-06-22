package src.Naseem;

public class ReversLitters {

    public static String revers(String str){

        String revers = "";
        for (int i = str.length()-1; i >= 0 ; i--) {

            revers += str.charAt(i);
        }
        return revers;
    }


    public static void main(String[] args) {
        System.out.println(revers("ABCD"));
    }

// write function that can revers a string EX Reverse("ABCD"); to DCBA





}
