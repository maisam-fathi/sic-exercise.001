package string;
/*
2. Write a program that checks a password for security.
Conditions:
-at least 8 characters
-at least 1 upper and lower case letter
-at least a number
-at least one special character

Output a specific error message for each error case, e.g. "You must use at least 8 characters"

Note: the following methods are required:
-password.length()
-password.contains
-Character.isUppercase()
-Character.isLowercase()
-Character.isDigit()
-Character.isLetterOrDigit()
 */

import java.util.Scanner;

public class PasswordChecks {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your password: ");
        String password = scanner.nextLine();

        boolean hasDigit = false;
        boolean hasUppercase = false;
        boolean hasLowercase = false;
        boolean hasSpecialChar = false;
        boolean isLength8 = password.length() >= 8;

        for (int i = 0 ; i < password.length(); i++){
            char c = password.charAt(i);

            if(Character.isDigit(c)){
                hasDigit = true;
            } else if (Character.isUpperCase(c)) {
                hasUppercase = true;
            } else if (Character.isLowerCase(c)) {
                hasLowercase = true;
            } else {
                hasSpecialChar = true;
            }
        }

        if (hasDigit && hasLowercase && hasUppercase && hasSpecialChar && isLength8){
            System.out.println("Password is correct!");
        }
        if (!hasDigit){
            System.out.println("No Digit!");
        }
        if (!hasLowercase){
            System.out.println("No Lowercase");
        }
        if (!hasUppercase){
            System.out.println("No Uppercase");
        }
        if (!hasSpecialChar){
            System.out.println("No Special Character!");
        }
        if (!isLength8){
            System.out.println("Should be min 8 character!");
        }
    }
}
