import java.util.Random;
import java.util.Scanner;

public class Storyline {
    private YourName player;
    private Scanner scanner;
    public Storyline(YourName player) {
        this.player = player;
        scanner = new Scanner(System.in);
    }

    public YourName getPlayer() {
        return player;
    }

    public Scanner getScanner() {
        return scanner;
    }

    public void start() {
        player.customizeCharacter();
        beginning();
        middle();
        end();
    }

    public void title(){
        System.out.println("Here is the title of the story!");
    }

    public void description() {
        System.out.println("Here is the description of the story!");
    }


    public void beginning() {
        System.out.println("Here's the beginning");
    }

    public void middle() {
        System.out.println("Here's the middle");
    }

    public void end() {
        System.out.println("Here's the end");
    }

    public void playMinigames(int choice) {
        if (choice == 1) {
            Random random = new Random();
            String secretWord = Wordle.SECRET_WORDS[random.nextInt(Wordle.SECRET_WORDS.length)];
            WordleReg wordleGame = new WordleReg(secretWord, 6);
            wordleGame.play();
        } else if (choice == 2) {
            TicTacToeReg tictactoeGame = new TicTacToeReg();
            tictactoeGame.playGame();
        } else if (choice == 3) {
            RPSReg rpsGame = new RPSReg();
        } else if (choice == 4) {
            MazeGame mazeGame = new MazeGame();
        } else {
            System.out.println("Tough luck! No diamonds for you...");
        }
    }






}
