package bonusexercises;

import java.util.Random;
import java.util.Scanner;

public class RollTheDiceGame {
    static Scanner scanner = new Scanner(System.in);
    static int winningSpace = 20;
    static int spaces = 0;

    public static void main(String[] args) {
        // Initialize random number generator
        Random random = new Random();
        boolean roll = true;
        int turns = 0;
        int finalTurn = 5;
        int remainingSpaces;

        getGameInstructions();

        do {

            // Roll the die or give up.
            String dieRoll = rollTheDie();

            switch (dieRoll) {
                case "n" -> {
                    System.out.println("You gave up. Thanks for playing my game!");
                    roll = false;
                }
                case "y" -> {
                    int die = random.nextInt(6) + 1;
                    spaces += die;
                    turns += 1;
                }

            }

            // Calculate the player current location in the board.
            remainingSpaces = winningSpace - spaces;

            // Validate winning or losing conditions
            validateGameConditions(turns, finalTurn, spaces, winningSpace, remainingSpaces);

            // Show game current state.
            getGameCurrentState(roll, remainingSpaces);


        } while (roll);

        scanner.close();
    }

    public static String rollTheDie(){
        System.out.println("Roll the die!");
        return scanner.next().toLowerCase();
    }

    public static void validateGameConditions(int turns, int finalTurn, int spaces, int winningSpace, int remainingSpaces){

        if (turns == finalTurn && spaces < winningSpace) {
            System.out.format("You lose! you are %d spaces short to %d", remainingSpaces, winningSpace);
            System.exit(0);
        }

        if (turns <= finalTurn && spaces > winningSpace) {
            int overSpaces = spaces - winningSpace;
            System.out.format("You lose! you are %d spaces over to %d", overSpaces, winningSpace);
            System.exit(0);
        }

        if (turns == finalTurn && spaces == winningSpace) {
            System.out.format("You Win! Thanks for playing my game!");
            System.exit(0);
        }

        if (turns <= finalTurn && spaces == winningSpace) {
            System.out.format("You Win! Thanks for playing my game!");
            System.exit(0);
        }
    }

    public static void getGameCurrentState(boolean roll, int remainingSpaces){
        if (roll) {
            System.out.format("You are %d spaces in the board. %d remaining.\n\n", spaces, remainingSpaces);
        }
    }

    public static void getGameInstructions() {
        System.out.println("--------------------");
        System.out.println("  Roll The Die Game");
        System.out.println("--------------------");

        System.out.println("Instructions:");
        System.out.println("Roll the die 5 times, if you reach 20 spaces in the board you win,");
        System.out.println("but if you don't reach 20 spaces by the end of 5 turns or you are over 20 spaces you lose.");
        System.out.println();
        System.out.println("Type Y and hit enter to Roll the die! or type N and hit enter to give up and close the game.");
    }

}
