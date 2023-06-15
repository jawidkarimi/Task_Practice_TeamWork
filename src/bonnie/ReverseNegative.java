package src.bonnie;

public class ReverseNegative {

    public static void main(String[] args) {

        System.out.println(reverseNegative(-12));
    }


    public static int reverseNegative(int num) {

        int reverse = 0;

        while (num != 0) {
            reverse = (reverse * 10) + num % 10;
            num /= 10;
        }
        return reverse;
    }


}
