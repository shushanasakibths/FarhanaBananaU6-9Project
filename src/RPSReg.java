import java.util.Random;
import java.util.Scanner;

public class RPSReg extends YourName{

    private static final int ROCK = 1;
    private static final int PAPER = 2;
    private static final int SCISSORS = 3;

    private int playerScore;
    private int botScore;

    public RPSReg() {
        this.playerScore = 0;
        this.botScore = 0;
    }

    public void play() {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        System.out.println("Welcome to rock, paper, scissors!");
        System.out.println();
        while (playerScore < 2 && botScore < 2) {
            System.out.print("Enter your choice (1 for Rock, 2 for Paper, 3 for Scissors): ");
            int playerChoice = scanner.nextInt();

            if (playerChoice < 1 || playerChoice > 3) {
                System.out.println("Invalid choice. Please enter a number between 0 and 2.");
                continue;
            }

            int botChoice = random.nextInt(4);

            System.out.println("Bot chose: " + botChoice);

            if (playerChoice == botChoice) {
                System.out.println("It's a tie!");
            } else if ((playerChoice == ROCK && botChoice == SCISSORS) ||
                    (playerChoice == PAPER && botChoice == ROCK) ||
                    (playerChoice == SCISSORS && botChoice == PAPER)) {
                System.out.println("You win this round!");
                System.out.println();
                playerScore++;
            } else {
                System.out.println("Bot wins this round! Heh...");
                System.out.println();
                botScore++;
            }

            System.out.println("SCORES\nYou: " + playerScore + "\nBot: " + botScore);
        }

        if (playerScore == 2) {
            System.out.println("Congratulations! You win the game! Here's five diamonds...");
            super.earnDiamonds(5);
        } else {
            System.out.println("Sorry, the bot wins the game. How unfortunate.....");
        }

        scanner.close();
    }

    public static void main(String[] args) {
        RPSReg rps = new RPSReg();
        rps.play();
    }
}
