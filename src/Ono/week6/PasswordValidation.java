package src.Ono.week6;

public class PasswordValidation {

    //1. Write a return method that can verify if a password is valid or not.
    //-Requirements:
    //1. Password MUST be at least have 6 characters and should not contain space
    //2. PassWord should at least contain one upper-case letter
    //3. PassWord should at least contain one lowercase letter
    //4. Password should at least contain one special character
    //5. Password should at least contain a digit
    //-if all requirements above are met, the method returns true, otherwise returns  false

    public static void main(String[] args) {

        String password = "Cydeo123!@";
        System.out.println(passwordValidation(password));
    }

    public static boolean passwordValidation(String password) {

        int uppercase = 0, lowercase = 0, digits = 0, special = 0;
        char ch;


        if (password.length() < 6 || password.contains(" ")) {
            return false;
        }

        for (int i = 0; i < password.length(); i++) {
            ch = password.charAt(i);

            if (Character.isUpperCase(ch))
                uppercase = 1;
            else if (Character.isLowerCase(ch))
                lowercase = 1;
            else if (Character.isDigit(ch))
                digits = 1;
            else
                special = 1;

        }


        if (uppercase == 1 && lowercase == 1 && digits == 1 && special == 1) {
            return true;
        }

        return false;
    }

}
