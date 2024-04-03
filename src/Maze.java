// SHUSHANA SAKI

public class Maze {
    private char[][] layout;
    private int startX, startY;

    public Maze() {
        this.layout = new char[][] {
                {'S', '_', '#', '_', '_', '_', '_', '_', '_', '_'},
                {'_', '#', '_', '_', '#', '_', '_', '#', '_', '_'},
                {'_', '_', '_', '#', '_', '_', '#', '_', '_', '_'},
                {'_', '#', '_', '_', '_', '#', '_', '_', '#', '_'},
                {'_', '_', '#', '_', '_', '_', '#', '_', '_', 'G'}
        };
        findStart();

    }

    private void findStart() {
        for (int i = 0; i < layout.length; i++) {
            for (int j = 0; j < layout[i].length; j++) {
                if (layout[i][j] == 'S') {
                    startX = i;
                    startY = j;
                    return;
                }
            }
        }
    }


    public int getRows() {
        return layout.length;
    }

    public int getCols() {
        return layout[0].length;
    }

    public int getStartX() {
        return startX;
    }

    public int getStartY() {
        return startY;
    }


    public boolean isGoalReached(int x, int y) {
        return layout[x][y] == 'G';
    }

    public boolean isObstacle(int x, int y) {
        return layout[x][y] == '#';
    }
}