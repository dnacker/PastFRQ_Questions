package Q4;

import org.junit.Assert;
import org.junit.Test;

public class TestArrayResizer {
    int[][] test = {
            {1, 3, 2},
            {2, 1, 0},
            {4, 5, 6},
            {0, 0, 0}
    };

    @Test
    public void testIsNonZeroRowDoesNotChangeParameter() {
        ArrayResizer.isNonZeroRow(test, 0);
        int[][] expected = {
                {1, 3, 2},
                {2, 1, 0},
                {4, 5, 6},
                {0, 0, 0}
        };
        check2DArray(expected, test);
    }

    @Test
    public void testIsNonZeroRowReturnsFalseIfAtLeastOneZero() {
        Assert.assertFalse(ArrayResizer.isNonZeroRow(test, 1));
        Assert.assertFalse(ArrayResizer.isNonZeroRow(test, 3));
    }

    @Test
    public void testIsNonZeroRowReturnsTrueIfNoZeros() {
        Assert.assertTrue(ArrayResizer.isNonZeroRow(test, 2));
    }

    @Test
    public void testResizeDoesNotChangeParameter() {
        ArrayResizer.resize(test);
        int[][] expected = {
                {1, 3, 2},
                {2, 1, 0},
                {4, 5, 6},
                {0, 0, 0}
        };
        check2DArray(expected, test);
    }

    @Test
    public void testResizeCreatesCorrectSizeArray() {
        int[][] original = {
                {2, 1, 0, 3},
                {1, 3, 2, 5},
                {4, 5, 6, 1}
        };
        int[][] resized = ArrayResizer.resize(original);
        Assert.assertEquals(2, resized.length);
        Assert.assertEquals(4, resized[0].length);
        Assert.assertEquals(4, resized[1].length);
    }

    @Test
    public void testResizeCopiesElementsFromParameter() {
        int[][] original = {
                {2, 1, 0, 3},
                {1, 3, 2, 5},
                {4, 5, 6, 1}
        };
        int[][] resized = ArrayResizer.resize(original);
        int[][] expected = {
                {1, 3, 2, 5},
                {4, 5, 6, 1}
        };
        check2DArray(expected, resized);
    }

    private void check2DArray(int[][] expected, int[][] actual) {
        for (int i = 0; i < expected.length; i++) {
            Assert.assertArrayEquals(expected[i], actual[i]);
        }
    }
}
