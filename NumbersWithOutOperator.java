public class NumbersWithOutOperator {
    public static void numBers(int num1,int num2) {

        int result = 0;

        while(num1>=num2){
            num1=num1-num2;
            result++;
        }
        System.out.println(result);
    }

    public static void main(String[] args) {
        numBers(10,2);
    }
}
