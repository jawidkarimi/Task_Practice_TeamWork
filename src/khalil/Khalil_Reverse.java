package src.khalil;

public class Khalil_Reverse {

    public static void main (String[] args) {

        String str= "Khalil", rstr="";
        char ch;

        System.out.print("Original word: ");
        System.out.println(str); //Example word

        for (int i=0; i<str.length(); i++)
        {
            ch= str.charAt(i); //extracts each character
            rstr= ch+rstr; //adds each character in front of the existing string
        }
        System.out.println("Reversed word: "+ rstr);
    }

}
