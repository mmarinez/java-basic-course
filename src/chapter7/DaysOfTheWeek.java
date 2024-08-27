package chapter7;

import java.util.Scanner;

public class DaysOfTheWeek {
    private String[] daysOfTheWeek = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};

    public String getDayOfTheWeek(int day) {
        return daysOfTheWeek[day-1];
    }

    public void searchDayOfTheWeek(){
        Scanner scanner = new Scanner(System.in);
        var search = true;

        do {
            System.out.println("Enter the number of the day of the week you want to get: ");
            var day = getDayOfTheWeek(scanner.nextInt());

            System.out.format("You have selected %s\n\n", day);

            System.out.println("Do you want to search again? (Y/N)");
            var answer = scanner.next().toLowerCase();
            if (answer.equals("n"))
                search = false;

        }while (search);
    }
}
