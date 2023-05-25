package src.Senai;

public class FINRA_Senai {
    public static void printFINRA(int num){

        for ( int i = 1; i <= num; i++) {    // 1 ---30
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FINRA");
            } else if (i % 3 == 0) {
                System.out.println("FIN");
            } else if (i % 5 == 0) {
                System.out.println("RA");
            } else {
                System.out.println(i);
            }

        }

    }

    public static void main(String[] args) {
        printFINRA(5);
    }

}
