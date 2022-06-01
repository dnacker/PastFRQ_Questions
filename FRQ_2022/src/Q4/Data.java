package Q4;

public class Data {
    public static int MAX = /* value not shown */ 0;
    private int[][] grid;

    /** Fills all elements of grid with randomly generated values, as described in part (a)
     * Precondition: grid is not null.
     * grid has at least one element.
     */
    public void repopulate() {
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                int num;
                do {
                    num = (int)(Math.random() * MAX / 10 + 1) * 10;
                } while (num % 100 == 0);
                grid[i][j] = num;
            }
        }

        /* to be implemented in part (a) */
    }

    /** Returns the number of columns in grid that are in increasing order, as described
     * in part (b)
     * Precondition: grid is not null.
     * grid has at least one element.
     */
    public int countIncreasingCols() {
        int count = 0;
        for (int col = 0; col < grid[0].length; col++) {
            boolean isIncreasing = true;
            for (int row = 0; row < grid.length - 1; row++) {
                if (grid[row][col] > grid[row + 1][col]) {
                    isIncreasing = false;
                }
            }

            if (isIncreasing) {
                count++;
            }
        }
        return count;

//        /* to be implemented in part (b) */
//        return -1;
    }
    // There may be instance variables, constructors, and methods that are not shown.
    void setGrid(int[][] grid) {
        this.grid = grid;
    }

    int[][] getGrid() {
        return grid;
    }
}
