package Q1;

/**
 * Question 1
 */
public class FrogSimulation {
    /** Distance, in inches from the starting position to the goal. */
    private int goalDistance;

    /** Maximum number of hops allowed to reach the goal. */
    private int maxHops;

    /** IGNORE THESE VARIABLES (FOR TESTING PURPOSES) */
    private int[] hops;
    private int step;

    /** Constructs a FrogSimulation where dist is the distanct, in inches from the starting
     * position to the goal, and numHops is the maximum number of hops allowed to reach the goal.
     * Precondition: dist > 0; numHops > 0
     */
    public FrogSimulation(int dist, int numHops, int[] hops) {
        goalDistance = dist;
        maxHops = numHops;
        /** IGNORE THESE VARIABLES (FOR TESTING PURPOSES) */
        this.hops = hops;
        step = 0;
    }

    /** Returns an integer representing the distance, in inches, to be moved when the frop hops.
     */
    private int hopDistance() {
        return hops[step++];
    }

    /** Simulates a frog attempting to reach the goal as described in part (a).
     *  Returns true if the frog successfully reached or passed the goal during the simulation;
     *          false otherwise.
     */
    public boolean simulate() {
        /* to be implemented in part (a) */
        return false;
    }

    /** Runs num simulations and returns the proportion of simulations in which the frog
     *  successfully reached or passed the goal.
     *  Precondition: num > 0
     */
    public double runSimulations(int num) {
        /* to be implemented in part (b) */
        return 0;
    }
}
