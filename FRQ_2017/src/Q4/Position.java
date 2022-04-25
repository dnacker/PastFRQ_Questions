package Q4;

public class Position {
    private int row;
    private int col;

    /** Constructs a Position object with row r and column c. */
    public Position(int r, int c) {
        row = r;
        col = c;
    }

    public boolean equals(Object o) {
        if (o instanceof Position) {
            Position p = (Position)o;
            return row == p.row && col == p.col;
        }
        return false;
    }

    public String toString() {
        return "(" + row + ", " + col + ")";
    }
}
