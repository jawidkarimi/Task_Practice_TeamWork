package src.bonnie;

public class WithoutDivisionOperator {

    public static void main(String[] args) {

        withoutDivision(20, 4);


    }

    public static void withoutDivision(int num1, int num2) {

        int count = 0;

        while (num1 >= num2) {
            num1 -= num2;
            count++;

        }

        int remainder = num1;

        System.out.println("total = " + count);
        System.out.println("remainder = " + remainder);


    }
}
