package src.khalil;

import java.util.Scanner;

public class Khalil_StringPasswordValidation {

    public static void main(String[] args) {

        String password = "0";
        if (isValid(password)) {
            System.out.println("Valid Password");
        } else {
            System.out.println("Invalid Password");
        }
    }

    public static boolean isValid(String password) {
        //return true if and only if password:
        //1. have at least eight characters.
        //2. consists of only letters and digits.
        //3. must contain at least two digits.
        /*
        1. Password MUST be at least have 6 characters and should not contain space
        2. PassWord should at least contain one upper-case letter
        3. PassWord should at least contain one lowercase letter
        4. Password should at least contain one special character
        5. Password should at least contain a digit
        */
        if (password.length() <= 6) {
            return false;
        } else {
            char c;
            int count = 1;
            for (int i = 0; i < password.length() - 1; i++) {
                c = password.charAt(i);
                if (!Character.isLetterOrDigit(c)) {
                    return false;
                } else if (Character.isDigit(c)) {
                    count++;
                    if (count < 2)   {
                        return false;
                    }
                }
            }
        }
        return true;
    }

}
