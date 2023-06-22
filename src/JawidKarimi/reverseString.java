package JawidKarimi;

import java.util.Stack;

public class reverseString {

    public static void main(String[] args) {

        System.out.println(reverse("abcd"));
        System.out.println(reverse2("abcd"));
    }

    public static String reverse(String str){
        String reverse = "";

        for(int i = str.length() - 1 ; i >= 0; i-- ){
            reverse += str.charAt(i);
        }
        return reverse;
    }

    public static String reverse2(String inputString) {

        Stack<Character> stack = new Stack<>();
        char[] charArray = inputString.toCharArray();

        for (char eachChar : charArray) {
            stack.push(eachChar);
        }
        String reversed = "";
        while (!stack.isEmpty()) {
            char each = stack.pop();
            reversed +=each;
        }
        return reversed;
    }
}
