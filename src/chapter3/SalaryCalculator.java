package chapter3;

import java.util.Scanner;

/*
IF Statement.
All salespeople get a payment of $1000 a week.
Salespeople who exceed 10 sales get an additional bonus of $250.
 */
public class SalaryCalculator {

    public static void main(String[] args) {

        //Initialize values we know
        int salary = 1000;
        int salaryBonus = 250;
        int quota = 10;

        //Get values from user
        System.out.print("Enter the sales the employee have done this week: ");
        Scanner scanner = new Scanner(System.in);
        int sales = scanner.nextInt();
        scanner.close();

        //Validate if sales exceed
        if (sales > quota) {
            salary = salary + salaryBonus;
        }


        //Output
        System.out.println("The employee salary this week is $" + salary);
    }
}
