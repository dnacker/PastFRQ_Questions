package Q3;

/**
 * Question 3
 * TODO implement getChargingCost and getChargeStartTime
 */
public class BatteryCharger {
    /** rateTable has 24 entries representing the charging costs for hours 0 through 23. */
    private int[] rateTable;

    public BatteryCharger(int[] rates) {
        rateTable = rates;
    }

    /** Determines the total cost to charge the battery starting at the beginning of startHour.
     * @param startHour the hour at which the charge period begins
     * Precondition: 0 ≤ startHour ≤ 23
     * @param chargeTime the number of hours the battery needs to be charged
     * Precondition: chargeTime > 0
     * @return the total cost to charge the battery
     */
    public int getChargingCost(int startHour, int chargeTime) {

        return 0;
    }

    /** Determines start time to charge the battery at the lowest cost for the given charge time.
     * @param chargeTime the number of hours the battery needs to be charged
     * Precondition: chargeTime > 0
     * @return an optimal start time, with 0 ≤ returned value ≤ 23
     */
    public int getChargeStartTime(int chargeTime) {

        return 0;
    }
}
