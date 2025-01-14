package Q4;

/**
 * Question 4.
 */
public class ArrayResizer
{
    /** Returns true if and only if every value in row r of array2D is non-zero.
     * Precondition: r is a valid row index in array2D.
     * Postcondition: array2D is unchanged.
     */
    public static boolean isNonZeroRow(int[][] array2D, int r) {
        /* to be implemented in part (a) */
        return false;
    }
    /** Returns the number of rows in array2D that contain all non-zero values.
     * Postcondition: array2D is unchanged.
     */
    public static int numNonZeroRows(int[][] array2D) {
        /* implementation not shown */
        int numNonZeroRows = 0;
        for (int[] row : array2D) {
            boolean hasZero = false;
            for (int num : row) {
                if (num == 0) {
                    hasZero = true;
                }
            }
            if (!hasZero) {
                numNonZeroRows++;
            }
        }
        return numNonZeroRows;
    }

    /** Returns a new, possibly smaller, two-dimensional array that contains only rows
     * from array2D with no zeros, as described in part (b).
     * Precondition: array2D contains at least one column and at least one row with no zeros.
     * Postcondition: array2D is unchanged.
     */
    public static int[][] resize(int[][] array2D) {
        /* to be implemented in part (b) */
        return null;
    }
}
