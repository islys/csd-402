// Ryan Monnier 
// CSD 402
// Module 2
// 23-Mar-2025
// git: https://github.com/islys/csd-402

//importing scanner for user input, and random for... random
import java.util.Scanner;
import java.util.Random;


public class RockPaperScissors {
    // 
    public static void main (String[] args) {
        // variable declarations
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int userScore = 0;
        int compScore = 0;

        // welcome message
        System.out.println("Prepare to be destroyed!");

        //main loop to run the game, and break on error/exit
        while (true) {
            System.out.println("Enter 1 for Rock, 2 for Paper, or 3 for Scissors (or type 'exit' to stop playing): ");
            String input = scanner.nextLine().toLowerCase();

            if (input.equals("exit")) {
                System.out.println("Later Gator...");
                break;
            }
            // validate user input
            int selection;
            try {
                selection = Integer.parseInt(input);
                // make sure selection is in range 1-3
                if (selection < 1 || selection > 3) {
                    System.out.println("Invalid input. Please enter 1, 2, or 3.");
                    continue;
                }
                // catches non-integer input
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter 1, 2, or 3.");
                continue;
            }

            // gets our random number, solves the issue of generating in range 0-2, now 1-3
            int compChoice = random.nextInt(3) + 1;

            // show selections
            String userSelection = getSelection(selection);
            String compSelection = getSelection(compChoice);
            System.out.println("Your selection: " + userSelection);
            System.out.println("Computer selection: " + compSelection);

            // compare selections
            if (selection == compChoice) {
                System.out.println("There has been a tie");
            } else if (
                (selection == 1 && compChoice == 3) ||
                (selection == 2 && compChoice == 1) ||
                (selection == 3 && compChoice == 2)
            ) {
                System.out.println("You win this time...");
                userScore++;
            } else {
                System.out.println("You lose, loser.");
                compScore++;
            }

            //score
            System.out.println("Current Score: You - " + userScore + " | Computer - " + compScore);

            // continue playing?
            System.out.println("Continue? (yes/no)");
            String playAgain = scanner.nextLine().toLowerCase();
            if (playAgain.equals("no")) {
                System.out.println("Final Score: You - " + userScore + " | Computer - " + compScore);
                System.out.println("Yeah, you better run.");
                break;
            }
        }

        // close the scanner
        scanner.close();
    }

    // method that converts our numbers to rock/paper/scissors
    public static String getSelection(int choice) {
        switch (choice) {
            case 1:
                return "Rock";
            case 2:
                return "Paper";
            case 3:
                return "Scissors";
            default:
                return "Invalid";
        }
    }
}