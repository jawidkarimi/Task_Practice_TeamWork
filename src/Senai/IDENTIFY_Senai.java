package src.Senai;

public class IDENTIFY_Senai {
    public static void main(String[] args) {
        identify(8);
        identify(7);
        identify(11);


    }
    public static void  identify(int number) {
        if (number % 2 == 0) {
            System.out.println("Even");
        } else if(number%2!=0) {
            System.out.println("Odd");
        }else{
            System.out.println("Zero");
        }

    }
    // if statements added

}
