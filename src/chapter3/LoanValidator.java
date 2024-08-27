package chapter3;

import java.util.Scanner;

public class LoanValidator {

    public static void main(String[] args) {
        //Initialize what we know
        int requiredMinimumSalary = 30000;
        int requiredMinimumYearsEmployed = 2;

        //Enter user input
        System.out.println("Enter the employee salary:");
        Scanner scanner = new Scanner(System.in);
        double employeeSalary = scanner.nextDouble();

        System.out.println("Enter the employee's years employed:");
        double yearsEmployed = scanner.nextDouble();
        scanner.close();

        //Make a decision
        if (employeeSalary < requiredMinimumSalary) {
            System.out.println("Sorry, you do not met the required minimum salary of $" + requiredMinimumSalary);
            System.exit(0);
        }

        if (yearsEmployed < requiredMinimumYearsEmployed){
            System.out.println("Sorry, you meet the minimum salary of $ " + requiredMinimumSalary
                    + ", but you do not met the required minimum years employed of " + requiredMinimumYearsEmployed
                    + "years.");
            System.exit(0);
        }

        System.out.println("Congratulations, you qualify for the loan!");
    }

}
