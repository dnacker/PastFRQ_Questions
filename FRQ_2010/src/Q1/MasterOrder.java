package Q1;

import java.util.ArrayList;
import java.util.List;

/**
 * Question 1.
 * TODO implement getTotalBoxes and removeVariety.
 */
public class MasterOrder {
    /** The list of all cookie orders */
    private List<CookieOrder> orders;

    /** Constructs a new MasterOrder object. */
    public MasterOrder() {
        orders = new ArrayList<CookieOrder>();
    }

    /** Adds theOrder to the master order.
     * @param theOrder the cookie order to add to the master order
     */
    public void addOrder(CookieOrder theOrder) {
        orders.add(theOrder);
    }

    /** @return the sum of the number of boxes of all of the cookie orders
     */
    public int getTotalBoxes() {
        //Your code for part (a)
        return 0;
    }

    /** Removes all cookie orders from the master order that have the same variety of
     * cookie as cookieVar and returns the total number of boxes that were removed.
     * @param cookieVar the variety of cookies to remove from the master order
     * @return the total number of boxes of cookieVar in the cookie orders removed
     */
    public int removeVariety(String cookieVar) {
        //Your code for part (b)
        return 0;
    }

    //IGNORE CODE BELOW (for testing purposes)
    public String toString() {
        return orders.toString();
    }
}
