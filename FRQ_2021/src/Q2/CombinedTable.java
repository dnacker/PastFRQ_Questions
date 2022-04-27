package Q2;

/**
 * Question 2.
 */
public class CombinedTable {
    private SingleTable table1;
    private SingleTable table2;

    public CombinedTable(SingleTable t1, SingleTable t2) {
        table1 = t1;
        table2 = t2;
    }

    public boolean canSeat(int numPeople) {
        return numPeople <= table1.getNumSeats() + table2.getNumSeats() - 2;
    }

    public double getDesirability() {
        double avgQuality = (table1.getViewQuality() + table2.getViewQuality()) / 2;
        if (table1.getHeight() == table2.getHeight()) {
            return avgQuality;
        }
        return avgQuality - 10;
    }
}
