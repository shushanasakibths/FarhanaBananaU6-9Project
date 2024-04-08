import java.util.Random;
import java.util.Scanner;

public class WordleReg extends YourName {
    public static final String[] SECRET_WORDS = {
            "APPLE", "BRAIN", "CHAIR", "DOZEN", "EAGLE", "FAULT", "GRAND", "HOUSE", "IGLOO", "JOKER",
            "KNEEL", "LEMON", "MANGO", "NIGHT", "OASIS", "PUPPY", "QUICK", "ROBOT", "STORM", "TIGER",
            "UMBRA", "VIXEN", "WATER", "XENON", "YIELD", "ZEBRA", "ALIGN", "BEACH", "CANDY", "DRIVE",
            "ELBOW", "FLYER", "GHOST", "HUMOR", "INFER", "JEWEL", "KNIFE", "LIGHT", "MUSIC", "NOVEL",
            "OCEAN", "PANDA", "QUICK", "ROUND", "SLEEP", "TABLE", "UNCLE", "VIRUS", "WOMAN", "YOUTH"
    };

    private final String secretWord;
    private final int maxAttempts;
    private int remainingAttempts;
    private final Scanner scanner;
    public WordleReg(String secretWord, int maxAttempts) {
        this.secretWord = secretWord.toUpperCase();
        this.maxAttempts = maxAttempts;
        this.remainingAttempts = maxAttempts;
        this.scanner = new Scanner(System.in);
    }


    public void play() {
        System.out.println("Welcome to Wordle!");
        System.out.println("You have " + maxAttempts + " attempts to guess the secret word.");


        while (remainingAttempts > 0) {
            System.out.println("\nAttempts remaining: " + remainingAttempts);
            System.out.print("Enter your guess: ");
            String guess = scanner.nextLine().toUpperCase();


            if (guess.equals(secretWord)) {
                System.out.println("Congratulations! You guessed the word: " + secretWord + ". Here's some diamonds!");
                super.earnDiamonds(5);
                return;
            } else {
                String feedback = provideFeedback(guess);
                System.out.println("Feedback: " + feedback);
                remainingAttempts--;
            }
        }


        System.out.println("\nSorry, you ran out of attempts. HAHA");
        System.out.println("The secret word was: " + secretWord);
    }


    private String provideFeedback(String guess) {
        StringBuilder feedback = new StringBuilder();


        for (int i = 0; i < secretWord.length(); i++) {
            char guessChar = guess.charAt(i);
            char secretChar = secretWord.charAt(i);


            if (guessChar == secretChar) {
                feedback.append(guessChar);
            } else if (secretWord.contains(String.valueOf(guessChar))) {
                feedback.append("+");
            } else {
                feedback.append("-");
            }
        }


        return feedback.toString();
    }


    public static void main(String[] args) {
        Random random = new Random();
        String secretWord = SECRET_WORDS[random.nextInt(SECRET_WORDS.length)];
        WordleReg wordle = new WordleReg(secretWord, 6);
        wordle.play();
    }
}
