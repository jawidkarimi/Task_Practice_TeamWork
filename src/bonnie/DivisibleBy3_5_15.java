package src.bonnie;

public class DivisibleBy3_5_15 {

    public static void main(String[] args) {

        Divisible(100);
    }

    public static void Divisible(int num){

        String divisible3 = "";
        String divisible5 = "";
        String divisible15 = "";

        for (int i = 1; i <= num; i++) {

            if (i % 15 == 0) {
                divisible15 += i+ " ";
            }else if (i % 5 == 0) {
                divisible5 += i + " ";
            }else if (i % 3 == 0) {
                divisible3 += i + " ";
            }

        }


        System.out.println("Divisible by 15 = " + divisible15);
        System.out.println("Divisible by 5 = " + divisible5);
        System.out.println("Divisible by 3 = " + divisible3);
    }
}
