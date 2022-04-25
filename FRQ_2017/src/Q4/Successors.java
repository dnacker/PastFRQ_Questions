package Q4;

/* Question 4. */
public class Successors {
    /** Returns the position of num in intArr;
     *  returns null if no such element exists in intArr.
     *  Precondition: intArr contains at least one row.
     */
    public static Position findPosition(int num, int[][] intArr) {
        for (int row = 0; row < intArr.length; row++) {
            for (int col = 0; col < intArr[0].length; col++) {
                if (num == intArr[row][col]) {
                    return new Position(row, col);
                }
            }
        }
        return null;
    }

    /** Returns a 2D successor array as described in part (b) constructed from intArr.
     *  Precondition: intArr contains at least one row and contains consecutive values.
     *                Each of these integers may be in an position in the 2D array.
     */
    public static Position[][] getSuccessorArray(int[][] intArr) {
        Position[][] ans = new Position[intArr.length][intArr[0].length];
        for (int row = 0; row < intArr.length; row++) {
            for (int col = 0; col < intArr[0].length; col++) {
                ans[row][col] = findPosition(intArr[row][col] + 1, intArr);
            }
        }
        return ans;
    }
}
