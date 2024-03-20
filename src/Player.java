// SHUSHANA SAKI

public class Player {
    private int x, y;
    private int initialX, initialY;

    public Player(int startX, int startY) {
        this.x = startX;
        this.y = startY;
        this.initialX = startX;
        this.initialY = startY;
    }

    public void move(String direction) {
        switch (direction) {
            case "W":
                x--;
                break;
            case "A":
                y--;
                break;
            case "S":
                x++;
                break;
            case "D":
                y++;
                break;
        }
    }

    public void goBack() {
        x = initialX;
        y = initialY;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}