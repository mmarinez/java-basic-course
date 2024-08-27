package chapter3;

import java.util.Scanner;

public class LogicalOperatorGame {
    public static void main(String[] args) {
        // Set up the coin variables
        int pesosDe25;
        int pesosDe50;
        int pesosDe100;
        int pesosDe200;
        int sumOfPesos;

        // Ask the user the amount of coins per variable
        System.out.println("Enter the amount of coins for 25 pesos:");
        Scanner scanner = new Scanner(System.in);
        pesosDe25 = scanner.nextInt();
        int sumOfPesosDe25 = pesosDe25 * 25;

        System.out.println("Enter the amount of coins for 50 pesos:");
        pesosDe50 = scanner.nextInt();
        int sumOfPesosDe50 = pesosDe50 * 50;

        System.out.println("Enter the amount of coins for 100 pesos:");
        pesosDe100 = scanner.nextInt();
        int sumOfPesosDe100 = pesosDe100 * 100;

        System.out.println("Enter the amount of coins for 200 pesos:");
        pesosDe200 = scanner.nextInt();
        int sumOfPesosDe200 = pesosDe200 * 200;

        // Sum the coin amounts
        sumOfPesos = sumOfPesosDe25 + sumOfPesosDe50 + sumOfPesosDe100 + sumOfPesosDe200;

        // Validate the sum

        if (sumOfPesos == 1000) {
            System.out.println("Congratz, you won the game!");
        } else if (sumOfPesos > 1000) {
            int sumOver = sumOfPesos - 1000;
            System.out.println("You lose! , you had " + sumOver + " over to the 1000 goal.");
        } else if (sumOfPesos < 1000) {
            int sumShort = 1000 - sumOfPesos;
            System.out.println("You lose! , you had " + sumShort + " short to the 1000 goal.");
        }
    }
}
