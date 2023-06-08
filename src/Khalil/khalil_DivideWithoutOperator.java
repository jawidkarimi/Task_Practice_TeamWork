package src.Khalil;

public class khalil_DivideWithoutOperator {

    public static void numbers(int num1,int num2) {

        int result = 0;

        while(num1>=num2){
            num1=num1-num2;
            result++;
        }
        System.out.println(result);
    }

    public static void main(String[] args) {
        numbers(9,8);
    }
}
