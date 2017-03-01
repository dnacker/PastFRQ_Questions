package Q1;

import java.util.Arrays;

/**
 * Question 1.
 */
public class Sound {
    /** the array of values in this sound; guaranteed not to be null */
    private int[] samples;
    public Sound(int[] samples) {
        this.samples = samples;
    }

    /**
     * Changes those values in this sound that have an amplitude greater than limit
     * Values greater than limit are changed to limit.
     * Values less than -limit are changed to limit.
     * @param limit the amplitude limit
     *              Precondition: limit >= 0
     * @return the number of values in this sound that this method changed
     */
    public int limitAmplitude(int limit) {
        //your code for part (a)
        return 0;
    }

    /** Removes all silence from the beginning of this sound.
     * Silence is represented by a value of 0.
     * Precondition: samples contains at least one nonzero value
     * Postcondition: the length of samples reflects the removal of starting silence
     */
    public void trimSilenceFromBeginning() {
        //your code for part (b)
    }

    public String toString() {
        return Arrays.toString(samples);
    }

    /*
    public static void main(String[] args) {
        Sound test1 = new Sound(new int[]{40, 2532, 17, -2300, -17, -4000, 2000, 1048, -420, 33, 15, -32, 2030, 3223});
        Sound test2 = new Sound(new int[]{0, 0, 0, 0, -14, 0, -35, -39, 0, -7, 16, 32, 37, 29, 0, 0});

        System.out.println(test1);
        test1.limitAmplitude(2000);
        System.out.println(test1);

        System.out.println(test2);
        test2.trimSilenceFromBeginning();
        System.out.println(test2);
    }
    */
}
