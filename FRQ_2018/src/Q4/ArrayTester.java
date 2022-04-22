package Q4;

import java.util.HashSet;

/**
 * Question 4.
 */
public class ArrayTester {

    /** Returns an array containing the elements of column c of arr2D in the same order as
     *  they appear in arr2D.
     *  Precondition: c is a valid column index in arr2D.
     *  Postcondition: arr2D is unchanged.
     */
    public static int[] getColumn(int[][] arr2D, int c) {
        /* to be implemented in part (a) */
        return null;
    }

    /** Returns true if and only if every value in arr1 appears in arr2.
     *  Precondition: arr1 and arr2 have the same length.
     *  Postcondition: arr1 and arr2 are unchanged.
     */
    public static boolean hasAllValues(int[] arr1, int[] arr2) {
        for (int num1 : arr1) {
            for (int num2 : arr2) {
                boolean found = false;
                if (num1 == num2) {
                    found = true;
                }
                if (!found) {
                    return false;
                }
            }
        }
        return true;
    }

    /** Returns true if arr contains any duplicate values;
     *          false otherwise.
     */
    public static boolean containsDuplicates(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            boolean dup = false;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    return true;
                }
            }
        }
        return false;
    }

    /** Returns true if square is a Latin square as described in part (b);
     *  false otherwise.
     *  Precondition: square has an equal number of rows and columns.
     *                square has at least one row.
     */
    public static boolean isLatin(int[][] square) {
        /* to be implemented in part (b) */
        return false;
    }
}
