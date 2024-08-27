package chapter3;

import java.util.Scanner;

public class QuotaCalculator {
    public static void main(String[] args) {
        // Values we know
        int quota = 10;

        // Enter the user values
        System.out.println("Enter the sales that the employee did this week:");
        Scanner scanner = new Scanner(System.in);
        int sales = scanner.nextInt();
        scanner.close();

        // Add the condition with output
        if (sales > 10)
            System.out.println("Congratulations, you met your quota!");
        else {
            int salesShort = quota - sales;
            System.out.println("You did not met the quota this week, you were " + salesShort + " sales short.");
        }
    }
}
