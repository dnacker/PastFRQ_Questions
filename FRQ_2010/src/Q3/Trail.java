package Q3;

/**
 * Question 3.
 * TODO complete isLevelTrailSegment and isDifficult.
 */
public class Trail {
    /** Representation of the trail. The number of markers on the trail is markers.length. */
    private int[] markers;
    public Trail(int[] markers) {
        this.markers = markers;
    }

    /**
     * Determines if a trail segment is level. A trail segment is defined by a starting marker,
     * and ending marker and all markers between those two markers.
     * A trail segment is level if it has a difference between the maximum elevation
     * and minimum elevation that is less than or equal to 10 meters.
     * @param start the index of the starting marker
     * @param end the index of the ending marker
     *            Precondition: 0 <= start < end <= markers.length - 1
     * @return true if the difference between the max and min elevation on this segment of the trail
     *         is less than or equal to 10 meters;
     *         false otherwise.
     */
    public boolean isLevelTrailSegment(int start, int end) {
        //Your solution to part (a)
        return false;
    }

    /**
     * Determines if this trail is difficult. A trail is difficult if there are at least three changes of
     * at least 30 meters between two adjacent trail markers.
     * @return true if difficult, false otherwise.
     */
    public boolean isDifficult() {
        //Your solution to part (b)
        return false;
    }
}
