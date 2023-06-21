package phonix_java;

public class ReverseNegativeNumber {
    public static int reverseNegativeNumber(int num) {
        int reversed = 0;
        int sign = num < 0 ? -1 : 1;
        num = Math.abs(num);
        while (num > 0) {
            reversed = reversed * 10 + num % 10;
            num /= 10;
        }
        return reversed * sign;
    }


    public static void main(String[] args) {
        int num = -35;
        int reversed = reverseNegativeNumber(num);
        System.out.println(reversed);  // Output: -53
    }
}
