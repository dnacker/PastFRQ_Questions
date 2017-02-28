package Q1;

import java.util.ArrayList;
import java.util.List;

/**
 * Question 1.
 * TODO implement addClimb, addClimbAlphabetical
 */
public class ClimbingClub {
    /** The list of climbs completed by members of the club.
     * Guaranteed not to be null. Contains only non-null references.
     */
    private List<ClimbInfo> climbList;

    /** Creates a new ClimbingClub object. */
    public ClimbingClub() {
        climbList = new ArrayList<ClimbInfo>();
    }

    /** Adds a new climb with name peakName and time climbTime to the list of climbs.
     * Preserves order that climbs were entered.
     * @param peakName the name of the mountain peak climbed
     * @param climbTime the number of minutes taken to complete the climb
     */
    public void addClimb(String peakName, int climbTime) {
        //Your code for part (a)
    }

    /** Adds a new climb with name peakName and time climbTime to the list of climbs.
     * Adds climb in alphabetical order by peakName.
     * @param peakName the name of the mountain peak climbed
     * @param climbTime the number of minutes taken to complete the climb
     */
    public void addClimbAlphabetical(String peakName, int climbTime) {
        //Your code for part (b)
    }

    /** @return the number of distinct names in the list of climbs */
    public int distinctPeakNames() {
        if (climbList.size() == 0) {
        return 0;
        }
        ClimbInfo currInfo = climbList.get(0);
        String prevName = currInfo.getName();
        String currName = null;
        int numNames = 1;
        for (int k = 1; k < climbList.size(); k++) {
            currInfo = climbList.get(k);
            currName = currInfo.getName();
            if (prevName.compareTo(currName) != 0) {
                numNames++;
                prevName = currName;
            }
        }
        return numNames;
    }

    public String toString() {
        return climbList.toString();
    }

    /*
    public static void main(String[] args) {
        ClimbingClub clubChrono = new ClimbingClub();
        clubChrono.addClimb("Monadnock", 274);
        clubChrono.addClimb("Whiteface", 301);
        clubChrono.addClimb("Algonquin", 225);
        clubChrono.addClimb("Monadnock", 344);
        System.out.println(clubChrono);
        System.out.println(clubChrono.distinctPeakNames());


        ClimbingClub clubAlpha = new ClimbingClub();
        clubAlpha.addClimbAlphabetical("Monadnock", 274);
        clubAlpha.addClimbAlphabetical("Whiteface", 301);
        clubAlpha.addClimbAlphabetical("Algonquin", 225);
        clubAlpha.addClimbAlphabetical("Monadnock", 344);
        System.out.println(clubAlpha);
        System.out.println(clubAlpha.distinctPeakNames());
    }
    */
}
