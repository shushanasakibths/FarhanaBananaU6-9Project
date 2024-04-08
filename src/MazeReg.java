import java.util.Scanner;

public class MazeReg {

    private char[][] maze;
    private int playerX, playerY;
    private boolean gameEnded;

    public MazeReg() {
        initializeMaze();
        playerX = getPlayerStartX();
        playerY = getPlayerStartY();
        gameEnded = false;
    }

    public void playGame() {
        Scanner scanner = new Scanner(System.in);

        while (!gameEnded) {
            printMaze();

            System.out.println("Your turn.");
            System.out.print("Enter direction (W/A/S/D): ");
            String direction = scanner.next().toUpperCase();

            if (isValidMove(direction, playerX, playerY)) {
                makeMove(direction, playerX, playerY);
                if (isGoalReached(playerX, playerY)) {
                    printMaze();
                    System.out.println("Congratulations! You reached the goal! You win!");
                    gameEnded = true;
                } else if (isObstacle(playerX, playerY)) {
                    printMaze();
                    System.out.println("You hit an obstacle! Game over!");
                    gameEnded = true;
                }
            } else {
                System.out.println("Invalid move. Try again.");
            }
        }
    }

    private void initializeMaze() {
        maze = new char[][] {
                {'S', '_', '#', '_', '_', '_', '_', '_', '_', '_'},
                {'_', '#', '_', '_', '#', '_', '_', '#', '_', '_'},
                {'_', '_', '_', '#', '_', '_', '#', '_', '_', '_'},
                {'_', '#', '_', '_', '_', '#', '_', '_', '#', '_'},
                {'_', '_', '#', '_', '_', '_', '#', '_', '_', 'G'}
        };
    }

    private int getPlayerStartX() {
        for (int i = 0; i < maze.length; i++) {
            for (int j = 0; j < maze[i].length; j++) {
                if (maze[i][j] == 'S') {
                    return i;
                }
            }
        }
        return -1;
    }

    private int getPlayerStartY() {
        for (int i = 0; i < maze.length; i++) {
            for (int j = 0; j < maze[i].length; j++) {
                if (maze[i][j] == 'S') {
                    return j;
                }
            }
        }
        return -1;
    }

    private void printMaze() {
        for (int i = 0; i < maze.length; i++) {
            for (int j = 0; j < maze[i].length; j++) {
                System.out.print(maze[i][j] + " ");
            }
            System.out.println();
        }
    }

    private boolean isValidMove(String direction, int x, int y) {
        switch (direction) {
            case "W":
                return x - 1 >= 0 && maze[x - 1][y] != '#';
            case "A":
                return y - 1 >= 0 && maze[x][y - 1] != '#';
            case "S":
                return x + 1 < maze.length && maze[x + 1][y] != '#';
            case "D":
                return y + 1 < maze[0].length && maze[x][y + 1] != '#';
            default:
                return false;
        }
    }

    private void makeMove(String direction, int x, int y) {
        switch (direction) {
            case "W":
                maze[x][y] = '_';
                maze[--x][y] = 'S';
                playerX = x;
                break;
            case "A":
                maze[x][y] = '_';
                maze[x][--y] = 'S';
                playerY = y;
                break;
            case "S":
                maze[x][y] = '_';
                maze[++x][y] = 'S';
                playerX = x;
                break;
            case "D":
                maze[x][y] = '_';
                maze[x][++y] = 'S';
                playerY = y;
                break;
        }
    }

    private boolean isGoalReached(int x, int y) {
        return maze[x][y] == 'G';
    }

    private boolean isObstacle(int x, int y) {
        return maze[x][y] == '#';
    }

    public static void main(String[] args) {
        MazeReg game = new MazeReg();
        game.playGame();
    }
}
