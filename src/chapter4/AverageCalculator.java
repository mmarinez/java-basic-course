package chapter4;

import java.util.Scanner;

public class AverageCalculator {
    public static void main(String[] args) {
        // Initialize know values for students and exams to be taken
        int students = 24;
        int exams = 4;
        Scanner scanner = new Scanner(System.in);

        // Implement nested loop to calculate the average results of the exams for each student
        for (int i=0; i<students; i++) {
            int studentNumber = i+1;
            int examSum = 0;
            System.out.println("------------------------------");
            System.out.format("Student#%d exam average result\n", studentNumber);
            System.out.println("------------------------------");

            for (int j=0; j<exams; j++){
                System.out.format("Enter the result of the exam#%d\n", j+1);
                int examResult = scanner.nextInt();
                examSum = examSum + examResult;
            }

            int averageStudentResult = examSum/exams;
            System.out.format("The average result of student#%d is %d\n", studentNumber, averageStudentResult);

        }
        scanner.close();
    }
}
