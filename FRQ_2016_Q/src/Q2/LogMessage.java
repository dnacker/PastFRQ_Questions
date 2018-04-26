package Q2;

/**
 * Question 2
 */
public class LogMessage {
    private String machineId;
    private String description;

    /** Precondition: message is a valid log message. */
    public LogMessage(String message) {
        /* to be implemented in part (a) */
    }

    /** Returns true if the description in this log message properly contains keyword
     *          false otherwise.
     */
    public boolean containsWord(String keyword) {
        /* to be implemented in part (b) */
        return false;
    }


    public String getMachineId() {
        return machineId;
    }
    public String getDescription() {
        return description;
    }
    public String toString() {
        return machineId + ":" + description;
    }
}
