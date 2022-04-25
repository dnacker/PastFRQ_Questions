package Q3;

/**
 * Question 3.
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
        int min = markers[start];
        int max = markers[start];
        for (int index = start + 1; index <= end; index++) {
            if (markers[index] < min) {
                min = markers[index];
            }
            if (markers[index] > max) {
                max = markers[index];
            }
        }
        return max - min <= 10;
    }

    /**
     * Determines if this trail is difficult. A trail is difficult if there are at least three changes of
     * at least 30 meters between two adjacent trail markers.
     * @return true if difficult, false otherwise.
     */
    public boolean isDifficult() {
        int count = 0;
        for (int i = 0; i < markers.length - 1; i++) {
            if (Math.abs(markers[i] - markers[i + 1]) >= 30) {
                count++;
            }
        }
        return count >= 3;
    }
}
