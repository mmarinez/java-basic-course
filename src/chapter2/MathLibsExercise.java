package chapter2;

import java.util.Scanner;

public class MathLibsExercise {
    public static void main(String[] args) {
        // Get an adjective
        System.out.println("Enter an adjective:");
        Scanner scanner = new Scanner(System.in);
        String adjective = scanner.next();
        // Get a season of the year
        System.out.println("Enter a season of the year");
        String seasonOfTheYear = scanner.next();

        // Get a whole number
        System.out.println("Enter a whole number:");
        int wholeNumber = scanner.nextInt();
        scanner.close();

        // Print result
        System.out.format("On a %s %s day, I drink a minimum of %d cups of coffee.", adjective, seasonOfTheYear, wholeNumber);
    }
}
