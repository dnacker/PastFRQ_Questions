package Q1;

/**
 * This class represents a CookieOrder.
 * Usable methods: getVariety() and getNumBoxes().
 * No methods to implement here.
 */
public class CookieOrder {
    private String variety;
    private int numBoxes;

    /** Constructs a new CookieOrder object. */
    public CookieOrder(String variety, int numBoxes) {
        this.variety = variety;
        this.numBoxes = numBoxes;
    }

    /** @return the variety of cookie being ordered
     */
    public String getVariety() {
        return variety;
    }

    /** @return the number of boxes being ordered
     */
    public int getNumBoxes() {
        return numBoxes;
    }

    //IGNORE CODE BELOW (for testing purposes)
    public String toString() {
        return "[" + variety + ", " + numBoxes + "]";
    }
}
