package chapter5;

import java.util.Scanner;

public class Greetings {
    public static void main(String[] args) {
        // Ask the user their name and initialize a variable with it.
        System.out.println("What is your name?");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();
        scanner.close();
        greetUser(name);
    }

    public static void greetUser(String userName){
        // Call the showGreetings method
        System.out.format("Hello %s!", userName);
    }
}
