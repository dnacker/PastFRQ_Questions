package Q4;

/**
 * Write this class.
 */
public class Range implements NumberGroup {
    private int min;
    private int max;

    public Range(int min, int max) {
        this.min = min;
        this.max = max;
    }

    public boolean contains(int num) {
        return (min <= num) && (num <= max);
    }
}
