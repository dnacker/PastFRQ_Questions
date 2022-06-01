package Q1;

public class Game {
    private Level levelOne;
    private Level levelTwo;
    private Level levelThree;

    /** Postcondition: All instance variables have been initialized. */
    public Game() {
        /* implementation not shown */
        levelOne = new Level();
        levelTwo = new Level();
        levelThree = new Level();
    }

    /** Returns true if this game is a bonus game and returns false otherwise */
    public boolean isBonus() {
        /* implementation not shown */
        return false;
    }

    /** Simulates the play of this Game (consisting of three levels) and updates all relevant
     * game data
     */
    public void play() {
        /* implementation not shown */
    }

    /** Returns the score earned in the most recently played game, as described in part (a) */
    public int getScore() {
//        /* to be implemented in part (a) */
//        return -1;

        int total = 0;
        if (levelOne.goalReached()) {
            total += levelOne.getPoints();
            if (levelTwo.goalReached()) {
                total += levelTwo.getPoints();
                if (levelThree.goalReached()) {
                    total += levelThree.getPoints();
                }
            }
        }

        /* Alternate solution
        if (levelOne.goalReached()) {
            total += levelOne.getPoints();
        }
        if (levelOne.goalReached() && levelTwo.goalReached()) {
            total += levelTwo.getPoints();
        }
        if (levelOne.goalReached() && levelTwo.goalReached() && levelThree.goalReached()) {
            total += levelThree.getPoints();
        }
         */

        if (isBonus()) {
            total *= 3;
        }

        return total;
    }

    /** Simulates the play of num games and returns the highest score earned, as
     * described in part (b)
     * Precondition: num > 0
     */
    public int playManyTimes(int num) {
        int maxScore = 0;
        for (int i = 0; i < num; i++) {
            play();
            int score = getScore();
            if (score > maxScore) {
                maxScore = score;
            }
        }

        return maxScore;
//        /* to be implemented in part (b) */
//        return -1;
    }

    // There may be instance variables, constructors, and methods that are not shown.

    void setLevels(Level[] levels) {
        levelOne = levels[0];
        levelTwo = levels[1];
        levelThree = levels[2];
    }
}