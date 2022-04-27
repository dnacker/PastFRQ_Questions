package Q3;

/**
 * Question 3.
 */
public class MemberInfo
{
    /** Constructs a MemberInfo object for the club member with name name,
     * graduation year gradYear, and standing hasGoodStanding.
     */
    public MemberInfo(String name, int gradYear, boolean hasGoodStanding) {
        /* implementation not shown */
        this.name = name;
        this.gradYear = gradYear;
        this.goodStanding = hasGoodStanding;
    }
    /** Returns the graduation year of the club member. */
    public int getGradYear() {
        /* implementation not shown */
        return gradYear;
    }
    /** Returns true if the member is in good standing and false otherwise. */
    public boolean inGoodStanding() {
        /* implementation not shown */
        return goodStanding;
    }

    // There may be instance variables, constructors, and methods that are not shown.
    private String name;
    private int gradYear;
    private boolean goodStanding;

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof MemberInfo) {
            MemberInfo other = (MemberInfo) obj;
            return name.equals(other.name) &&
                    gradYear == other.gradYear &&
                    goodStanding == other.goodStanding;
        }
        return false;
    }
}
