package chapter4;

import java.util.Scanner;

public class LetterSearcher {
    public static void main(String[] args) {
        // Enter the word to iterate with
        System.out.println("Enter the word to be iterated:");
        Scanner scanner = new Scanner(System.in);
        String testWord = scanner.next();

        boolean letterFound = false;
        // Set up the for loop to iterate the word
        for (int i = 0; i<testWord.length(); i++) {
            char currentLetter = testWord.charAt(i);
            if (currentLetter == 'A' || currentLetter == 'a') {
                letterFound = true;
                break;
            }
        }

        if (letterFound)
            System.out.println("The word contians the letter A");
        else {
            System.out.println("The word DO NOT contains the letter A");
        }
    }
}
