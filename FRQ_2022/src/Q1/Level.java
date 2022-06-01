package Q1;

public class Level {
    /** Returns true if the player reached the goal on this level and returns false otherwise */
    public boolean goalReached() {
        /* implementation not shown */
        return reached;
    }
    /** Returns the number of points (a positive integer) recorded for this level */
    public int getPoints() {
        /* implementation not shown */
        return points;
    }

    // There may be instance variables, constructors, and methods that are not shown.
    private boolean reached = false;
    private int points = 0;

    Level(boolean reached, int points) {
        this.points = points;
        this.reached = reached;
    }

    Level() {}
}