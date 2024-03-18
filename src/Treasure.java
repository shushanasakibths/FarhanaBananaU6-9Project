public class Treasure extends Space {
    private int pointValue;

    public Treasure(String symbol, int pointValue) {
        super(symbol);
        this.pointValue = pointValue;
    }

    public int getPointValue() {
        return pointValue;
    }
}
