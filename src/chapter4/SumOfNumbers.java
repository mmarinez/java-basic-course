package chapter4;

import java.util.Scanner;

public class SumOfNumbers {
    public static void main(String[] args) {
        // Set known values
        boolean restart = false;

        System.out.println("---------------");
        System.out.println("Sum two numbers");
        System.out.println("---------------");
        // Setup do while action and condition
        do {
            System.out.println("Enter the first number");
            Scanner scanner = new Scanner(System.in);
            double number1 = scanner.nextDouble();

            System.out.println("Enter the second number");
            double number2 = scanner.nextDouble();

            double sumResult = number1 + number2;

            System.out.println("The result is: " + sumResult);
            System.out.println("Would you like to sum again? Yes/No");
            String answer = scanner.next().toLowerCase();

            switch (answer){
                case "yes"
                        -> restart = true;
                case "no"
                        -> restart = false;
            }
            scanner.close();

        }while (restart);


    }
}
