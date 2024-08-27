package chapter8;

import java.sql.Struct;
import java.util.Scanner;

public class PasswordComplexityValidator {
    public static void main(String[] args) {
        var userName = "mmarinez";
        var oldPassword = "chipotleTest56*";
        addNewPassword(userName, oldPassword );
    }

    private static String addNewPassword(String userName, String oldPassword) {
        System.out.println("Your password requires the following:\n" +
                "8 characters long.\n" +
                "1 uppercase letter.\n" +
                "1 special character.\n" +
                "not contain the username.\n" +
                "not the same as old password.\n");
        Scanner scanner = new Scanner(System.in);
        var newPassword = "";
        var validPassword = false;
        while(!validPassword){
            newPassword = scanner.next();
            validPassword = passwordValidator(newPassword, userName, oldPassword);
        }
        scanner.close();
        return newPassword;
    }


    private static Boolean passwordValidator(String newPassword, String userName, String oldPassword) {
        var passwordMinimumLength = 8;
        var validPassword = false;
        do {

            if(newPassword.length() < passwordMinimumLength) {
                System.out.format("Your password has less than %d characters. Please try again.", passwordMinimumLength);
                break;
            }

            if(newPassword.equals(oldPassword)) {
                System.out.println("Your new password can't be the same as old password. Please try again.");
                break;
            }

            if(newPassword.contains(userName)) {
                System.out.println("Your password can't contain your username. Please try again.");
                break;
            }

            var upperCase = hasUppercase(newPassword);

            if(!upperCase) {
                System.out.println("Your password requires at least one character upper case. Please try again.");
                break;
            }

            var specialCharacter = hasSpecialCharater(newPassword);

            if(!specialCharacter) {
                System.out.println("Your password requires at least one special character. Please try again.");
                break;
            }

            validPassword = true;

        }while (!validPassword);
        return validPassword;
    }

    private static Boolean hasSpecialCharater(String newPassword) {
        for (int i=0; i<newPassword.length(); i++){
            if (!Character.isAlphabetic(newPassword.charAt(i)))
                return true;

        }
        return false;
    }

    private static Boolean hasUppercase(String newPassword) {
        for (int i= 0; i<newPassword.length(); i++) {
            if (Character.isUpperCase(newPassword.charAt(i)))
                return true;
        }
        return false;
    }


}
