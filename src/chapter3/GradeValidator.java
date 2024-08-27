package chapter3;

import java.util.Scanner;

public class GradeValidator {
    public static void main(String[] args) {
        //Initialize know values
        System.out.println("Enter the student's exam grade:");
        Scanner scanner = new Scanner(System.in);
        String studentGrade = scanner.next().toUpperCase().substring(0, 1);

        //Validate the student's grade

        switch (studentGrade) {
            case "A" ->
                System.out.println("Congratulations! you got the highest score.");

            case "B" ->
                System.out.println("Great! you did a good job.");

            case "C" ->
                System.out.println("You passed!");

            case "D" ->
                System.out.println("You failed. You have to study more next time.");

            case "F" ->
                System.out.println("You failed. You have to do better.");

            default ->
                System.out.println("Invalid grade.");

        }
    }
}
