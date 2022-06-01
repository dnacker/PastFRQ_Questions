package Q4;

import org.junit.Assert;
import org.junit.Test;

public class TestData {

    @Test
    public void testRepopulateGeneratesNumbersDivisibleBy10() {
        Data.MAX = 1000;
        Data data = new Data();
        data.setGrid(new int[50][100]);
        data.repopulate();

        for (int i = 0; i < data.getGrid().length; i++) {
            int[] row = data.getGrid()[i];
            for (int j = 0; j < row.length; j++) {
                Assert.assertTrue(row[j] > 0);
                Assert.assertEquals(0, row[j] % 10);
            }
        }
    }

    @Test
    public void testRepopulateGeneratesNumbersNotDivisibleBy100() {
        Data.MAX = 1000;
        Data data = new Data();
        data.setGrid(new int[50][100]);
        data.repopulate();

        for (int i = 0; i < data.getGrid().length; i++) {
            int[] row = data.getGrid()[i];
            for (int j = 0; j < row.length; j++) {
                Assert.assertNotEquals(0, row[j] % 100);
            }
        }
    }

    @Test
    public void testRepopulateGeneratesNumbersBetween1AndMaxInclusive() {
        Data.MAX = 200;
        Data data = new Data();
        data.setGrid(new int[50][100]);
        data.repopulate();

        boolean[] seen = new boolean[Data.MAX + 1];
        for (int i = 0; i < data.getGrid().length; i++) {
            int[] row = data.getGrid()[i];
            for (int j = 0; j < row.length; j++) {
                seen[row[j]] = true;
            }
        }

        for (int i = 10; i < seen.length; i+= 10) {
            if (i % 100 != 0) {
                Assert.assertTrue("Array did not contain : " + i, seen[i]);
            }
        }
    }

    @Test
    public void testRepopulateIsRandom() {
        Data.MAX = 100;
        Data data = new Data();
        int[][] first = new int[50][100];
        int[][] second = new int[50][100];
        data.setGrid(first);
        data.repopulate();

        data.setGrid(second);
        data.repopulate();

        boolean atLeastTwoNumbersAreDifferent = false;
        for (int i = 0; i < first.length; i++) {
            for (int j = 0; j < first[i].length; j++) {
                int num1 = first[i][j];
                int num2 = second[i][j];
                if (num1 != num2) {
                    atLeastTwoNumbersAreDifferent = true;

                }
            }
        }

        Assert.assertTrue("All numbers are the same.", atLeastTwoNumbersAreDifferent);
    }

    @Test
    public void testCountIncreasingColsNoIncreasingColumns() {
        int[][] grid = new int[][] {
                { 5, 4, 3 },
                { 4, 3, 2 },
                { 3, 2, 1 },
        };
        Data data = new Data();
        data.setGrid(grid);

        Assert.assertEquals(0, data.countIncreasingCols());
    }

    @Test
    public void testCountIncreasingColsSomeIncreasingColumns() {
        int[][] grid = new int[][] {
                { 1, 3, 4 },
                { 2, 3, 2 },
        };
        Data data = new Data();
        data.setGrid(grid);

        Assert.assertEquals(2, data.countIncreasingCols());
    }

    @Test
    public void testCountIncreasingColsAllIncreasingColumns() {
        int[][] grid = new int[][] {
                { 3, 1, 10 },
                { 3, 5, 15 },
        };
        Data data = new Data();
        data.setGrid(grid);

        Assert.assertEquals(3, data.countIncreasingCols());
    }
}
