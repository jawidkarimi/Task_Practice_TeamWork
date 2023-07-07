package src.milgin46.week6;

public class PasswordValidation {

    public static void main(String[] args) {
        String password = "CydeoClassB29!!!";

        System.out.println(PassCheck(password) ? "Password passed the check: " + password : "Password did not pass the check");

    }

public static boolean PassCheck(String pass){

    boolean hasLength = pass.length() >= 6;
    boolean noSpaces = !pass.contains(" ");
    boolean hasUpperCase = !pass.equals(pass.toLowerCase());
    boolean hasLowerCase = !pass.equals(pass.toUpperCase());
    boolean hasDigit = pass.matches(".*\\d.*");
    boolean hasSpecialChar = pass.matches(".*[@#$%^&+=!:-].*");

    return hasLength && noSpaces && hasUpperCase && hasLowerCase && hasDigit && hasSpecialChar;
}

}
// String_PasswordValidation
//1. Write a return method that can verify if a password is valid or not.
//-Requirements:
//1. Password MUST be at least have 6 characters and should not contain space
//2. PassWord should at least contain one upper-case letter
//3. PassWord should at least contain one lowercase letter
//4. Password should at least contain one special character
//5. Password should at least contain a digit
//-if all requirements above are met, the method returns true, otherwise returns  false