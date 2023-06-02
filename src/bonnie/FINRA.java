package src.bonnie;

public class FINRA {

    public static void main(String[] args) {

        finra(30);

    }

    public static void finra(int num) {

        String result = "";

        for (int i = 1; i <= num; i++) {

            if (i % 3 == 0 && i % 5 == 0) {
                result += "FINRA ";
            } else if (i % 5 == 0) {
                result += "RA ";
            } else if (i % 3 == 0) {
                result += "FIN ";
            } else {
                result += i + " ";
            }

        }

        System.out.println(result);
    }
}
