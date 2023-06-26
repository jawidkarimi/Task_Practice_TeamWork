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

        /*
        1. Password MUST be at least have 6 characters and should not contain space
        2. PassWord should at least contain one upper-case letter
        3. PassWord should at least contain one lowercase letter
        4. Password should at least contain one special character
        5. Password should at least contain a digit
        */
        if (password.length() <= 6 || password.contains(" ")) {
            return false;
        }
        return true;
    }

}
