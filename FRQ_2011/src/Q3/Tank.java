package Q3;

/**
 * IGNORE THIS CLASS
 * Implementation of FuelTank interface
 */
public class Tank implements FuelTank {
    private int amt;

    public Tank(int amt) {
        this.amt = amt;
    }

    public int getFuelLevel() {
        return amt;
    }

    public String toString() {
        return "" + amt;
    }
}
