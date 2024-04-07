import java.util.Scanner;
import java.util.Random;


public class TicTacToeReg extends YourName {


    private char[][] board;
    private char currentPlayer;
    private boolean gameEnded;


    public TicTacToeReg() {
        board = new char[3][3];
        currentPlayer = 'X';
        gameEnded = false;
        initializeBoard();
    }


    public void playGame() {
        Scanner scanner = new Scanner(System.in);


        while (!gameEnded) {
            printBoard();


            if (currentPlayer == 'X') {
                System.out.println("Your turn.");
                System.out.print("Enter row (0-2): ");
                int row = scanner.nextInt();
                System.out.print("Enter column (0-2): ");
                int col = scanner.nextInt();


                if (isValidMove(row, col)) {
                    makeMove(row, col);
                    if (checkWinner()) {
                        printBoard();
                        System.out.println("You win! Here's 5 diamonds");
                        super.earnDiamonds(5);
                        gameEnded = true;
                    } else if (isBoardFull()) {
                        printBoard();
                        System.out.println("It's a tie! HAHA");
                        gameEnded = true;
                    } else {
                        switchPlayer();
                    }
                } else {
                    System.out.println("Invalid move. Try again.");
                }
            } else {
                System.out.println("Bot's turn.");
                makeBotMove();
                if (checkWinner()) {
                    printBoard();
                    System.out.println("Bot wins! whomp whomp");
                    gameEnded = true;
                } else if (isBoardFull()) {
                    printBoard();
                    System.out.println("It's a tie! whomp whomp");
                    gameEnded = true;
                } else {
                    switchPlayer();
                }
            }
        }
    }


    private void initializeBoard() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                board[i][j] = '-';
            }
        }
    }


    private void printBoard() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }


    private boolean isValidMove(int row, int col) {
        return row >= 0 && row < 3 && col >= 0 && col < 3 && board[row][col] == '-';
    }


    private void makeMove(int row, int col) {
        board[row][col] = currentPlayer;
    }


    private void makeBotMove() {
        Random rand = new Random();
        int row, col;


        do {
            row = rand.nextInt(3);
            col = rand.nextInt(3);
        } while (!isValidMove(row, col));


        board[row][col] = currentPlayer;
    }


    private void switchPlayer() {
        if (currentPlayer == 'X') {
            currentPlayer = 'O';
        } else {
            currentPlayer = 'X';
        }
    }


    private boolean checkWinner() {
        for (int i = 0; i < 3; i++) {
            if (board[i][0] != '-' && board[i][0] == board[i][1] && board[i][1] == board[i][2]) {
                return true;
            }
            if (board[0][i] != '-' && board[0][i] == board[1][i] && board[1][i] == board[2][i]) {
                return true;
            }
        }
        if (board[0][0] != '-' && board[0][0] == board[1][1] && board[1][1] == board[2][2]) {
            return true;
        }
        return board[0][2] != '-' && board[0][2] == board[1][1] && board[1][1] == board[2][0];
    }


    private boolean isBoardFull() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[i][j] == '-') {
                    return false;
                }
            }
        }
        return true;
    }


    public static void main(String[] args) {
        TicTacToeReg game = new TicTacToeReg();
        game.playGame();
    }
}
