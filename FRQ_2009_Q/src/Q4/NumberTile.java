package Q4;
/**
 * This class represents a NumberTile
 * Accessible methods are: rotate(), getLeft() and getRight().
 * No methods to implement here.
 */
import java.util.*;

public class NumberTile {
    private int[] numbers;

    /** Rotates the tile 90 degrees clockwise
     */
    public void rotate() {
        int last = numbers[numbers.length - 1];
        for (int i = numbers.length - 1; i > 0; i--) {
            numbers[i] = numbers[i - 1];
        }
        numbers[0] = last;
    }

    /** @return value at left edge of tile
     */
    public int getLeft() {
        return numbers[3];
    }

    /** @return value at right edge of tile
     */
    public int getRight() {
        return numbers[1];
    }

    //IGNORE CODE BELOW (for testing purposes)
    public NumberTile(int[] nums) {
        numbers = nums;
    }

    public String toString() {
        return Arrays.toString(numbers);
    }

    public boolean equals(Object o) {
        if (o instanceof NumberTile) {
            NumberTile other = new NumberTile(((NumberTile) o).numbers);
            boolean equal = false;
            for (int i = 0; i < 4; i++) {
                if (Arrays.equals(other.numbers, numbers)) {
                    equal = true;
                }
                other.rotate();
            }
        }
        return false;
    }
}
