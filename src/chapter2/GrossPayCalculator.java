package chapter2;

import java.util.Scanner;

public class GrossPayCalculator {

    public static void main(String[] args) {
//        1. Get the number of hours worked
        System.out.println("Enter the number of hours your employee works:");
        Scanner scanner = new Scanner(System.in);
        int workingHours = scanner.nextInt();
//        2. Get the hourly pay rate
        System.out.println("Enter the hourly rate payment:");
        double hourlyRate = scanner.nextDouble();
        scanner.close();
//        3. Multiply hours and pay rate
        double grossPayment = workingHours * hourlyRate;
//        4. Display result
        System.out.println("Your payment is $" + grossPayment + " USD");
    }

}
