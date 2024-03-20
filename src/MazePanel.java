// SHUSHANA SAKI

import javax.swing.*;
import java.awt.*;

public class MazePanel extends JPanel {
    private static final int CELL_SIZE = 40;
    private static final Color WALL_COLOR = Color.BLACK;
    private static final Color PLAYER_COLOR = Color.BLUE;
    private static final Color GOAL_COLOR = Color.GREEN;

    private char[][] mazeLayout;

    public MazePanel() {
        setPreferredSize(new Dimension(400, 400));
    }

    public void setMazeLayout(char[][] layout) {
        this.mazeLayout = layout;
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        if (mazeLayout == null) {
            return;
        }

        for (int i = 0; i < mazeLayout.length; i++) {
            for (int j = 0; j < mazeLayout[i].length; j++) {
                int x = j * CELL_SIZE;
                int y = i * CELL_SIZE;

                if (mazeLayout[i][j] == '#') {
                    g.setColor(WALL_COLOR);
                    g.fillRect(x, y, CELL_SIZE, CELL_SIZE);
                } else if (mazeLayout[i][j] == 'S' || mazeLayout[i][j] == 'P') {
                    g.setColor(PLAYER_COLOR);
                    g.fillRect(x, y, CELL_SIZE, CELL_SIZE);
                } else if (mazeLayout[i][j] == 'G') {
                    g.setColor(GOAL_COLOR);
                    g.fillRect(x, y, CELL_SIZE, CELL_SIZE);
                }
            }
        }
    }
}