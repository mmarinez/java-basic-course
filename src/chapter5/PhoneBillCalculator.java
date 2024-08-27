package chapter5;

import java.util.Scanner;

public class PhoneBillCalculator {

    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        // Get plan fee from the user
        double planFee = getPlatFee();

        // Get overage fee
        double overageFee = getOverageFee();

        // Get tax fee
        double tax = getTax(planFee, overageFee);

        // Display the bill statement
        displayBillStatement(planFee, overageFee, tax);

        scanner.close();
    }

    private static void displayBillStatement(double planFee, double overageFee, double tax) {
        double totalBill = planFee + overageFee + tax;
        System.out.println("Phone Bill Statement");
        System.out.format("Plan: %.2f\n", planFee);
        System.out.format("Overage: %.2f\n", overageFee);
        System.out.format("Tax: %.2f\n", tax);
        System.out.format("Total: %.2f\n", totalBill);

    }

    private static double getTax(double planFee, double overageFee) {
        double billSubtotal = planFee + overageFee;
        double taxFee = 0.15;
        return billSubtotal * taxFee;
    }

    private static double getOverageFee() {
        System.out.print("Enter overage minutes: ");
        double overageMinutes = scanner.nextDouble();
        double overageCharge = 0.25;
        return overageMinutes * overageCharge;
    }

    private static double getPlatFee() {
        System.out.print("Enter your plan fee: ");
        return scanner.nextDouble();
    }
}
