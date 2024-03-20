// SHUSHANA SAKI

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class MazeGame extends JFrame implements KeyListener {
    private Maze maze;
    private Player player;
    private JPanel mazePanel;
    private final int CELL_SIZE = 30;

    public MazeGame() {
        setupGame();
        setupUI();
    }

    private void setupGame() {
        maze = new Maze();
        player = new Player(maze.getStartX(), maze.getStartY());
    }

    private void setupUI() {
        setTitle("Maze Game");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(maze.getCols() * CELL_SIZE, maze.getRows() * CELL_SIZE);
        setResizable(false);

        mazePanel = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                drawMaze(g);
                drawPlayer(g);
            }
        };
        mazePanel.setPreferredSize(new Dimension(maze.getCols() * CELL_SIZE, maze.getRows() * CELL_SIZE));
        mazePanel.setFocusable(true);
        mazePanel.addKeyListener(this);

        add(mazePanel);
        pack();
    }

    private void drawMaze(Graphics g) {
        for (int i = 0; i < maze.getRows(); i++) {
            for (int j = 0; j < maze.getCols(); j++) {
                if (maze.isObstacle(i, j)) {
                    g.setColor(Color.BLACK);
                    g.fillRect(j * CELL_SIZE, i * CELL_SIZE, CELL_SIZE, CELL_SIZE);
                } else if (maze.isGoalReached(i, j)) {
                    g.setColor(Color.GREEN);
                    g.fillRect(j * CELL_SIZE, i * CELL_SIZE, CELL_SIZE, CELL_SIZE);
                }
            }
        }
    }

    private void drawPlayer(Graphics g) {
        g.setColor(Color.BLUE);
        g.fillOval(player.getY() * CELL_SIZE, player.getX() * CELL_SIZE, CELL_SIZE, CELL_SIZE);
    }

    private void movePlayer(String direction) {
        int newX = player.getX();
        int newY = player.getY();

        switch (direction) {
            case "W":
                newX--;
                break;
            case "A":
                newY--;
                break;
            case "S":
                newX++;
                break;
            case "D":
                newY++;
                break;
        }

        if (newX >= 0 && newX < maze.getRows() && newY >= 0 && newY < maze.getCols() && !maze.isObstacle(newX, newY)) {
            player.move(direction);
            if (maze.isGoalReached(player.getX(), player.getY())) {
                JOptionPane.showMessageDialog(this, "Congratulations! You reached the goal!");
            }
            repaint();
        }
    }

    @Override
    public void keyPressed(KeyEvent e) {
        int keyCode = e.getKeyCode();
        switch (keyCode) {
            case KeyEvent.VK_UP:
                movePlayer("W");
                break;
            case KeyEvent.VK_DOWN:
                movePlayer("S");
                break;
            case KeyEvent.VK_LEFT:
                movePlayer("A");
                break;
            case KeyEvent.VK_RIGHT:
                movePlayer("D");
                break;
        }
    }

    @Override
    public void keyTyped(KeyEvent e) {}

    @Override
    public void keyReleased(KeyEvent e) {}

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            MazeGame mazeGame = new MazeGame();
            mazeGame.setVisible(true);
        });
    }
}
