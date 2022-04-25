package Q1;

/**
 * Question 1
 */
public class NumberCubeRunner {
    /** Returns an array of the values obtained by tossing a number cube numTosses times.
     * @param cube a NumberCube
     * @param numTosses the number of tosses to be recorded
     * Precondition: numTosses > 0
     * @return an array of numTosses values
     */
    public static int[] getCubeTosses(NumberCube cube, int numTosses) {
        int[] arr = new int[numTosses];
        for (int i = 0; i < numTosses; i++) {
            arr[i] = cube.toss();
        }
        return arr;
    }

    /** Returns the starting index of a longest run of two or more consecutive repeated values
     * in the array values.
     * @param values an array of integer values representing a series of number cube tosses
     * Precondition: values.length > 0
     * @return the starting index of a run of maximum size;
     * -1 if there is no run
     */
    public static int getLongestRun(int[] values) {
        int indexOfLongest = -1;
        int longestRun = 0;
        int currentPosition = 0;
        while (currentPosition < values.length - 1) {
            if (values[currentPosition] == values[currentPosition + 1]) {
                int currentLongestRun = 2;
                int currentLongestIndex = currentPosition;
                currentPosition++;
                while (currentPosition < values.length - 1 && values[currentPosition] == values[currentPosition + 1]) {
                    currentLongestRun++;
                    currentPosition++;
                }
                if (currentLongestRun > longestRun) {
                    indexOfLongest = currentLongestIndex;
                }
            }
            currentPosition++;
        }
        return indexOfLongest;
    }
}
