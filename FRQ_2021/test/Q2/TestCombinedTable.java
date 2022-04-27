package Q2;

import org.junit.Assert;
import org.junit.Test;

public class TestCombinedTable {
    SingleTable t1 = new SingleTable(3, 70, 50);
    SingleTable t2 = new SingleTable(6, 70, 60);
    SingleTable t3 = new SingleTable(9, 75, 65);

    /* Uncomment these tests when you are done with Question 2.
    @Test
    public void testConstructorTakesTwoSingleTables() {
        CombinedTable combinedTable = new CombinedTable(t1, t2);
    }

    @Test
    public void testCanSeat() {
        checkSeats(t1, t2, 7);
        checkSeats(t1, t3, 10);
        checkSeats(t2, t3, 13);
    }

    @Test
    public void testGetDesirabilitySameHeight() {
        CombinedTable combinedTable = new CombinedTable(t1, t2);
        Assert.assertEquals(55, combinedTable.getDesirability(), 0.0);
    }

    @Test
    public void testGetDesirabilityDifferentHeights() {
        CombinedTable combinedTable = new CombinedTable(t1, t3);
        Assert.assertEquals(47.5, combinedTable.getDesirability(), 0.0);
    }

    private void checkSeats(SingleTable t1, SingleTable t2, int maxSeats) {
        CombinedTable combinedTable = new CombinedTable(t1, t2);
        for (int i = 1; i <= 100; i++) {
            Assert.assertEquals(i <= maxSeats, combinedTable.canSeat(i));
        }
    }
     */
}
