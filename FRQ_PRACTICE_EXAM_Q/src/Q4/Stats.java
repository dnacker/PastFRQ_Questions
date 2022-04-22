package Q4;

import java.util.ArrayList;

public class Stats {
    private ArrayList<ScoreInfo> scoreList = new ArrayList<>();
    // listed in increasing score order; no two ScoreInfo objects contain the same score

    /** Records a score in the database, keeping the database in increasing score order. If no other
     * 	ScoreInfo object represents score, a new ScoreInfo object representing score
     * 	is added to the database; otherwise, the frequency in the ScoreInfo object representing
     * 	score is incremented.
     * 	@param score a score to be recorded in the list
     * 	@return true if a new ScoreInfo object representing score was added to the list;
     * false otherwise
     */
    public boolean record(int score) {
        /* to be implemented in part (a) */
        return false;
    }

    /** Records all scores in stuScores in the database, keeping the database in increasing score order
     * 	@param stuScores an array of student test scores
     */
    public void recordScores(int[] stuScores) {
        /* to be implemented in part (b) */
    }

    // Ignore these methods. Used for testing.
    public ArrayList<ScoreInfo> getScoreList() {
        return scoreList;
    }

    public String toString() {
        return scoreList.toString();
    }
}
