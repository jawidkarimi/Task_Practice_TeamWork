package src.khalil;

public class Khalil_FINRA {

    public static void main(String[] args) {

        finra(100);
    }

    public static void finra(int number) {
        String result = "";
        for (int i = 1; i <= number; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                result = "FINRA";
            } else if (i % 5 == 0) {
                result = "RA";
            } else if (i % 3 == 0) {
                result = "FIN";
            } else {
                result = "" + i;
            }
            System.out.print("-" + result);
        }
    }
}