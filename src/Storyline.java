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
        /*switch (choice) {
            case 1:
                Random random = new Random();
                String secretWord = Wordle.SECRET_WORDS[random.nextInt(Wordle.SECRET_WORDS.length)];
                Wordle wordleGame = new Wordle(secretWord, 6);
                wordleGame.playGame(new Wordle.GameCallback() {
                    @Override
                    public void gameCompleted(boolean hasWon) {
                        if (hasWon) {
                            getPlayer().earnDiamonds(5);
                            System.out.println("You've earned 5 diamonds!");
                        } else {
                            System.out.println("You failed to win the Wordle game. Moving on...");
                        }
                    }
                });
                break;
            case 2:
                TicTacToe tictactoeGame = new TicTacToe();
                if (tictactoeGame.hasWon()) {
                    getPlayer().earnDiamonds(5);
                    System.out.println("You've earned 5 diamonds!");
                } else {
                    System.out.println("You failed to win the TicTacToe game. Moving on...");
                }
                break;
            case 3:
                RockPaperScissors rpsGame = new RockPaperScissors();
                if (rpsGame.hasWon()) {
                    getPlayer().earnDiamonds(5);
                    System.out.println("You've earned 5 diamonds!");
                } else {
                    System.out.println("You failed to win the Rock Paper Scissors game. Moving on...");
                }
                break;
            case 4:
                MazeGame mazeGame = new MazeGame();
                if (mazeGame.hasWon()) {
                    getPlayer().earnDiamonds(5);
                    System.out.println("You've earned 5 diamonds!");
                } else {
                    System.out.println("You failed to win the Maze game. Moving on...");
                }
                break;
            default:
                System.out.println("Invalid choice. Please select a valid option.");
                break;
        }*/

        switch (choice){
            case 1:
                playWordle();
                break;
            case 2:
                playTicTacToe();
                break;
            case 3:
                playRPS();
                break;
            case 4:
                playMazeGame();
                break;
            default:
                System.out.println("Invalid choice. Please select a valid option.");
        }
    }

    //trying different approach

    private void playWordle(){
        Random random = new Random();
        String secretWord = Wordle.SECRET_WORDS[random.nextInt(Wordle.SECRET_WORDS.length)];
        Wordle wordleGame = new Wordle(secretWord, 6);
        wordleGame.playGame(new Wordle.GameCallback() {
            @Override
            public void gameCompleted(boolean hasWon) {
                if (hasWon) {
                    getPlayer().earnDiamonds(5);
                    System.out.println("You've earned 5 diamonds!");
                } else {
                    System.out.println("You failed to win the Wordle game. Moving on...");
                }
            }
        });
    }

    private void playTicTacToe(){
        TicTacToe tictactoeGame = new TicTacToe();
        if (tictactoeGame.hasWon()) {
            getPlayer().earnDiamonds(5);
            System.out.println("You've earned 5 diamonds!");
        } else {
            System.out.println("You failed to win the TicTacToe game. Moving on...");
        }
    }

    private void playRPS(){
        RockPaperScissors rpsGame = new RockPaperScissors();
        if (rpsGame.hasWon()) {
            getPlayer().earnDiamonds(5);
            System.out.println("You've earned 5 diamonds!");
        } else {
            System.out.println("You failed to win the Rock Paper Scissors game. Moving on...");
        }
    }

    private void playMazeGame(){
        MazeGame mazeGame = new MazeGame();
        if (mazeGame.hasWon()) {
            getPlayer().earnDiamonds(5);
            System.out.println("You've earned 5 diamonds!");
        } else {
            System.out.println("You failed to win the Maze game. Moving on...");
        }
    }
}
