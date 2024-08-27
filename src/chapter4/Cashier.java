package chapter4;

import java.util.Scanner;

public class Cashier {
    public static void main(String[] args) {
        // Set up user input and storage of the value
        System.out.println("Enter the number of items you would like to scan:");
        Scanner scanner = new Scanner(System.in);
        int quantity = scanner.nextInt();
        double totalPrice = 0;

        // Set up the for loop based on the user input
        int itemNumber = 1;
        for(int i = 0; i<quantity; i++){
            System.out.format("Enter the price of the item #%d :", itemNumber);
            double itemPrice = scanner.nextDouble();

            totalPrice = totalPrice + itemPrice;
            itemNumber++;
        }
        // Close scanner to clean up memory
        scanner.close();

        // Output the total purchase price
        System.out.format("Your total purchase is: $%.2f", totalPrice);
    }
}
